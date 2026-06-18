package enumeration.ref1;

/**
 * 열거형 - 2026년 6월 18일
 * ENUM
 */
public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        return price * classGrade.getDiscountPercent() / 100;
    }
}
