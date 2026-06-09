package poly.ex4;

/**
 *  다형성 / 오버라이딩 : 2026/06/09
 *  완전 추상 클래스
 */
public class Dog extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
