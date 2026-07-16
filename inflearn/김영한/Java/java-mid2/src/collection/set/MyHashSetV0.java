package collection.set;

import java.util.Arrays;

/**
 * 직접 구현하는 Set0 - 시작
 */
public class MyHashSetV0 {

    private int[] elementData = new int[10];
    private int size = 0;

    // O(n)
    public boolean add(int value) {
        
        // 중복 체크
        if (contains(value)) {
            return false;
        }
        
        elementData[size] = value;
        size++;
        return true;
    }

    // O(n)

    /**
     * 중복 확인 
     */
    public boolean contains(int value) {
        for (int data : elementData) {
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }

}