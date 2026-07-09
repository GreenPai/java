package exception.ex4.exception;

/**
 * 예외 처리 - 2026년 7월 9일
 * RuntimeException
 */
public class SendExceptionV4 extends NetworkClientExceptionV4 {

    private final String sendData;

    public SendExceptionV4(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
