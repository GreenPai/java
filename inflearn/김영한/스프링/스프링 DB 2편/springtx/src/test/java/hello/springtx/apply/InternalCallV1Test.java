package hello.springtx.apply;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 * 프록시 내부 호출 테스트
 * 테스트 결과
 * : external 테스트에서this.internal(); 를 호출 했을 때
 *   트랜잭션을 적용되지 않는 문제 발생
 *
 * 이유:
 * this로 바로 호출했기 때문에 트랜잭션 적용 X
 * 트랜잭션 적용하기 위해서 프록시를 거쳐야되는데, this를 통해 실제 메서드를 호출하기에
 * 트랜잭션이 적용이 안된다.
 */
@Slf4j
@SpringBootTest
public class InternalCallV1Test {

    @Autowired
    CallService callService;

    @Test
    void printProxy() {
        log.info("callService class={}", callService.getClass()); // 프록시
    }

    //true
    @Test
    void internalCall() {
        callService.internal();
    }

    //false
    @Test
    void externalCall() {
        callService.external();
    }

    @TestConfiguration
    static class InternalCallV1TestConfig {

        @Bean
        CallService callService() {
            return new CallService();
        }
    }

    @Slf4j
    static class CallService {

        // 트랜잭션 X
        public void external() {
            log.info("call external");
            printTxInfo();
            this.internal();
        }

        // 트랜잭션 O
        @Transactional
        public void internal() {
            log.info("call internal");
            printTxInfo();
        }

        private void printTxInfo() {
            boolean txActive = TransactionSynchronizationManager.isActualTransactionActive();
            log.info("tx active={}", txActive);
        }
    }
}
