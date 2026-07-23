package collection.deque.test.stack;

/**
 * 문제와 풀이2 : Map
 * 브라우저 히스토리 관리
 * 
 * 스택 형식으로 구현
 */
public class BrowserHistoryTest {

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        
        // 사용자가 웹페이지를 방문하는 시나리오
        browser.visitPage("youtube.com");
        browser.visitPage("google.com");
        browser.visitPage("facebook.com");

        // 뒤로 가기 기능을 사용하는 시나리오
        String currentPage1 = browser.goBack();
        System.out.println("currentPage1 = " + currentPage1);

        String currentPage2 = browser.goBack();
        System.out.println("currentPage2 = " + currentPage2);
    }
}