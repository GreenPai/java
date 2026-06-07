package access.a;

/**
 *  접근제어자 : 2026/06/07
 *  default도 같은 패키지 안에서 사용 가능하다.
 */
public class PublicClassInnerMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}
