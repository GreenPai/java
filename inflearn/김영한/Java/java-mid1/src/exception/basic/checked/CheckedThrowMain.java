package exception.basic.checked;

/**
 * 예외 처리 - 2026년 7월 8일
 * 체크 예외
 */
public class CheckedThrowMain {

    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료");
    }
}
