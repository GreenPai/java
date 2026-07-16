package collection.set;

/**
 * 제네릭과 인터페이스 도입
 * @param <E>
 */
public interface MySet<E> {
    boolean add(E element);
    boolean remove(E value);
    boolean contains(E value);
}