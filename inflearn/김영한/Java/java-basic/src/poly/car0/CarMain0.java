package poly.car0;

/**
 *  다형성 - 역할과 구현 예제 : 2026/06/09
 *
 *  문제점 :
 *  차를 추가할 수록 필요한 코드 수가 많아진다.
 *
 *  차가 늘어날 수록 운전자가 구체적인 차에 대한 것을 알아야되고
 *  차에 대한 분기를 추가해야된다.
 */
public class CarMain0 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();

        System.out.println("driver - ");

        //추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
