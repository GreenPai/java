package generic.ex4;

import generic.animal.Animal;

// 제네릭 여러개 사용할 때
public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    // 위의 T와 메서드의 T는 다르다.
    // <Z> Z 형식으로 다르게 주는게 좋다.
    public <T> T printAndReturn(T t) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        // t.getName(); // 호출 불가 메서드는 <T> 타입이다. <T extends Animal> 타입이 아니다.
        return t;
    }

}