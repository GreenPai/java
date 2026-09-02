package jpabook.jpashop.api;

import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderSearch;
import jpabook.jpashop.domain.OrderStatus;
import jpabook.jpashop.repository.OrderRepository;
import jpabook.jpashop.repository.order.simplequery.OrderSimpleQueryDto;
import jpabook.jpashop.repository.order.simplequery.OrderSimpleQueryRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * xToOne(ManyToOne, OneToOne)
 * Order
 * Order -> Member
 * Order -> Delivery
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class OrderSimpleApiController {

    /**
     * V1 : 엔티티 직접 조회
     * V2 : DTO 활용
     */
    
    private final OrderRepository orderRepository;
    private final OrderSimpleQueryRepository orderSimpleQueryRepository;

    /***
     * 엔티티 직접 노출을 할 때는 @JsonIngore을 해줘야 된다. -> 무한 루프 걸린다.
     * 외부에서 API 응답으로 엔티티를 노출하는 것 보다 DTO를 보내주는것이 좋다.
     * @return
     */
    @GetMapping("/api/v1/simple-orders")
    public List<Order> orderV1(){
        List<Order> all = orderRepository.findAllByString(new OrderSearch());
        log.info("all = {}" , all);

        for(Order order : all){
            order.getMember().getName(); // Lazy 강제 초기화
            order.getDelivery().getAddress(); // Lazy 강제 초기화
        }
        return all;
    }

    /**
     * 현재 Orders을 조회하는 쿼리 실행 : 1번
     * Order가 2번이기에 DTO를 생성하는 과정에서 
     * Member, Delivery 조회 쿼리 2번씩 실행
     * 1 + 2 * 2 = 5 -> 5번 쿼리발생
     * 
     * 같은 멤버를 조회하는 경우. 1번 줄어듬
     */
    @GetMapping("/api/v2/simple-orders")
    public List<SimpleOrderDto> orderV2(){
        List<Order> orders = orderRepository.findAllByString(new OrderSearch());

        List<SimpleOrderDto> collect = orders.stream()
                .map(o -> new SimpleOrderDto(o))
                .collect(Collectors.toList());

        return collect;
    }

    /**
     * 패치 조인 활용
     * 쿼리문 1번 실행
     */
    @GetMapping("/api/v3/simple-orders")
    public List<SimpleOrderDto> orderV3(){
        List<Order> orders = orderRepository.findAllWithMemberDelivery();


        return orders.stream()
                .map(o -> new SimpleOrderDto(o))
                .collect(Collectors.toList());
    }

    /**
     * 성능적으로는 좋으나
     * 재사용성이 v3에 비해 안좋다.
     * 쿼리 부분에서 DTO를 조회했기에 DTO 전용이다.
     *
     * 트레이드오프를 생각해야된다. 필드가 너무나 많다면 고려할만하다.
     */
    @GetMapping("/api/v4/simple-orders")
    public List<OrderSimpleQueryDto> orderV4(){
        return orderSimpleQueryRepository.findOrderDtos();
    }


    @Data
    static class  SimpleOrderDto{
        private Long orderId;
        private String name;
        private LocalDateTime orderDate;
        private OrderStatus orderStatus;
        private Address address;

        public SimpleOrderDto(Order order){
            orderId = order.getId();
            name = order.getMember().getName(); //LAZY 초기화
            orderDate = order.getOrderDate();
            orderStatus = order.getStatus();
            address = order.getDelivery().getAddress(); //LAZY 초기화
        }
    }
}
