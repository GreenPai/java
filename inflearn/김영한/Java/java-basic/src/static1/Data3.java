package static1;

/**
 *  static : 2026/06/07
 *  int를 static으로 관리
 */
public class Data3 {
    
    // name / count -> 멤버 변수
    public String name; // 인스턴스 변수
    public static int count; //static, 정적, 클래스 변수

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
