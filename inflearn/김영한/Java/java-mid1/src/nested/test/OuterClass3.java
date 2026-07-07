package nested.test;

/**
 * 내부 클래스 - 2026년 7월 8일
 */
public class OuterClass3 {
    public void myMethod() {

        class LocalClass {
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }

        LocalClass local = new LocalClass();
        local.hello();
    }
}
