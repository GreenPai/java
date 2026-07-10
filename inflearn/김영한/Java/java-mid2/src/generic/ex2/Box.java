package generic.ex2;

/**
 * 2026년 7월 10일
 * 제네릭
 */
public class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

}