package extends1.ex1;

/**
 *  상속  : 2026/06/07
 *  Car의 Move와 같은 기능이 중복된다.
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
