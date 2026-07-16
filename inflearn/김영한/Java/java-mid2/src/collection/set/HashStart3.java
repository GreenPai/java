package collection.set;

import java.util.Arrays;

/**
 * 해시 알고리즘 : 시작
 * 속도를 위해서 메모리 낭비가 심하다.
 * 6개의 값의 위치를 찾기 위해서 94개의 메모리를 낭비한다.
 *
 * 문제: 메모리 낭비 안쓰는 부분이 많아진다.
 */
public class HashStart3 {

    public static void main(String[] args) {
        //{1, 2, 5, 8, 14, 99}
        //[null, 1, 2, null, null, 5, null, null, 8, .., 14 ....., 99]
        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;
        Integer result = inputArray[searchValue]; // O(1)
        System.out.println(result);
    }
}