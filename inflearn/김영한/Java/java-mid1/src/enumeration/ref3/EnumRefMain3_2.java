package enumeration.ref3;

/**
 * 열거형 - 2026 6월 18일
 * ENUM
 * 할인 메서드를 Grade가 가진다면?
 */
public class EnumRefMain3_2 {

    public static void main(String[] args) {
        int price = 10000;
        System.out.println("BASIC 등급의 할인 금액: " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등급의 할인 금액: " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 등급의 할인 금액: " + Grade.DIAMOND.discount(price));
    }
}
