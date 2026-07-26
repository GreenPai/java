package hello.core;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.order.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * 테스트를 하기 위한 Class
 * 효율성이 떨어지므로 JUnit를 사용 (테스트 코드)
 * test/member/MemberServiceTest
 */

public class MemberApp {
    public static void main(String[] args) {

        // 스프링 컨텍스트에 AppConfig 넣기
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        
        // 기존과 다르게 AppConfig가 아닌 스프링 컨텍스트의 applicationContext에서 호출
        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);


        /*
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
         */

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}