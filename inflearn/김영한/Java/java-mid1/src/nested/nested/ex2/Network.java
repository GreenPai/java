package nested.nested.ex2;

/**
 * 정적 중첩 클래스 - 2026 6월 24일
 *
 * 외부에서 NetworkMessage를 사용 할 수 없다.
 */
public class Network {

    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    private static class NetworkMessage {

        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }

}
