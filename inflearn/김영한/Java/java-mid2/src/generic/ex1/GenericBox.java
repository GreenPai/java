package generic.ex1;

/**
 * 2026년 7월 9일
 * 제네릭
 */

public class GenericBox<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}