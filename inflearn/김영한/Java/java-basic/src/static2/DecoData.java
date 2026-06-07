package static2;

/**
 *  static 메서드2 : 2026/06/07
 *  static 메서드에는 인스턴스 변수가 사용이 안된다.
 */
public class DecoData {

    private int instanceValue;
    private static int staticValue;

    // 외부에서 static 메서드를 사용하는 경우 어떠한 참조값의 값을 들고와야되는지 모른다.
    public static void staticCall() {
        //instanceValue++; //인스턴스 변수 접근, compile error
        //instanceMethod(); //인스턴스 메서드 접근, compile error

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }


    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
