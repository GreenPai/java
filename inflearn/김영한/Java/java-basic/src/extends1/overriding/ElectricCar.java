package extends1.overriding;

/**
 *  상속 : 2026/06/07
 *
 */
public class ElectricCar extends Car {

    // Car에도 move가 있고 자식에도 있으면 자식의 move를 사용한다.
    // 실행 순서가 자식에서 찾고 부모에서 찾기에 Override를 하지 않아도 move()를 오버라이드 할 수 있다.
    // 하지만 @Override를 명시하는 순간 실수를 줄일 수 있다.
    // 상위 부모에 move가 없다면 오버라이드에서 move가 없다고 오류를 띄운다.

    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
