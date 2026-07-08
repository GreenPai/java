package exception.ex2;

/**
 * 예외 처리 - 2026년 7월 8일
 * v5 : v4에서는 NetworkClientExceptionV2 에러 말고 다른 에러가 발생 시
 *      disconnect 하지 않는 오류가 발생했다. 이것을 해결한 것이 v5
 */
public class NetworkServiceV2_5 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //추가

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }

    }
}
