package static1;

/**
 *  static : 2026/06/07
 *  객체의 생성된 갯수를 알고 싶어서 프로그래밍을 했으나
 *  count 변수가 항상 새로 만들어지므로 1이 출력된다.
 */
public class DataCountMain1 {

    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count=" + data1.count); // 1

        Data1 data2 = new Data1("B");
        System.out.println("B count=" + data2.count); // 1

        Data1 data3 = new Data1("C");
        System.out.println("C count=" + data3.count); // 1
    }
}
