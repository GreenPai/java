package generic.test.ex1;

/**
 * 2026년 7월 10일
 * 제네릭
 */
public class Container<T> {

    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public boolean isEmpty() {
        return item != null;
    }
}