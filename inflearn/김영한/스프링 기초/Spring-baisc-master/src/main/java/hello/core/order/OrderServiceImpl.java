package hello.core.order;

import hello.core.annotation.MainDiscountPolicy;
import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
* RequiredArgsConstructor은  OrderServiceImpl 객체에 final이 붙은 것을 생성자를 만들어준다.
* */
@Component
// @RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    /**
     * Autowire에서 DiscountPolicy가 2개의 Bean이 잡히는 경우
     * 오류 발생
     * 
     * 문제 해결 방법: 
     * 필드명 매칭, Qualifier, Primary사용(우선순위 지정.)
     */

    /**
     *  필드명 매칭
     *  빈이 2개 일 때 스프링 컨테이너에서 변수의 이름을 보고 검색을 한다.
     */

//    @Autowired
//    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy rateDiscountPolicy) {
//        this.memberRepository = memberRepository;
//        this.discountPolicy = rateDiscountPolicy;
//    }


    /**
     * Qualifier -> 2개가 지정되어 오류가 발생했을 때 이름을 지정해서 들고오는 방식
     */

    /*
    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, @Qualifier("mainDiscountPolicy") DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }
    */

    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, @MainDiscountPolicy DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        // 할인에 대한 정책을 discountPolicy에 시킴으로서
        // 단일책임의 원칙을 잘 설계한 것이다. SRP
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    //테스트 용도
    public MemberRepository getMemberRepository(){
        return memberRepository;
    }

}
