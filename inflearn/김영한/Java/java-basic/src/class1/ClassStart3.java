package class1;

/**
 * 클래스와 데이터 : 2026/06/06
 * 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하다.
 * 이 설계도와 같은 것이 클래스이다.
 * 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다.
 *
 * 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다.
 */
public class ClassStart3 {

    public static void main(String[] args) {

        /**
         * Student student1 -> 변수 선언
         */
        Student student1;
        student1 = new Student(); //x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //x002 Student 객체 생성
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}
