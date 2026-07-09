package exception.ex4;

/**
 * 예외 처리 - 2026년 7월 9일
 * RuntimeException
 */
public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data); //추가

        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }

    }
}
