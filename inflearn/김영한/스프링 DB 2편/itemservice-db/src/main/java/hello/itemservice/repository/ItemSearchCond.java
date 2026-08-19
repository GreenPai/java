package hello.itemservice.repository;

import lombok.Data;

/**
 * 검색 조건으로 사용한다는 규칙을 정했다.
 * DTO로 붙여도되지만 Cond를 이용해서 이름으로서 추측을 할 수 있도록 했다.
 */
@Data
public class ItemSearchCond {

    private String itemName;
    private Integer maxPrice;

    public ItemSearchCond() {
    }

    public ItemSearchCond(String itemName, Integer maxPrice) {
        this.itemName = itemName;
        this.maxPrice = maxPrice;
    }
}
