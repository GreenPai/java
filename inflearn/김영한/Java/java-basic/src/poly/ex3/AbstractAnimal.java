package poly.ex3;

/**
 *  다형성 / 오버라이딩 : 2026/06/09
 *  추상 클래스
 */
public abstract class AbstractAnimal {

    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

}
