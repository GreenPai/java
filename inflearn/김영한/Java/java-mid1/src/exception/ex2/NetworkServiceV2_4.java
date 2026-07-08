package exception.ex2;

/**
 * 예외 처리 - 2026년 7월 8일
 * v3 : v2에서는 정상 흐름과 예외 흐름이 섞여 있어서 코드를 읽기 힘들다.
 *       이러한 부분을 해결한 것이 v3
 *
 * v4 : disconnect 하지 않는 경우가 발생하는 것을 해결.
 */
public class NetworkServiceV2_4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //추가

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }

        client.disconnect();
    }
}
