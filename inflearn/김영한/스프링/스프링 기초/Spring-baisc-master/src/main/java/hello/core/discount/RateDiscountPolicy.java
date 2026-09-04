package hello.core.discount;

import hello.core.annotation.MainDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


// @Primary

/**
 * 비율 할인
 * VVIP는 커스텀. 추가한것.
 */
@Component
// @Primary
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return price * discountPercent / 100;
        }else if(member.getGrade() == Grade.VVIP){
            return price * (discountPercent+10) / 100 ;
        } else {
            return 0;
        }
    }
}
