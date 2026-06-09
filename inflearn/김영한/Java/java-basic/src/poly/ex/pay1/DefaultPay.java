package poly.ex.pay1;

/**
 *  다형성과 설계 : 2026/06/09
 */
public class DefaultPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
