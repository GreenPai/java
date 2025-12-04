package hello.itemservice;

import hello.itemservice.config.*;
import hello.itemservice.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

//@Import(JdbcTemplateV1Config.class)
//@Import(JdbcTemplateV2Config.class)
//@Import(JdbcTemplateV3Config.class)
//@Import(MemoryConfig.class)
@Import(MyBatisConfig.class)

/**
 * @SpringBootApplication(scanBasePackages = "hello.itemservice.web")
 * 스프링 부트 애플리케이션의 시작점임을 표시.
 * 기본적으로 @SpringBootApplication이 선언된 패키지(hello.itemservice) 하위 전체를 스캔하지만, 여기서는 hello.itemservice.web만 스캔하도록 지정했어요.
 */
@Slf4j
@SpringBootApplication(scanBasePackages = "hello.itemservice.web")
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	@Bean
	@Profile("local")
	public TestDataInit testDataInit(ItemRepository itemRepository) {
		return new TestDataInit(itemRepository);
	}

    /**
     * @Profile("test") 
     * 프로필이 test 인 경우에만 데이터소스를 스프링 빈으로 등록한다.
     * 테스트 케이스에서마니 스트링 빈으로 등록해서 사용한다고 선언
     * ------------------------------------------------------
     * dataSource()
     * jdbc:h2:mem:db : 데이터소스를 만들 때 임베디드 모드(메모리 모드)로 동작하는 h2 데이터베이스를 사용할 수 있다.
     * DB_CLOSE_DELAY=-1 : 임베디드 모드에서 데이터베이스 커넥션 연결이 모두 끊어지면 데이터베이스도 종료되는데 그것을 방지하는 서정
     */


    /**
     * 테스트케이스에서 임베디드 모드를 사용 할 때
     * 생길 수 있는 문제점
     * 데이터베이스에서 메모리모드로 새로 생성하기 때문에 테이블이 없을 수 있다.
     * test/resources/schema.sql 에서 생성을 할 수 있다/
     * */

    /**
     * 밑의 코드를 사용하지 않고 test 폴더의 application.properties 에서 설정해도 된다.
     */
/*
    @Bean
    @Profile("test")
    public DataSource dataSource(){


        log.info("메모리 데이터베이스 초기화");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:db;DB_CLOSE_DELAY=-1");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }
*/

}
