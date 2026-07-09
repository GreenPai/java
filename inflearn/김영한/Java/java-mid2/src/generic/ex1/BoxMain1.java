package generic.ex1;

/**
 * 2026년 7월 9일
 * 제네릭이 필요한 이유
 * BoxMain1
 * 데이터 타입이 새로 추가될 때 마다
 * 새로운 클래스를 만들어야되는 문제가 발생한다.
 */
public class BoxMain1 {

    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); //오토 박싱
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }

}