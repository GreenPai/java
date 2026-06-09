package poly.ex.pay1;

public class MaplePay implements Pay{
    
    
    @Override
    public boolean pay(int amount) {
        System.out.println("메이플 페이 성공");
        return true;
    }
}
