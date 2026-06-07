package static2;

/**
 *  static 메서드 : 2026/06/07
 *
 */
public class DecoMain2 {

    public static void main(String[] args) {

        // static 메서드는 인스턴스 생성하지 않고 메서드를 사용 가능하다.
        String s = "hello java";
        String deco = DecoUtil2.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
