package enumeration.ref2;

/**
 * 열거형 - 2026 6월 18일
 * ENUM
 * 리팩토링
 */
public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

}
