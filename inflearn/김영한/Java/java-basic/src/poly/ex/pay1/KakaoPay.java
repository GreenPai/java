package poly.ex.pay1;

/**
 *  다형성과 설계 : 2026/06/09
 */
public class KakaoPay implements Pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("카카오페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }

}
