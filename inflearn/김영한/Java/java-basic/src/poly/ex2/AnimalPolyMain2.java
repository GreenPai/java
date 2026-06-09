package poly.ex2;

/**
 *  다형성 / 오버라이딩 : 2026/06/08
 *
 *  Animal 부모를 클래스로 배열을 돌려 불필요한 코드를 줄일 수 있다.
 */
public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();
        Animal[] animalArr = {dog, cat, caw, duck};

        //변하지 않는 부분
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
