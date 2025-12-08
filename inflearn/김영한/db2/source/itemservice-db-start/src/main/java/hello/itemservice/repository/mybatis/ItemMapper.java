package hello.itemservice.repository.mybatis;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemSearchCond;
import hello.itemservice.repository.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

/**
 * MyBatis 스프링 연동 모듈 -> @Mapper 조회
 * 해당 인터페이스를 발견하면 ItemMapper 인터페이스 구현체를 만든다.(proxy)
 * 생성된 동적 프록시 객체를 스프링 빈으로 등록
 * --> ItemRepositoryTest에서 프록시가 생성되는 것을 확인할 수 있음.
 */

@Mapper
public interface ItemMapper {

    void save(Item item);

    void update(@Param("id") Long id, @Param("updateParam") ItemUpdateDto updateParam);

    List<Item> findAll(ItemSearchCond itemSearch);

    Optional<Item> findById(Long id);

}