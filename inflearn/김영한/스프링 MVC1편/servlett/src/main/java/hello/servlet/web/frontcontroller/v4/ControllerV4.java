package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

/**
 * ModelView 에서 View 이름으로 반환 변경
 */
public interface ControllerV4 {
    
    String process(Map<String, String > paramMap, Map<String, Object> model);
}
