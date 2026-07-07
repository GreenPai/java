package nested.anonymous.ex;

import java.util.Random;

/**
 * 익명 클래스 - 2026년 7월 7일
 * 지역 클래스 활용
 *
 * main 밖에 있던 dice와 sum을 안으로 넣음.
 */
public class Ex1RefMainV2 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        //코드 조각 시작
        process.run();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        class Dice implements Process {

            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주시위 = " + randomValue);
            }
        }

        class Sum implements Process {

            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        Process dice = new Dice();
        Process sum = new Sum();

        System.out.println("Hello 실행");
        hello(dice);
        hello(sum);
    }

}
