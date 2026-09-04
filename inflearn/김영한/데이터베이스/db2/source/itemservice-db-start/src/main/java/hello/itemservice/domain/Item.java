package hello.itemservice.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity // -> JPA가 사용하는 객체라는 뜻. 애노테이션이 있어야 JPA 인식 가능하다.
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 객체의 필드를 테이블의 컬럼로 매핑한다.
    @Column(name = "item_name", length = 10)
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
