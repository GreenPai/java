package jpabook.jpashop.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id @GeneratedValue
    @Column (name = "ORDER_ID")
    private Long id;

    @Column (name = "MEMBER_ID")
    private Long memberId;

    private Member member;

    private LocalDateTime orderDate;
    // ORDER_DATE, order_date -> 데이터베이스 관례
    // 스프링 부트에서 jpa를 사용할 때 orderDate 카멜 형식을 order_date 형식으로 바꾸는 것을 지원해준다.

    // 김영한 강사는 스프링 부트에서 지원하는 방식인 order_date 형식으로 바꾸는 것을 선호한다.

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

}
