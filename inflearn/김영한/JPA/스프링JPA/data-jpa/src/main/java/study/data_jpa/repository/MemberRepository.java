package study.data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import study.data_jpa.dto.MemberDto;
import study.data_jpa.entity.Member;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByUsernameAndAgeGreaterThan(String username, int age);

    List<Member> findHelloBy();

    List<Member> findDistinctHelloBy();

    List<Member> findTop3HelloBy();

    /**
     * 엔티티의 findByUsername 명의 네임드 쿼리를 찾아서 적용한다.
     *   - 네임드쿼리를 잘 안쓴다. - 리포지토리에 바로 적용할 수 있는 것을 주로 사용
     *
     *  네이밍 쿼리의 장점: 컴파일 시 에러를 잡을 수 있다.
     *  JPQL로 적은 쿼리는 실행 시점에 에러를 발견할 수 있다.
     */
    // @Query(name = "Member.findByUsername")
    List<Member> findByUsername(@Param("username") String username);

    /**
     * 주로 사용하는 네이밍쿼리 방식
     */
    @Query("select m from Member m where m.username = :username and m.age = :age")
    List<Member> findUser(@Param("username") String username, @Param("age") int age);

    @Query("select m.username from Member m")
    List<String> findUsernameList();

    @Query("select new study.data_jpa.dto.MemberDto(m.id, m.username, t.name) from Member m join m.team t")
    List<MemberDto> findMemberDto();

    @Query("select m from Member m where m.username in :names")
    List<Member> findByNames (@Param("names") Collection<String> names);




}
