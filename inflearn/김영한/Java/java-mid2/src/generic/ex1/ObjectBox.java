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
 */
public class ObjectBox {

    private Object value;

    public void set(Object object) {
        this.value = object;
    }

    public Object get() {
        return value;
    }
}