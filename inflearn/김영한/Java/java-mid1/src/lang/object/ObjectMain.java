package lang.object;

/**
 * Object 클래스 - 2026 6월 10일
 * 부모가 없으면 묵시적으로 Object 클래스를 상속받는다.
 */
public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드
        String string = child.toString();
        // System.out.println(string);

        Child c = new Child();
        Parent p = new Parent();

        Object[] obs = new Object[]{c,p};

        for (Object o : obs){
            System.out.println("-- ");
            System.out.println(o.toString());
        }

    }
}
