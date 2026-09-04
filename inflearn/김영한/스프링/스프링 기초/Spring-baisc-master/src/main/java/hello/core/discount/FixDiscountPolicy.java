package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 할인 구현체
 * - 정액 할인 정책
 */
@Component
public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000; //1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return discountFixAmount;
        } else if(member.getGrade() == Grade.VVIP){
            return discountFixAmount + 1000;
        } else{
            return 0;
        }
    }
}
