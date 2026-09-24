package study.data_jpa.repository;

/**
 * Projection
 * 단순한 username을 조회 할 때 사용하면 좋다.
 *
 * NestedClosedProjections에서 Team을 조회할 때는 LeftJoin을 한다.
 * 팀 엔티티 모두를 조회하기에 이럴때는 비효율적이다. 이때는 QueryDsl
 */

public interface NestedClosedProjections {

    String getUsername();
    TeamInfo getTeam();

    interface TeamInfo{
        String getName();
    }

}
