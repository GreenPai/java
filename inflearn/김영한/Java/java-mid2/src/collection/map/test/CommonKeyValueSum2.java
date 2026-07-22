package collection.map.test;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제와 풀이1 : Map
 * 
 * 1버전을 조금 더 편하게 만들기
 * : 만드는것이 편한 만큼 Map 수정 안됨
 */
public class CommonKeyValueSum2 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);

        Map<String, Integer> result = new HashMap<>();

        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                result.put(key, map1.get(key) + map2.get(key));
            }
        }

        System.out.println(result);
    }
}