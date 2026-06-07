package access.a;

/**
 *  접근제어자 : 2026/06/07
 *  클래스는 public, default만 가능
 *  public은 .java 파일 이름과 같은 클래스만 가능하다.
 */
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

class DefaultClass1 {

}

class DefaultClass2 {

}
