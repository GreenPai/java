package hello.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 템플릿 조각 테스트를 위한 컨트롤러
 */
@Controller
@RequestMapping("/template")
public class TemplateController {

    // 템플릿 조각
    @GetMapping("/fragment")
    public String template(){
        return "template/fragment/fragmentMain";
    }

    // 템플릿 레이아웃1 -> HEAD 정보
    @GetMapping("/layout")
    public String layout(){
        return "template/layout/layoutMain";
    }

    // 템플릿 레이아웃2
    @GetMapping("/layoutExtend")
    public String LayoutExtend(){
        return "template/layoutExtend/LayoutExtendMain";
    }

}
