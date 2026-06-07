package extends1.overriding;

/**
 *  상속  : 2026/06/07
 *  HydrogenCar 클래스를 추가하고 car에 기능을 추가
 *  car에 기능을 추가함으로서 자식들에게도 기능이 생겼다.
 *  자식 car들에 들어갈 기능이 부모 car에서 관리가 되기에 중복이 줄어든다.
 */
public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}
