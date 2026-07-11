package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/**
 * AnimalHospital를 썼을 때
 * Object만 사용 가능. -> Animal의 메서드를 사용하지 못한다.
 * AnimalHospitalV3를 Animal에 대해서만 제네릭 하도록 설정
 */
public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        // AnimalHospitalV3<Integer> integerAnimalHospitalV3 = new AnimalHospitalV3<Integer>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1 해결: 개 병원에 고양이 전달
        // dogHospital.set(cat); // 다른 타입 입력: 컴파일 오류

        // 문제2 해결: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}