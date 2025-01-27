package test6.sub05;

public class Subject {
	private String subName;
	private Student[] students;
	private int studentCount;

	public Subject(String subName) {
		this.subName  = subName;
		this.students = new Student[10];
	}
	
	public void addStudent(Student student) {
		this.students[studentCount++] = student;
	}
	
	public void printSubjectInfo() {
		System.out.println("과목명 : " + subName);
		System.out.print("수강생 : " );
		for(Student student : students) {
			if(student != null) {
				System.out.print(student.getName() + ", ");
			}
		}
		
		System.out.println();
	}
	
	public String getName() {
		return subName;
	}

}
