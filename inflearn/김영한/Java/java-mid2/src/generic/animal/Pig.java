package generic.animal;

/**
 * 2026년 7월 10일
 * 제네릭 (그냥 만든거)
 */
public class Pig extends Animal{

    public Pig(String name, int size) {
        super(name, size);
    }

    @Override
    public void sound() {
        System.out.println("꿀꿀");
    }
    
    public void move(){
        System.out.println("움직이기");
    }
}
