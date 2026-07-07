package nested.anonymous.ex;

import java.util.Random;

/**
 * 익명 클래스 - 2026년 7월 7일
 * 지역 클래스 활용
 *
 * hello 메서드 안에 new Process를 넣어줌.
 */
public class Ex1RefMainV4 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        //코드 조각 시작
        process.run();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        System.out.println("Hello 실행");
        hello(new Process() {
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주시위 = " + randomValue);
            }
        });

        hello(new Process() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }

}
