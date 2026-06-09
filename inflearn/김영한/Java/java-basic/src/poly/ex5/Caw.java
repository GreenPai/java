package poly.ex5;

/**
 *  다형성 / 인터페이스 : 2026/06/09
 */
public class Caw implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("음매");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
