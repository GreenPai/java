package poly.ex6;

/**
 *  다형성 / 추상 + 인터페이스 : 2026/06/09
 */
public class Dog extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
