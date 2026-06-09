package poly.ex6;

/**
 *  다형성 / 추상 + 인터페이스 : 2026/06/09
 */
public class Chicken extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("꼬기오");
    }

    @Override
    public void fly() {
        System.out.println("닭 날기");
    }
}
