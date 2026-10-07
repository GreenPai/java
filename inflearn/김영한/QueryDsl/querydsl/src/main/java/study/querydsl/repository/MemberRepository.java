package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import study.querydsl.entity.Member;

import java.util.List;

/**
 * findById, findAll, findByUsername 같은 것은 여기서 사용 가능
 * 하지만 동적 쿼리는 안됨. -> 사용자 정의 리포지토리
 *
 * QuerydslPredicateExecutor<Member> : QueryDsl에 클라이언트가 의존적이게 된다. / 조인 X
 */
public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom, QuerydslPredicateExecutor<Member> {

    // select m from Member m where m.username = ?
    List<Member> findByUsername(String username);

}
