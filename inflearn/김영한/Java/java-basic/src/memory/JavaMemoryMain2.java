package memory;

/**
 *  스택 영역과 힙 영역 : 2026/06/07
 *  스택 영역에 main 영역부터 method1, 2 로 넘어간다.
 *  메소드1에서 data를 만들 때 힙 영역에 인스턴스가 만들어져서 참조값이 생성된다.
 *  메소드2에서 메소드1에서 만든 참조값을 참조한다.
 */
public class JavaMemoryMain2 {

    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value=" + data2.getValue());
        System.out.println("method2 end");
    }

}
