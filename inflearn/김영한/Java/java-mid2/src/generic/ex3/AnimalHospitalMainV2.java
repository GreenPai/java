package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/**
 * AnimalHospital를 썼을 때
 * Object만 사용 가능. -> Animal의 메서드를 사용하지 못한다.
 * 병원을 동물로 제한 하고 싶은데
 * integer, Object 병원이 가능하다.
  */
public class AnimalHospitalMainV2 {

    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();

        dogHospital.set(new Dog("세월이", 200));
        dogHospital.checkup();
    }
}