package poly.ex3;

/**
 *  다형성 / 오버라이딩 : 2026/06/09
 *  추상 클래스
 */
public class Duck extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("꽉꽉");
    }
}
