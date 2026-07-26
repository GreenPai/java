package hello.core.discount;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.order.AppConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
class RateDiscountPolicyTest {
    
    // RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    DiscountPolicy discountPolicy;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        discountPolicy = appConfig.discountPolicy();
    }
    
    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다.")
    void vip_o() {
        //given
        Member member = new Member(1L, "memberVIP", Grade.VIP);
        //when
        int discount = discountPolicy.discount(member, 10000);
        //then
        assertThat(discount).isEqualTo(1000);
    }
    
    @Test
    @DisplayName("VIP가 아니면 할인이 적용되지 않아야 한다.")
    void vip_x() {
        //given
        Member member = new Member(2L, "memberBASIC", Grade.BASIC);
        //when
        int discount = discountPolicy.discount(member, 10000);
        //then
        assertThat(discount).isEqualTo(0);
    }
    
    @Test
    @DisplayName("커스텀 : VVIP 는 20% 적용.")
    void vip_v(){
        //given
        Member member = new Member(3L, "memVip", Grade.VVIP);
        //when
        int discount = discountPolicy.discount(member, 20000);
        // then
        assertThat(discount).isEqualTo(4000);

        System.out.println(discountPolicy.getClass().getName().contains("Rate"));
        System.out.println(discountPolicy.getClass().getName());

    }
}