package extends1.super2;

/**
 *  상속 super : 2026/06/08
 *
 */
public class Super2Main {

    public static void main(String[] args) {
        ClassC classC = new ClassC();
        // uper(10, 20) ->  super() -> System.out.println("ClassA 생성자"
        // -> System.out.println("ClassB 생성자 a=" + a + " b=" + b); -> System.out.println("ClassC 생성자");
        ClassB classB = new ClassB(100);
    }
}
