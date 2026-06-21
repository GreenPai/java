package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * 날짜와 시간 - 2026 6월 2일
 * IsSupported
 */
public class IsSupportedMain1 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("minute = " + minute);
    }
}
