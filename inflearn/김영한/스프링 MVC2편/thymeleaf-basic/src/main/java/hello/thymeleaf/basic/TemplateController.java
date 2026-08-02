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
    @GetMapping("/fragment")
    public String template(){
        return "template/fragment/fragmentMain";
    }

    @GetMapping("/layout")
    public String layout(){
        return "template/layout/layoutMain";
    }

    @GetMapping("/layoutExtend")
    public String LayoutExtend(){
        return "template/layoutExtend/LayoutExtendMain";
    }

}
