package nested;

/**
 * 정적 중첩 클래스 - 2026 6월 26일
 * 정적 중첩 클래스
 */
public class ShdowingMain {

    public int value = 1;

    class Inner {
        public int value = 2;

        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("ShdowingMain.value = " + ShdowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShdowingMain main = new ShdowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
