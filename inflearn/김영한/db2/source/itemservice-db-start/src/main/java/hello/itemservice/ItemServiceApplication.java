package hello.itemservice;

import hello.itemservice.config.*;
import hello.itemservice.repository.ItemRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

//@Import(JdbcTemplateV1Config.class)
//@Import(JdbcTemplateV2Config.class)
@Import(JdbcTemplateV3Config.class)
// @Import(MemoryConfig.class)

/**
 * @SpringBootApplication(scanBasePackages = "hello.itemservice.web")
 * 스프링 부트 애플리케이션의 시작점임을 표시.
 * 기본적으로 @SpringBootApplication이 선언된 패키지(hello.itemservice) 하위 전체를 스캔하지만, 여기서는 hello.itemservice.web만 스캔하도록 지정했어요.
 */
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

}
