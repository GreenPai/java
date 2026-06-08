package poly.overriding;

/**
 *  다형성 / 오버라이딩 : 2026/06/08
 */
public class Child extends Parent {

    public String value = "child";

    @Override
    public void method() {
        System.out.println("Child.method");
    }
}
