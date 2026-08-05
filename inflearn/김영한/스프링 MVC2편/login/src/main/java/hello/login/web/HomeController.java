package hello.login.web;

import hello.login.web.argumentresolver.Login;
import hello.login.domain.member.Member;
import hello.login.domain.member.MemberRepository;
import hello.login.web.session.SessionManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final MemberRepository memberRepository;
    private final SessionManager sessionManager;

//     @GetMapping("/")
    public String home() {
        return "home";
    }


    /**
     *  쿠키를 사용한 홈 화면입니다.
     */

    /*
    @GetMapping("/")
    public String home(@CookieValue(name = "memberId", required = false) Long memberId, Model model){

        // 쿠키가 없을 때
        if (memberId == null){
            return "home";
        }

        // 관련 멤버 출력
        Member loginMember = memberRepository.findById(memberId);

        // ID에 맞는 member 값이 null 일 때
        if (loginMember == null){
            return "home";
        }

        // 로그인 성공
        model.addAttribute("member", loginMember);
        return "loginHome";
    }

     */

    /**
     *  세션을 이용한 방식입니다.
     */

    /*
    @GetMapping("/")
    public String homeV2(HttpServletRequest request, Model model){

        //세션 관리자에 저장된 회원 정보 조회
        Member member = (Member)sessionManager.getSession(request);

        // 로그인
        if (member == null){
            return "home";
        }

        model.addAttribute("member", member);
        return "loginHome";
    }
     */


    /**
     *  서블릿을 이용한 홈 컨트롤러 부분입니다.
     *  V1으로서 밑에 V2가 있습니다.
     */


    /*
    @GetMapping("/")
    public String homeV3(HttpServletRequest request, Model model){

        HttpSession session = request.getSession(false);
        if (session == null){
            return "home";
        }

        Member loginMember = (Member) session.getAttribute(SessionConst.LOGIN_MEMBER);

        //세션에 회원 데이터가 없으면 home
        if (loginMember == null){
            return "home";
        }
        model.addAttribute("member", loginMember);
        return "loginHome";
    }
     */

    /**
     *  서블릿 V2입니다. V1에서 코드를 간략화 시킨것 입니다.
     */
    /*
    @GetMapping("/")
    public String homeLoginV3Spring(@SessionAttribute(name = SessionConst.LOGIN_MEMBER, required = false) Member loginMember, Model model){

        //세션에 회원 데이터가 없으면 home
        if (loginMember == null){
            return "home";
        }
        model.addAttribute("member", loginMember);
        return "loginHome";
    }
*/


    /**
     * ArgumentResolver 활용
     */
    @GetMapping("/")
    public String homeLoginV3Spring(@Login Member loginMember, Model model){

        //세션에 회원 데이터가 없으면 home
        if (loginMember == null){
            return "home";
        }
        model.addAttribute("member", loginMember);
        return "loginHome";
    }


}