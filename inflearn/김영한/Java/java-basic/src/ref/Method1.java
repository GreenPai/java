package ref;

/**
 * 기본형과 참조형 : 2026/06/06
 */
public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student(); //x001
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student(); //x002
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1); //이름:학생1 나이:15 성적:90
        printStudent(student2); //이름:학생2 나이:16 성적:80
    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
