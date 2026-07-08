package exception.ex1;

import java.util.Scanner;

/**
 * 예외 처리 - 2026년 7월 8일
 * 흐름: Main -> Service -> client
 * 데이터를 통신할 때 오류가 발생할 수 있다.
 *
 * ex1의 에러 코드의 문제점: 정상 코드와 에러 코드가 구분이 되어 있지 않다.
 * 복잡하다.
 */
public class MainV1 {

    /**
     *  v1 의 문제점 : 연결이 실패하면 데이터가 전송되지 않아야 되는데 전송됨
     *      - v2 개선 : 연결이 종료되면 데이터 전송 X , 오류 메시지 정확히
     *  v2 의 문제점 : 오류가 발생해도 disconnect를 하지 않아 자원에 계속 고갈됨.
     *      - v3 개선 : 오류가 발생해도 disconnect를 하도록 구현
     */
    public static void main(String[] args) {
        //NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        //NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
        NetworkServiceV1_3 networkService = new NetworkServiceV1_3();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
