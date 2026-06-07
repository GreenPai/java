package construct;

/**
 * 생성자 : 2026/06/07
 * nameParameter로 들어오고 nameField에 넣으로 문제 없음
 * 자동으로 this.이 들어감
 */
public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}
