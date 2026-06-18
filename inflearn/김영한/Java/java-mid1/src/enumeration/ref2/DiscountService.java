package enumeration.ref2;

/**
 * 열거형 - 2026 6월 18일
 * ENUM
 * 리팩토링
 */
public class DiscountService {

    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
