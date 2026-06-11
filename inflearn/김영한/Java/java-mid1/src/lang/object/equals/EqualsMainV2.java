package lang.object.equals;


/**
 * Object 클래스 - 2026 6월 11일
 * equals 객체에서 오버라이딩
 *
 * 오버라이딩 햇을 때 true
 * 오버라이딩 안했을 때 false
 */
public class EqualsMainV2 {

    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + user1.equals(user2));
    }
}
