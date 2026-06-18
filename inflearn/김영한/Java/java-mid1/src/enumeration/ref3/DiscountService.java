package enumeration.ref3;

/**
 * 열거형 - 2026 6월 18일
 * ENUM
 * 할인 메서드를 Grade가 가진다면?
 */
public class DiscountService {

    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}
