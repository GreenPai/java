package nested.anonymous.ex;

/**
 * 익명 클래스 - 2026 7월 7일
 * Ex0을 리펙토링
 */
public class Ex0RefMain {

    public static void hello(String str) {
        System.out.println("프로그램 시작"); //변하지 않는 부분
        System.out.println(str); //str: 변하는 부분
        System.out.println("프로그램 종료"); //변하지 않는 부분
    }

    public static void main(String[] args) {
        hello("Hello Java");
        hello("Hello Spring");
    }

}
