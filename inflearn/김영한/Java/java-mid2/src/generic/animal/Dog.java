package generic.animal;

/**
 * 2026년 7월 10일
 * 제네릭
 */
public class Dog extends Animal {

    public Dog(String name, int size) {
        super(name, size);
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

}