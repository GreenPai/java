package enumeration.ref3;

/**
 * 열거형 - 2026 6월 18일
 * ENUM
 * 할인 메서드를 Grade가 가진다면?
 */
public class EnumRefMain3_3 {

    public static void main(String[] args) {
        int price = 10000;
        printDiscount(Grade.BASIC, price);
        printDiscount(Grade.GOLD, price);
        printDiscount(Grade.DIAMOND, price);
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }
}
