package poly.ex6;

/**
 *  다형성 / 추상 + 인터페이스 : 2026/06/09
 */
public abstract class AbstractAnimal {
    public abstract void sound();
    public void move() {
        System.out.println("동물이 이동합니다.");
    }
}
