package lang.object.equals;

/**
 * Object 클래스 - 2026 6월 11일
 */
public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));        // 같은 객체인지
        System.out.println("equality = " + (user1.equals(user2)));

        /*
         * public boolean equals(Object obj) {
         *         return (this == obj);
         *     }
         */

    }
}
