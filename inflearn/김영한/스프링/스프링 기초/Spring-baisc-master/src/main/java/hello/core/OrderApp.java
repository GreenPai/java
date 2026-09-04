package hello.core;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.order.AppConfig;
import hello.core.order.Order;
import hello.core.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {

        /**
         * AppConfig로 구체적인 것을 대입하는 부분을 따로 구분
         */

        /**
         * AppConfig로 대입하는 방식
         */
        
        /*
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();
        */

        /**
         * 스프링에서 관리하는 방식
         */

        // 스프링 컨텍스트에 AppConfig 넣기
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // 기존과 다르게 AppConfig가 아닌 스프링 컨텍스트의 applicationContext에서 호출
        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
    }
}