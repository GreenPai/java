package poly.ex4;

/**
 *  다형성 / 오버라이딩 : 2026/06/09
 *  완전 추상 클래스
 */
public class Cat extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("냐옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
