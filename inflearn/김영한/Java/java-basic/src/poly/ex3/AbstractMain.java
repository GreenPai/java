package poly.ex3;

/**
 *  다형성 / 오버라이딩 : 2026/06/09
 *  추상 클래스
 *  
 *  추상 클래스는 새로운 동물을 만들 때 실수하는 부분을 방지해준다.
 *  예) Duck을 만들고 추상 메서드를 만든 부분을 오버라이딩 하지 않으면 오류
 */
public class AbstractMain {

    public static void main(String[] args) {
        //추상클래스 생성 불가
        //AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }

    //변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
