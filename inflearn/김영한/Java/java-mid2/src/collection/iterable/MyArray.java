package collection.iterable;

import java.util.Iterator;

/**
 * 순회 1 :
 * 직접 구현하는  Iterable, Iterator
 */
public class MyArray implements Iterable<Integer> {

    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }

}