package nested.nested;

/**
 * 정적 중첩 클래스 - 2026 6월 24일
 */
public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에 접근에는 접근할 수 없다.
            //System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 접근 가능
            // public인 NestedOuter에서 안의 private에는 접근 가능
            System.out.println(NestedOuter.outClassValue);
        }
    }
}
