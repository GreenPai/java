package collection.list;

/**
 * 컬렉션 프레임워크
 * */
public interface MyList<E> {

    int size();

    void add(E e);

    void add(int index, E e);

    E get(int index);

    E set(int index, E element);

    E remove(int index);

    int indexOf(E o);

}