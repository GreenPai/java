package enumeration.ex1;

/**
 * 열거형 - 2026 6월 18일
 * ENUM
 * EX0 버전에는 gold, diamond를 사용하기 위해서 작성하는 도중
 * 오타가 발생할 문제가 잇었다.
 *
 * 오타가 발생할 시 컴파일 오류가 난다.
 */
public class StringGradeEx1_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
