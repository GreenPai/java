package hello.core.autowired;

import hello.core.member.Member;
import jakarta.annotation.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean {

        // Member은 스프링 빈에 의해서 관리되지 않는 것이다.
        // 스프링 컨테이너에 관련 없는 것을 주입햇을 때 생기는 오류에 대한 테스트

        // required = false를 제외하면 오류가 난다. -> Member가 등록이 되어있지 않기 때문// 밑의 코드를 실행하면 null이 나온다.
        @Autowired(required = false)
        public void setNoBean1(Member noBean1) {
            System.out.println("noBean1 = " + noBean1);
        }

        // 밑의 코드를 실행하면 null이 나온다.
        @Autowired
        public void setNoBean2(@Nullable Member noBean2) {
            System.out.println("noBean2 = " + noBean2);
        }

        // 밑의 코드를 실행하면 Optional.empty
        @Autowired
        public void setNoBean3(Optional<Member> noBean3) {
            System.out.println("noBean3 = " + noBean3);
        }
    }
}