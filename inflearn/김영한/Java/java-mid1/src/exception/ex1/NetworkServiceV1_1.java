package exception.ex1;

/**
 * 예외 처리 - 2026년 7월 8일
 * 데이터를 통신할 때 오류가 발생할 수 있다.
 */
public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); //추가

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
