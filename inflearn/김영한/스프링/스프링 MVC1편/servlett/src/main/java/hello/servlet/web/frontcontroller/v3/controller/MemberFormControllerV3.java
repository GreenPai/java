package hello.servlet.web.frontcontroller.v3.controller;

import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

/**
 * V2 방식에서 (HttpServletRequest request, HttpServletResponse response) 이 부분을 없앤다.
 */
public class MemberFormControllerV3 implements ControllerV3 {

    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form"); //논리적 이름만 제공
    }
}
