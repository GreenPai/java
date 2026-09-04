package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 *  Groups 전까지는 밑의 주석을 풀고
 *  Form 전송 객체 분리를 할 때는 밑에 코드들을 주석을 해줍니다.
 *  이유는 사용하지 않기 때문에.
 *
 *  이후 사용하는 Form의 위치는 web/validation/form에 있습니다.
 */

@Data
// @ScriptAssert(lang = "javascript", script = "_this.price * _this.quantity >= 10000", message = "총합이 10000원 넘게 입력해주세요.")
/**
 * @ScriptAssert(lang = "javascript", script = "_this.price * _this.quantity >= 10000", message = "총합이 10000원 넘게 입력해주세요.")
 * 는 권장 하지 않는다. 자바 코드로 하는 것을 더 권장하는 편이다.
 */
public class Item {

    /**
     * V4 버전에서 애노테이션 주석
     * 이유: form을 저장용, 수정용 따로 구현
     */
    
    // @NotNull(groups = UpdateCheck.class) // 수정요구 사항
    private Long id;

    //  @NotBlank(groups = {SaveCheck.class, UpdateCheck.class})
    private String itemName;

    // @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
    // @Range(min = 1000, max = 1000000)
    private Integer price;

    // @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
    // @Max(value = 9999, groups = {SaveCheck.class}) //수정 요구사항 추가
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
