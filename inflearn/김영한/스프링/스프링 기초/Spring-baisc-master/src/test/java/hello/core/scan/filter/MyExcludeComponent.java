package hello.core.scan.filter;
import java.lang.annotation.*;

/**
 * 필터
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
}