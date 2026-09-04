package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import java.util.List;
import java.util.Optional;


public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();

    /*
     findById(Long id); 같은 것을 할때 Null 이 들어올 수 있는데 이때
     자바8에서 널을 감싸는 것을 Optional 이라고 한다.
     */

}
