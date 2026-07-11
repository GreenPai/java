package generic.ex3;

import generic.animal.Animal;

/**
 * AnimalHospital를 썼을 때
 * Object만 사용 가능. -> Animal의 메서드를 사용하지 못한다.
 *
 * AnimalHospitalV3를 Animal에 대해서만 제네릭 하도록 설정
 */
public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T getBigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }

}