package hello.itemservice.domain;

import hello.itemservice.repository.ItemRepository;
import hello.itemservice.repository.ItemSearchCond;
import hello.itemservice.repository.ItemUpdateDto;
import hello.itemservice.repository.memory.MemoryItemRepository;
import jakarta.persistence.Column;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 테스트를 할 때 데이터베이스를 연결하기 위한
 * test 폴더의 resources의 application.properties에서 다시 설정
 *
 */

/**
 * SpringBootTest는 @SpringBootApplication를 찾아서 설정으로 사용한다.
 *
 */

/**
 *  @Transactional
 *  스프링이 제공하는 @Transactional 어노테이션은 로직이 수행되면 커밋하도록 동작한다.
 *  애노테이션을 테스트에서 사용하면 테스트가 끝났을 때 롤백하는 기능을 제공한다.
 *
 *  만약 전체에 적용을 하고 싶다면
 *  @Transactional
 *  @SpringBootTest
 *
 *  하나씩 적용하고 싶다면
 *  @Test
 *  @SpringBootTest
*     void save() {
*      }
 */

@Transactional
@SpringBootTest
class ItemRepositoryTest {

    @Autowired
    ItemRepository itemRepository;

    /**
     * 트랜잭션 관리자는 PlatformTransactionManager 를 주입 받아서 사용하면 된다.
     * 스프링 부트는 자동으로 트랜잭션 매니저를 스프링 빈으로 등록해준다.
     *
     * @BeforeEach : 각각의 테스트 케이스를 실행하기 직전에 호출된다.
     * transactionManager.getTransaction(new DefaultTransactionDefinition()); : 트랜잭션 실행
     *
     * @AfterEach : 각각의 테스트 케이스가 완료된 직후에 호출된다. 여기서 트랜잭션을 롤백
     * transactionManager.rollback(status); : 트랜잭션을 롤백
     */

    /*
    @Autowired
    PlatformTransactionManager transactionManager;
    TransactionStatus status;


    @BeforeEach
    void beforeEach() {
        // 트랙잰션 시작
        status = transactionManager.getTransaction(new DefaultTransactionDefinition());
    }
*/

    @AfterEach
    void afterEach() {
        //MemoryItemRepository 의 경우 제한적으로 사용
        if (itemRepository instanceof MemoryItemRepository) {
            ((MemoryItemRepository) itemRepository).clearStore();
        }
        
        // 트랜잭션 롤백
        // transactionManager.rollback(status);
    }

    // 상품 저장 후 검증
    @Test
    void save() {
        //given
        Item item = new Item("itemA", 10000, 10);

        //when
        Item savedItem = itemRepository.save(item);

        //then
        Item findItem = itemRepository.findById(item.getId()).get();
        assertThat(findItem).isEqualTo(savedItem);
    }

    // 상품 변경 후 검증
    @Test
    @Commit
    void updateItem() {
        //given
        Item item = new Item("item1", 10000, 10);
        Item savedItem = itemRepository.save(item);
        Long itemId = savedItem.getId();

        //when
        ItemUpdateDto updateParam = new ItemUpdateDto("item2", 20000, 30);
        itemRepository.update(itemId, updateParam);

        //then
        Item findItem = itemRepository.findById(itemId).get();
        assertThat(findItem.getItemName()).isEqualTo(updateParam.getItemName());
        assertThat(findItem.getPrice()).isEqualTo(updateParam.getPrice());
        assertThat(findItem.getQuantity()).isEqualTo(updateParam.getQuantity());
    }

    // 상품을 찾고 검증
    /**
     * 한번 더 실행을 했을 때. 데이터가 이미 있는 상태로 저장하고
     * 저장된 데이터가 호출했을때 여러개 호출되기 때문에 오류가 생김.
     */

    /**
     * 테스트는 다른 테스트와 격리해야한다.
     * 테스트는 반복해서 실행할 수 있어야한다.
     * 만약 delete로 지우는 로직을 추가한다면 어떻게 될까? 
     * 갑자기 오류 발생이나 진행되는 시점에서 인텔리제이가 종료된다면 데이터가 지워지지 않고
     * 찌꺼기가 남아 있어서 문제가 생긴다.
     * ////////////////////////////
     * 해결법 : 커밋, 롤백
     */

    @Test
    void findItems() {
        //given
        Item item1 = new Item("itemA-1", 10000, 10);
        Item item2 = new Item("itemA-2", 20000, 20);
        Item item3 = new Item("itemB-1", 30000, 30);

        itemRepository.save(item1);
        itemRepository.save(item2);
        itemRepository.save(item3);

        //둘 다 없음 검증
        test(null, null, item1, item2, item3);
        test("", null, item1, item2, item3);

        //itemName 검증
        test("itemA", null, item1, item2);
        test("temA", null, item1, item2);
        test("itemB", null, item3);

        //maxPrice 검증
        test(null, 10000, item1);

        //둘 다 있음 검증
        test("itemA", 10000, item1);
    }

    void test(String itemName, Integer maxPrice, Item... items) {
        List<Item> result = itemRepository.findAll(new ItemSearchCond(itemName, maxPrice));
        assertThat(result).containsExactly(items);
    }
}
