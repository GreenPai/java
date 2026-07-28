package hello.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import static org.springframework.context.annotation.ComponentScan.*;

/**
 * 컴포넌트 스캔과 의존관계 자동 주입 시작하기
 */

@Configuration
@ComponentScan(
        // basePackage -> 탐색 범위 지정, 현재는 맵버만 검색
        /**
        basePackages = "hello.core.member",
        basePackageClasses = AutoAppConfig.class,
        **/

        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {


}
