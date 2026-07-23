package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 문제와 풀이2 : Map
 * 브라우저 히스토리 관리
 */
public class BrowserHistory {

    private Deque<String> history = new ArrayDeque<>();
    private String currentPage = null;
    
    public void visitPage(String url) {
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문: " + url);
    }
    
    public String goBack() {
        if (!history.isEmpty()) {
            currentPage = history.pop();
            System.out.println("뒤로 가기: " + currentPage);
            return currentPage;
        }
        return null;
    }

}