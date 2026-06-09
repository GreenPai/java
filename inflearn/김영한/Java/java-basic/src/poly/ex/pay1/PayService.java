package poly.ex.pay1;

/**
 *  다형성과 설계 : 2026/06/09
 *  새로운 결제가 만들어져도 서비스는 바뀌지 않는다.
 *  PayStore만 바뀐다.
 */
public class PayService {

    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }

}