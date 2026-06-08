package poly.basic;


/**
 *  다형성 : 2026/06/08
 *  부모는 자식을 담을 수 잇지만
 *  자식은 부모를 담을 수 없다 Child child = new Parent(); : 컴파일 오류
 */
public class Child extends Parent {

    public void childMethod() {
        System.out.println("Child.childMethod");
    }

    /*
    @Override
    public void parentMethod(){
        System.out.println("핫");
    }
     */

}
