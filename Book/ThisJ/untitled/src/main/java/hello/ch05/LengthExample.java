package hello.ch05;

public class LengthExample {
    public static void main(String[] args) {
        String ssn = "950624-1230123";
        int length = ssn.length();

        String[] ssns = ssn.split("-");

        if(ssns[0].length()==6 && ssns[1].length()==7){
            System.out.println(ssns[0]);
            System.out.println(ssns[1]);
            System.out.println("주문등록번호 자릿수가 맞습니다.");
        }else{
            System.out.println("주문등록번호 자릿수가 다릅니다.");
        }
    }
}
