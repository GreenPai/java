package poly.car1;

/**
 *  다형성 - 역할과 구현 예제 : 2026/06/09
 *  k3 , Modal3Car 대신 Car을 알고 있음.
 */
public class Driver {

    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
