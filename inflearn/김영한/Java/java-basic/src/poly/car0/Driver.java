package poly.car0;

/**
 *  다형성 - 역할과 구현 예제 : 2026/06/09
 */
public class Driver {

    // 차에 대해 의존한다. / 의존한다.
    private K3Car k3Car;
    private Model3Car model3Car; //추가

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    //추가
    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }

}
