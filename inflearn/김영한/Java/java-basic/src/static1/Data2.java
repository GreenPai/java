package static1;

/**
 *  static : 2026/06/07
 *  Counter를 별로도 만들어서 관리
 *  Counter / int count
 */
public class Data2 {
    public String name;

    public Data2(String name, Counter counter) {
        this.name = name;
        counter.count++;
    }
}
