package hello.servlet.web.springmvc.old;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 스프링 컨트롤러 Old 버전
 * 현재 @Controller와 아예 다르다.
 * 스프링 빈의 이름으로 핸들러를 찾을 수 있는 핸들러 매핑이 필요하다.
 */
@Component("/springmvc/old-controller")
public class OldController implements Controller {

    // ModelAndView 반환
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest");
        // Application.properties에 prefix, suffix가 잇음 
        return new ModelAndView("new-form");
    }
}
