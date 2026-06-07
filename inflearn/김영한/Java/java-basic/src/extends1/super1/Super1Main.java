package extends1.super1;

/**
 *  상속 super : 2026/06/08
 *  this value = child
 *  super value = parent
 *  Child.hello
 *  Parent.hello
 */
public class Super1Main {

    public static void main(String[] args) {
        Child child = new Child();
        child.call();

    }
}
