package access;

/**
 *  접근제어자 : 2026/06/07
 */
public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");

        /**
         * 스피커의 볼륨을 private로 했기 때문에 외부에서 수정할 수 없다.
         */
        //speaker.volume = 200; // 접근 오류
        speaker.showVolume();
    }
}
