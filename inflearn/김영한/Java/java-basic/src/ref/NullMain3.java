package ref;

/**
 * 기본형과 참조형 : 2026/06/06
 */
public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count=" + bigData.count); // bigData.count=0
        System.out.println("bigData.data=" + bigData.data);   // bigData.data=null

        //NullPointerException
        System.out.println("bigData.data.value" + bigData.data.value);
        // Exception in thread "main" java.lang.NullPointerException: Cannot read field "value" because "bigData.data" is null
        //	at ref.NullMain3.main(NullMain3.java:11)
    }
}
