package nested.inner;

/**
 * 정적 중첩 클래스 - 2026 6월 24일
 * 정적 중첩 클래스
 */
public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); // outer.new Inner()
        inner.print();

        System.out.println("innerClass = " + inner.getClass());

    }
}
