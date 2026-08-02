package hello.itemservice.domain.item;

import lombok.Data;

/**
 * 주요 도메인은 Data를 사용하는 것을 권장하지 않는다.
 *
 * 재미나이 피셜 이유
 * JPA에서 ToString으로 인한 StackOverFlow가 발생할 수 있다.
 */
@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
