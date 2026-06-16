package lang.string.test;

/**
 * String 문제와 풀이 - 2026 6월 16일
 */
public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] parts = email.split("@");
        String idPart = parts[0];
        String domainPart = parts[1];

        System.out.println("ID: " + idPart);
        System.out.println("Domain: " + domainPart);
    }
}
