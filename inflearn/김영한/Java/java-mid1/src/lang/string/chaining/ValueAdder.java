package lang.string.chaining;

/**
 * String 메서드 체이닝 - 2026 6월 16일
 */
public class ValueAdder {

    private int value;

    public ValueAdder add(int addValue) {
        value += addValue;
        return this;
    }

    public int getValue() {
        return value;
    }
}
