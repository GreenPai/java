package generic.test.ex1;

import generic.animal.Dog;

/**
 * 2026년 7월 10일
 * 제네릭
 */
public class ContainerTest {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        System.out.println("빈값 확인1: " + stringContainer.isEmpty());

        stringContainer.setItem("data1");
        System.out.println("저장 데이터: " + stringContainer.getItem());
        System.out.println("빈값 확인2: " + stringContainer.isEmpty());

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setItem(10);
        System.out.println("저장 데이터: " + integerContainer.getItem());


    }
}