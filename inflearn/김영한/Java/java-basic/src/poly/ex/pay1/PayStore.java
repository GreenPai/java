package poly.ex.pay1;

/**
 *  다형성과 설계 : 2026/06/09
 *  바뀌는 부분
 */
public abstract class PayStore {

    //변하는 부분
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new")) {
            return new NewPay();
        } else if (option.equals("maple")){
            return new MaplePay();
        } else {
            return new DefaultPay();
        }
    }
}
