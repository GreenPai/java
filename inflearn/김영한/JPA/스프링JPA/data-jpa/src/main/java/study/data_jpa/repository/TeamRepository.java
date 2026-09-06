package study.data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.data_jpa.entity.Team;

/**
 * 프록시 객체를 만들어서 @Repository 어노테이션을 넣어준다.
 */
public interface TeamRepository extends JpaRepository<Team, Long> {

}
