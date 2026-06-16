package lang.string.chaining;

/**
 * String 메서드 체이닝 - 2026 6월 16일
 */
public class MethodChainingMain1 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        adder.add(1);
        adder.add(2);
        adder.add(3);

        int result = adder.getValue();
        System.out.println("result = " + result);
    }
}
