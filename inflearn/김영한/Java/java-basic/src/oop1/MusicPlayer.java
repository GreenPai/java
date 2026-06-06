package oop1;

/**
 * 절차 지향 프로그래밍 : 2026/06/06
 * 절차 지향 프로그래밍는 메서드와 필드가 따로 있다.
 * 메서드는 MusicPlayerMain에 있고 필드는 클래스에 있다.
 * 그렇기에 수정을 할 때 2군데 모두 수정을 해줘야된다.
 *
 * 객체 지향 프로그래밍을 햇을 때 필드와 메서드를 모두 한 공간에서 관리할 수 있다.
 *
 */
public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

}
