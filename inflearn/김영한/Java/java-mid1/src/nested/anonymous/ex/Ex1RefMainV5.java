package nested.anonymous.ex;

import java.util.Random;

/**
 * 익명 클래스 - 2026년 7월 7일
 * 지역 클래스 활용
 *
 * 람다식 : Java8 미만에서는 기본형 타입, 인스턴스만 전달할 수 있었으나
 * 굳이 run()을 위해서 인스턴스를 만들어야할까?
 *
 * 메서드만 던지면 되지 않을까?
 * 이때를 위해 자바 8부터는 메서드를 던질 수 있게 되었다.
 */
public class Ex1RefMainV5 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        //코드 조각 시작
        process.run();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        System.out.println("Hello 실행");
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주시위 = " + randomValue);
        });

        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }

}
