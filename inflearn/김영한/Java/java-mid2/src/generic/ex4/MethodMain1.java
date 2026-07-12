package generic.ex4;

/**
 * static : 객체 없이 메서드 사용 가능
 */
public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");

        // public static <T> T genericMethod(T t)
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        //타입 추론, 타입 인자 생략
        System.out.println("타입 추론");

        // 제네릭 타입 추론
        //public static <T extends Number> T numberMethod(T t)
        Integer result2 = GenericMethod.genericMethod(i);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);

    }
}