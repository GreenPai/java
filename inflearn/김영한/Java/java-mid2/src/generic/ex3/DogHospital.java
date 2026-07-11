package generic.ex3;

import generic.animal.Dog;

/**
 * 2026년 7월 10일
 * 제네릭
 * 타입 매개변수 제한
 */
public class DogHospital {

    private Dog animal;

    public void set(Dog animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    // 삼항 연산자 : 어느 동물이 더 큰가
    public Dog bigger(Dog target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}