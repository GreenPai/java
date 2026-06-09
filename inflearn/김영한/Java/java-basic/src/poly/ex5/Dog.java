package poly.ex5;

/**
 *  다형성 / 인터페이스 : 2026/06/09
 */
public class Dog implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
