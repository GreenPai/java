package enumeration.ex2;

/**
 * 열거형 - 2026 6월 18일
 * ENUM
 */
public class ClassGradleEx2_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        /**
         * 생성자를 만들어서 하는 경우 참조값 주소가 달라지므로 오류가 발생
         * 생성자를 private로 설정해서 생성 불가능하게 설정
         * 그러면 컴파일 시점에서 생성자를 만들었을 때 막아준다.
         */

        /*
        ClassGrade newClassGrade = new ClassGrade(); //x009
        int result = discountService.discount(newClassGrade, price);
        System.out.println("newClassGrade 등급의 할인 금액: " + result);
        */
    }
}
