package enumeration.ref3;

/**
 * 열거형 - 2026 6월 18일
 * ENUM
 * 할인 메서드를 Grade가 가진다면?
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

    //추가
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
