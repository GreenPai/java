package poly.diamond;

/**
 *  다형성 / 인터페이스 : 2026/06/09
 *  다중 상속
 *  다중 상속이 되는 이유: 추상 클래스는 methodCommon 을 사용할때 어떤 클래스의 methodCommon를 사용해야 되는지 모르지만
 *  인터페이스는 둘 다 구현이 되어 있지 않고 직접 구현을 해야 되기 때문에 가능하다.
 */
public class DiamondMain {

    public static void main(String[] args) {

        // 부모는 자식을 담을 수 있다.
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        Child c = new Child();
        c.methodCommon();

        InterfaceA[] arrs = new InterfaceA[]{a,c};

        for(InterfaceA arr : arrs) {
            arr.methodCommon();
        }


    }
}
