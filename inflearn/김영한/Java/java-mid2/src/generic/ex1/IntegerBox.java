package generic.ex1;

/**
 * 2026년 7월 9일 
 * 제네릭이 필요한 이유
 */
public class IntegerBox {

    private Integer value;

    public void set(Integer value) {
        this.value = value;
    }

    public Integer get() {
        return value;
    }
}