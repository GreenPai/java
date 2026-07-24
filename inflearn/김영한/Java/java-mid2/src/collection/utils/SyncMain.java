package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 컬렉션 동기화
 * 
 * 더 느리지만 멀티스레드가 가능하도록 변경
 */
public class SyncMain {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("list.getClass() = " + list.getClass());;
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("synchronizedList = " + synchronizedList.getClass());

    }
}
