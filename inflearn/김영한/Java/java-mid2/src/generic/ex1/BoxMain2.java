package generic.ex1;

/**
 * 2026년 7월 9일
 * 제네릭이 필요한 이유
 * BoxMain1
 * 데이터 타입이 새로 추가될 때 마다
 * 새로운 클래스를 만들어야되는 문제가 발생한다.
 *
 * BoxMain2
 * Object를 사용해 다형성으로 해결해보자
 * -> 항상 다운 캐스팅으로 Object객체를 변화 시키는 것에는 오류가 발생할 수 있다.
 */
public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); //Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); //Object -> Integer 캐스팅
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외
        System.out.println("result = " + result);
    }

}