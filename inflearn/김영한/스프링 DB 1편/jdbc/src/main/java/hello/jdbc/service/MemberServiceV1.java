package hello.jdbc.service;

import hello.jdbc.domain.Member;
import hello.jdbc.repository.MemberRepositoryV1;
import lombok.RequiredArgsConstructor;

import java.sql.SQLException;

/**
 * 트랜잭션 적용 1
 *
 * throws SQLException 는 JDBC를 사용할 때의 오류이기 때문에
 * 다른 데이터베이스를 사용할 때는 다른 오류를 사용하기에 유지보수에 좋지 않다.
 * 
 * 문제: 트랜잭션, 예외 누수, JDBC 반복 문제
 */
@RequiredArgsConstructor
public class MemberServiceV1 {

    private final MemberRepositoryV1 memberRepository;

    public void accountTransfer(String fromId, String toId, int money) throws SQLException {
        //시작
        Member fromMember = memberRepository.findById(fromId);
        Member toMember = memberRepository.findById(toId);

        memberRepository.update(fromId, fromMember.getMoney() - money);
        // 예외 발생
        validation(toMember);
        memberRepository.update(toId, toMember.getMoney() + money);
        //커밋, 롤백
    }

    private void validation(Member toMember) {
        if (toMember.getMemberId().equals("ex")) {
            throw new IllegalStateException("이체중 예외 발생");
        }
    }
}
