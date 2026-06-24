package nested.nested.ex2;

/**
 * 정적 중첩 클래스 - 2026 6월 24일
 * ex1의 클래스를 Network, NetworkMessage 에서
 * Network로 하나로 줄임.
 * 
 * 개발자가 보고 더 빠르게 코드를 파악가능
 */
public class NetworkMain {

    public static void main(String[] args) {
        Network network = new Network();
        network.sendMessage("hello java");
    }
}
