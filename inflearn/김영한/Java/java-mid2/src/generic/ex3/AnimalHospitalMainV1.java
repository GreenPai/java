package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 코드의 방향:
 * 개 병원에 고양이를 넣을 때 발생하는 코드의 문제점을 해결
 * 해결:
 * Animal을 이용해 다형성을 이용한 문제 해결
 * 문제:
 * 1. Cat, Dog 구분하지 않고 사이즈를 비교 하기에 컴파일 오류가 발생하지 않는 문제.
 * 2. 항상 타입 변환 필요
 */
public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
        dogHospital.set(cat); // 매개변수 체크 실패: 컴파일 오류가 발생하지 않음

        // 문제2: 개 타입 반환, 캐스팅 필요
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}