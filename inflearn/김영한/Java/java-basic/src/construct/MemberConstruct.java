package construct;

/**
 *  생성자 : 2026/06/07
 *  생성자의 이름은 클래스 이름과 같아야 한다. 따라서 첫 글자도 대문자
 *  생성자는 반환타입이 없다.
 */
public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    MemberConstruct(String name, int age) {
        this(name, age, 50); //변경
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
