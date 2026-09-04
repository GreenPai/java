package hello.itemservice.repository;

import hello.itemservice.domain.Item;

import java.util.List;
import java.util.Optional;

public interface ItemRepository {

    Item save(Item item);

    void update(Long itemId, ItemUpdateDto updateParam);

    Optional<Item> findById(Long id);

    // ItemSearchCond -> 검색 조건
    /*
    * private String itemName; private Integer maxPrice;
    * 이름과 최대 가격을 받는 변수
    * */
    List<Item> findAll(ItemSearchCond cond);

}
