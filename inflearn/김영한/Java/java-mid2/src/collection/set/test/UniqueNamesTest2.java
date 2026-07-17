package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 컬렉션 프레임워크 - SET
 * 문제와 풀이 LinkedHashSet
 */
public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 생성자에 컬렉션을 넣을 수 있다.
        // 컬렉션의 자식인 리스트를 넣을 수 있다.
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
