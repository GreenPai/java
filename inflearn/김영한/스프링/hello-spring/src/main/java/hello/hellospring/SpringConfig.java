package hello.hellospring;


import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 스프링 설정
 */
@Configuration
public class SpringConfig {

    // private final MemberRepository memberRepository;

    // @Autowired
//    public SpringConfig(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }


    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }


    /**
     *  DI, AOP
     *  기존 코드는 바꾸지 않고 설정에서 바꿈으로서 데이터베이스가 변경된다.
     */
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
//        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);

    }
}
