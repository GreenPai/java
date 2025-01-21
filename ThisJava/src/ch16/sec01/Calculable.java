package ch16.sec01;

@FunctionalInterface
public interface Calculable {
    // 반환 타입 명시
    public void calculate(int x, int y); // 반환 타입이 void인 추상 메서드
}
