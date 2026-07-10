package generic.test.ex2;

/**
 * 2026년 7월 10일
 * 제네릭
 */
public class Pair<T1, T2> {

    private T1 first;
    private T2 second;

    public void setFirst(T1 first) {
        this.first = first;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}