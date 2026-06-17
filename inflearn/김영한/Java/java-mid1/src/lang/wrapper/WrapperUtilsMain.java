package lang.wrapper;

/**
 * Wrapper 클래스 - 2026 6월 17일
 * 주요 메서드와 성능
 */
public class WrapperUtilsMain {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); //숫자, 래퍼 객체 변환
        Integer i2 = Integer.valueOf("10");//문자열, 래퍼 객체 변환
        int intValue = Integer.parseInt("10");//문자열 전용, 기본형 변환

        //비교 | 작으면 -1 같으면 0 크면 1
        int compareResult = i1.compareTo(0);
        System.out.println("compareResult = " + compareResult);

        //산술 연산
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
    }
}
