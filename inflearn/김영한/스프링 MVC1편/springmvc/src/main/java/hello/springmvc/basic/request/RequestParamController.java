package hello.springmvc.basic.request;

import hello.springmvc.basic.HelloData;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.Map;

@Slf4j
@Controller
public class RequestParamController {

    /** V1
     * 과거 기존 HTTP 방식
     *
     */
    @RequestMapping("/request-param-v1")
    public void requestParamV1(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));
        log.info("username= {}, age={}",username, age);

        response.getWriter().write("ok");
    }

    /** V2
     * ResponseBody
     * RequestParam
     */

    @ResponseBody
    @RequestMapping("/request-param-v2")
    public String requestParamV2(
            @RequestParam("username") String memberName,
            @RequestParam("age") int memberAge){

        log.info("username={}, age={}",memberName,memberAge);
        return "ok";
    }

    /** V3
     * HTTP 파라미터 이름이 변수와 같으면
     * @RequestParam("**") String username 생략 가능
     */
    @ResponseBody
    @RequestMapping("/request-param-v3")
    public String requestParamV3(
            @RequestParam String username,
            @RequestParam int age){

        log.info("username={}, age={}",username,age);
        return "ok";
    }

    /** V4
     * @RequestParam
     * String, int 등의 단순 타입이면 RequestParam도 생략 가능
     */

    @ResponseBody
    @RequestMapping("/request-param-v4")
    public String requestParamV4(
            String username,
            int age){

        log.info("username={}, age={}",username,age);
        return "ok";
    }

    /**
     * required
     * required 를 사용하여 파라미터 필수 여부를 판단 가능
     * int 대신 Integer 사용한 이유 -> Null이 들어왔을 경우 int는 받아드릴 수 없어 오류 발생
     */
    @ResponseBody
    @RequestMapping("/request-param-required")
    public String requestParamRequired(
            @RequestParam(required = true) String username,
            @RequestParam(required = false) Integer age){

        log.info("username={}, age={}",username,age);
        return "ok";
    }

    /**
     * defaultValue
     * 입력을 받지 않았을 때 초기값
     * String의 빈문자열 ""도 default로 처리해준다.
     */

    @ResponseBody
    @RequestMapping("/request-param-default")
    public String requestParamDefault(
            @RequestParam(required = true, defaultValue = "guest") String username,
            @RequestParam(required = false, defaultValue = "-1") Integer age){

        log.info("username={}, age={}",username,age);
        return "ok";
    }


    /** Map
     * 모든 요청을 다 받아드리고 싶을때
     */

    @ResponseBody
    @RequestMapping("/request-param-map")
    public String requestParamDefault(
            @RequestParam Map<String, Object> paramMap){

        log.info("username={}, age={}",paramMap.get("username"), paramMap.get("age"));
        return "ok";
    }

    /*
    @ResponseBody
    @RequestMapping("/model-attribute-v1")
    public String modelAttributeV1(@RequestParam String username, @RequestParam int age){
        HelloData helloData = new HelloData();
        helloData.setAge(age);
        helloData.setUsername(username);

        log.info("username={}, age={}",helloData.getUsername(), helloData.getAge());
        return "ok";
    }
    */


    /**
     * 위의 주석 처리한 코드에서 코드를 간략화 시키기 위해
     * ModelAttribute 를 사용
     */
    @ResponseBody
    @RequestMapping("/model-attribute-v1")
    public String modelAttributeV1(@ModelAttribute HelloData helloData){

        log.info("username={}, age={}",helloData.getUsername(), helloData.getAge());
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/model-attribute-v2")
    public String modelAttributeV2(HelloData helloData){

        log.info("username={}, age={}",helloData.getUsername(), helloData.getAge());
        return "ok";
    }





}
