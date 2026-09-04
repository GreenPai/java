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

/**
 * scanBasePackages = "hello.itemservice.web -> 컨트롤러만 스캔 영역에 넣는다.
 */
@Slf4j
//@Import(MemoryConfig.class)
// @Import(JdbcTemplateV1Config.class)
//@Import(JdbcTemplateV2Config.class)
//@Import(JdbcTemplateV3Config.class)
//@Import(MybatisConfig.class)
//@Import(JpaConfig.class)
//@Import(SpringDataJpaConfig.class)
//@Import(QueryDslConfig.class)
@Import(V2Config.class)
@SpringBootApplication(scanBasePackages = "hello.itemservice.web")
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	/**
	 *  application.properties에서 설정한 프로필 이름을 실행
	 *  프로필 이름이 다르면 오류가 생긴다.
	 */
	@Bean
	@Profile("local")
	public TestDataInit testDataInit(ItemRepository itemRepository) {
		return new TestDataInit(itemRepository);
	}


	/**
	 * application.properties에 따로 설정 하지않으면
	 * 메모리 DB 모드로 실행이 되기 때문에 굳이 설정하지 않아도 된다.
	 */
		//
	//	@Bean
	//	@Profile("test")
	//	public DataSource dataSource(){
	//		log.info("메모리 데이터 베이스 초기화");
	//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
	//		dataSource.setDriverClassName("org.h2.Driver");
	//		dataSource.setUrl("jdbc:h2:mem:db;DB_CLOSE_DELAY=-1");
	//		dataSource.setUsername("sa");
	//		dataSource.setPassword("");
	//		return dataSource;
	//	}

}
