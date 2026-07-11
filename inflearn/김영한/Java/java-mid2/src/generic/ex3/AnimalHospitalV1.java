package generic.ex3;

import generic.animal.Animal;

/**
 * 문제:
 * 코드 재사용 X
 * 타입 안정성 O : 개 병원에 고양이 넣으면 오류
 * 해결:
 * Animal을 이용해 다형성을 이용한 문제 해결
 */
public class AnimalHospitalV1 {

    private Animal animal;

    public void set(Animal animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public Animal getBigger(Animal target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}