package collection.set;

/**
 * 문자열 해시 코드
 * 
 * 현재 문제 : AB, BA 같음
 */
public class StringHashMain {

    static final int CAPATICY = 10;

    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';
        System.out.println(charA + " = " + (int)charA);
        System.out.println(charB + " = " + (int)charB);

        //hash
        System.out.println("hash(A) = " + hashCode("A"));
        System.out.println("hash(B) = " + hashCode("B"));
        System.out.println("hash(AB) = " + hashCode("AB"));
        System.out.println("hash(BA) = " + hashCode("BA"));

        //hashIndex
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));
        System.out.println("hashIndex(BA) = " + hashIndex(hashCode("BA")));

    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPATICY;
    }
}