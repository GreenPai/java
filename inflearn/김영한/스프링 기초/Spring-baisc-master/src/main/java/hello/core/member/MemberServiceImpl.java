package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {

    /**
     *  private final MemberRepository memberRepository = new MemoryMemberRepository();
     *  왼쪽은 인터페이스 의존관계 즉 추상화의 의존하며 오른쪽은 구현체를 의지하기 때문에 문제가 있다.
     *  DIP를 위반하고 있다.
     */

    /*
    private final MemberRepository memberRepository = new MemoryMemberRepository();
     */


    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // 테스트 용도
    public MemberRepository getMemberRepository(){
        return memberRepository;
    }
}
