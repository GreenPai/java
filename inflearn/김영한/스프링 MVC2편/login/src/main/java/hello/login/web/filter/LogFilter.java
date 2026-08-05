package hello.login.web.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.UUID;

/**
 * 필터 - 순서1
 */
@Slf4j
public class LogFilter implements Filter {

    /**
     *  init() -> 필터 초기화 메서드
     *  서블릿 컨테이너가 생성될 때 호출된다.
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("log filter init");
    }

    /**
     *  고객의 요청이 올 때 마다 해당 메서드가 호출된다.
     *  필터의 로직을 구현하는 부분
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("log filter doFilter");

        // HttpServletRequest 다운 캐스팅
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String requestURI = httpRequest.getRequestURI();

        String uuid = UUID.randomUUID().toString();

        try {
            log.info("REQUEST [{}][{}]", uuid , requestURI);
            chain.doFilter(request, response); //다음 필터로, 없으면 서블릿 호출
        } catch (Exception e){
            throw  e;
        }finally {
            log.info("RESPONSE [{}][{}]", uuid, requestURI);
        }

    }

    /**
     * 필터 종료 메서드, 서블릿 컨테이너가 종료될 때 호출된다.
     */
    @Override
    public void destroy() {
        log.info("log filter destory");
        Filter.super.destroy();
    }
}
