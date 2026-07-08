package exception.ex2;

import java.util.Scanner;

/**
 * 예외 처리 - 2026년 7월 8일
 * EX1을 리펙토링
 *
 * v1 : 모든 곳에서 발생한 예외를 잡지 않았기 때문에 main 밖으로 던진다.
 * v2 : 예외 처리를 받아서 정상 흐름으로 복구
 * v3 : v2에서는 정상 흐름과 예외 흐름이 섞여 있어서 코드를 읽기 힘들다.
 *      이러한 부분을 해결한 것이 v3
 * v4 : error2 발생했을 때 disconnect가 실행되지 않아 생기는 문제를 해결
 * v5 : v4에서는 NetworkClientExceptionV2 에러 말고 다른 에러가 발생 시
 *      disconnect 하지 않는 오류가 발생했다. 이것을 해결한 것이 v5
 */
public class MainV2 {

    public static void main(String[] args) throws NetworkClientExceptionV2 {
        //NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
        //NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
        NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
        //NetworkServiceV2_4 networkService = new NetworkServiceV2_4();
        //NetworkServiceV2_5 networkService = new NetworkServiceV2_5();

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
