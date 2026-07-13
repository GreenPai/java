package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

/**
 * 제네릭
 * 문제와 풀이
 *
 * T extends BioUnit 를 하는 이유:
 * Object일 때 .getName, .getHp 불가능
 */
public class Shuttle<T extends BioUnit> {

    private T unit;

    public void in(T t) {
        unit = t;
    }

    public T out() {
        return unit;
    }

    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }

}
