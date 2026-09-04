package hello.jdbc.repository;

import hello.jdbc.domain.Member;

import java.sql.SQLException;

/**
 * 체크 예외 인터페이스
 * 인터페이스에서 선언되어 있는 에러를 던질 수 있다.
 *
 * 인터페이스는 향 후 변화에 대해서 자유롭기 위함인데 에러 메시지에 종속적이다.
 */
public interface MemberRepositoryEx {
    Member save(Member member) throws SQLException;

    Member findById(String memberId) throws SQLException;

    void update(String memberId, int money) throws SQLException;

    void delete(String memberId) throws SQLException;
}