package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 컬렉션 프레임워크
 * 문제와 풀이2
 */
public class ListEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        System.out.println("출력");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}