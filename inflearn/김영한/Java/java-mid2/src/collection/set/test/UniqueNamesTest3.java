package collection.set.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 컬렉션 프레임워크 - SET
 * 문제와 풀이 TreeSet
 */
public class UniqueNamesTest3 {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(List.of(30, 20, 20, 10, 10));

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
