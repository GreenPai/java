package lang.string.chaining;

/**
 * String 메서드 체이닝 - 2026 6월 16일
 */
public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);
    }
}
