package generic.ex3;

/**
 * 현재 제네릭를 사용하면 T로 타입을 모르기 때문에
 * animal이 먼지 모른다. -> 메서드를 못쓴다.
 * 병원을 동물로 제한 하고 싶은데
 * integer, Object 병원이 가능하다.
 */
public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용 가능
        animal.toString();
        animal.equals(null);

        // 컴파일 오류
        //System.out.println("동물 이름: " + animal.getName());
        //animal.sound();
    }

    public T getBigger(T target) {
        // 컴파일 오류
        //return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}