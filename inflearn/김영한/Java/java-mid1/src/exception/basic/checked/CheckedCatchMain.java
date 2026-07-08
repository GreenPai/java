package exception.basic.checked;

/**
 * 예외 처리 - 2026년 7월 8일
 * 체크 예외
 */
public class CheckedCatchMain {

    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}
