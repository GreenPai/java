package hello.springtx.order;

/**
 * 계좌 금액이 부족할 때 발생하는 에러
 * 체크 에러
 */
public class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
