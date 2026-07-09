package exception.ex3.exception;

/**
 * 예외 처리 - 2026년 7월 9일
 * 전송을 실패한 예외처리
 */
public class SendExceptionV3 extends NetworkClientExceptionV3 {

    private final String sendData;

    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
