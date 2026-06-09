package poly.ex2;

/**
 *  다형성 / 오버라이딩 : 2026/06/08
 */
public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
