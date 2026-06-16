package lang.string.test;

/**
 * String 문제와 풀이 - 2026 6월 16일
 */
public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext);
        String filename = str.substring(0, extIndex);
        String extName = str.substring(extIndex);
        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}
