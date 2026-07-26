package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 기존 방식에서는 추상화 + 구체화로서 OCP, DIP를 지킬 수 없었다.
 * AppConfig를 사용하여 외부에서 선언해줍으로서 연결을 더욱 자연스럽게 해준다.
 *
 */
@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(),discountPolicy());

    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
        //    return new FixDiscountPolicy();
    }

}
