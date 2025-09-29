package chap5;

public class LengthExample {
    public static void main(String[] args) {
        String ssn = "950624-1230123";
        String ssn1 = ssn.substring(0,6); // 6 앞까지 짤라내기
        String ssn2 = ssn.substring(7); // 7부터 자르기

        System.out.println(ssn1);
        System.out.println(ssn2);
    }
}
