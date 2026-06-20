package time;

import java.time.Instant;
import java.time.ZonedDateTime;

/**
 * 날짜와 시간 - 2026 6월 20일
 * Instant
 */
public class InstantMain {

    public static void main(String[] args) {
        //생성
        Instant now = Instant.now();//UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        //계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);
        // 에포크 시간 기본값: 1970년 1월 1일 0시 0분 0초

        //조회
        long laterEpochSecond = later.getEpochSecond(); // 에포크시간 지난 값
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
