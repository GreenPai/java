package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * 날짜와 시간 - 2026 6월 20일
 * OffsetDateTimeMain
 */
public class OffsetDateTimeMain {

    public static void main(String[] args) {
        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("nowOdt = " + nowOdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println("ldt = " + ldt);
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println("odt = " + odt);

        // LocalDateTime nd = LocalDateTime.now();
        // OffsetDateTime od = OffsetDateTime.of(nd, ZoneOffset.of("+01:00") );
        // System.out.println(od);
    }
}
