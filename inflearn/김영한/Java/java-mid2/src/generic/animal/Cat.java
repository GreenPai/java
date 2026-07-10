package generic.animal;

/**
 * 2026년 7월 10일
 * 제네릭
 */
public class Cat extends Animal {

    public Cat(String name, int size) {
        super(name, size);
    }

    @Override
    public void sound() {
        System.out.println("냐옹");
    }
}