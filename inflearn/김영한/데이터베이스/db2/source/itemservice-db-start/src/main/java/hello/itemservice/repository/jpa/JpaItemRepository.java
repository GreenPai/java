package hello.itemservice.repository.jpa;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemRepository;
import hello.itemservice.repository.ItemSearchCond;
import hello.itemservice.repository.ItemUpdateDto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;


/***
 * 트랜잭션은 서비스 계층에서 걸어주는 것이 맞다.
 * 현재는 서비스 계층이 없기 때문에 리포지토리에 트랜잭션을 걸어줬다.
 */

@Slf4j
@Repository
@Transactional
public class JpaItemRepository implements ItemRepository {

    private final EntityManager em;

    public JpaItemRepository(EntityManager em) {
        this.em = em;
    }

    /**
     * persist를 사용해서 저장.
     */
    @Override
    public Item save(Item item) {
        em.persist(item);
        return item;
    }


    /**
     *  update는 언제 방영이 될까?
     *  트렌잭션이 실행될 때. 바뀐 부분에 대해서 자동으로 업데이트를 해준다.
     */
    @Override
    public void update(Long itemId, ItemUpdateDto updateParam) {
        Item findItem = em.find(Item.class, itemId);
        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());
    }

    /**
     * 단건 조회
     * JPA에서 엔티티 객체를 PK 기준으로 조회할 때는 find() 를 사용하고 조회 타입과. PK값을 주면 된다.
     */
    @Override
    public Optional<Item> findById(Long id) {
        Item item = em.find(Item.class, id);
        return Optional.ofNullable(item);
    }

    /**
     * 목록 조회
     * JPA는 JPQL(Java Persistence Query Language)이라는 객체지향 쿼리 언어를 제공한다.
     *
     * JPA를 사용해도 동적 쿼리 문제가 발생한다. 이 땨ㅐ Querydsl도 함께 사용한다.
     */
    @Override
    public List<Item> findAll(ItemSearchCond cond) {
        String jpql = "select i from Item i";

        Integer maxPrice = cond.getMaxPrice();
        String itemName = cond.getItemName();

        if (StringUtils.hasText(itemName) || maxPrice != null) {
            jpql += " where";
        }

        boolean andFlag = false;
        if (StringUtils.hasText(itemName)) {
            jpql += " i.itemName like concat('%',:itemName,'%')";
            andFlag = true;
        }

        if (maxPrice != null) {
            if (andFlag) {
                jpql
                        += " and";
            }
            jpql += " i.price <= :maxPrice";
        }

        log.info("jpql={}", jpql);

        TypedQuery<Item> query = em.createQuery(jpql, Item.class);
        if (StringUtils.hasText(itemName)) {
            query.setParameter("itemName", itemName);
        }
        if (maxPrice != null) {
            query.setParameter("maxPrice", maxPrice);
        }
        return query.getResultList();
    }
}
