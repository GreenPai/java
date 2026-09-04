package hello.itemservice.repository;

import lombok.Data;

/**
 * 검색 조건으로 사용한다는 규칙을 정했다.
 * DTO로 붙여도되지만 Cond를 이용해서 이름으로서 추측을 할 수 있도록 했다.
 *
 * 왜 리포지토리 패키지에 있는가?
 * 리포지토리에서 주로 사용하기 때문에
 * DTO를 제공하는 제일 마지막 단에 위치하면 된다.
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
