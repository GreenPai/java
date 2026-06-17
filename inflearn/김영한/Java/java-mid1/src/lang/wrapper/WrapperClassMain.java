package lang.wrapper;

import com.sun.security.jgss.GSSUtil;

/**
 * Wrapper 클래스 - 2026 6월 17일
 */
public class WrapperClassMain {

    public static void main(String[] args) {

        /**
         * 성능 테스트 : 생각보다 큰 차이는 없네
         */
        long starttime = System.nanoTime(); // 나노초 단위 사용
        Integer newInte = new Integer(20);
        // Integer newInte = Integer.valueOf(20);
        long endtime = System.nanoTime();

        System.out.println("소요 시간(ns): " + (endtime - starttime));
        System.out.println(starttime-endtime);

        Integer newInteger = new Integer(10); //미래에 삭제 예정, 대신에 valueOf()를 사용
        Integer integerObj = Integer.valueOf(10); //-128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals: " + (newInteger.equals(integerObj)));
    }
}
