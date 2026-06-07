package extends1.ex2;

/**
 *  상속  : 2026/06/07
 *  Car을 상속받아 move의 기능을 활용한다.
 */
public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
