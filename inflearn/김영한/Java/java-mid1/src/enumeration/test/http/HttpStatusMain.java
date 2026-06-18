package enumeration.test.http;

import java.util.Scanner;

/**
 * 열거형 - 2026 6월 18일
 * ENUM
 * 문제와 풀이.
 */
public class HttpStatusMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("HTTP CODE: ");
        int httpCodeInput = scanner.nextInt();

        HttpStatus status = HttpStatus.findByCode(httpCodeInput);
        if (status == null) {
            System.out.println("정의되지 않은 코드");
        } else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isSuccess = " + status.isSuccess());
        }
    }
}
