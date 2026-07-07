package nested.test;

/**
 * 내부 클래스 - 2026년 7월 8일
 */
public class OuterClass2Main {

    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.hello();
    }
}
