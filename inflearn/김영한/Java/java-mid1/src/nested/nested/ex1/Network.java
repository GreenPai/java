package nested.nested.ex1;

/**
 * 정적 중첩 클래스 - 2026 6월 24일
 */
public class Network {

    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
}
