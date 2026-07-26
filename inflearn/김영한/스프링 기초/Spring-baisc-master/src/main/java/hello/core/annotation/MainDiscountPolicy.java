package hello.core.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;


/**
 *  @Qualifier("mainDiscountPolicy") 를 사용할 시 오류가 발생하면 컴파일 오류가 나지 않는다. -> 오류를 찾기 힘들다.
 *  @Qualifier("mainDiscountPolicy")로 지정하고 다른 곳에서 @Qualifier("mmainDiscountPolicy") 식으로 오타 나면 찾기 힘들다는것.
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Qualifier("mainDiscountPolicy")
public @interface MainDiscountPolicy {

}
