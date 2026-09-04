package hello.servlet.domain.member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.*;
class MemberRepositoryTest {
    // 싱글톤 생성자 들고오기
    MemberRepository memberRepository = MemberRepository.getInstance();

    // 테스트가 끝나고 테스트를 초기화
    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    /**
     * Member 저장 테스트
     */
    @Test
    void save() {
        //given
        Member member = new Member("hello", 20);
        //when
        Member savedMember = memberRepository.save(member);
        //then
        Member findMember = memberRepository.findById(savedMember.getId());
        assertThat(findMember).isEqualTo(savedMember);
    }

    /**
     * Member 출력 테스트
     */
    @Test
    void findAll() {
        //given - 주어진 정보
        Member member1 = new Member("member1", 20);
        Member member2 = new Member("member2", 30);
        memberRepository.save(member1);
        memberRepository.save(member2);
        //when
        List<Member> result = memberRepository.findAll();
        //then
        assertThat(result.size()).isEqualTo(2);  // 사이즈가 2개인가
        assertThat(result).contains(member1, member2);   // member1,  member2를 가지고 있는가.
    }
}