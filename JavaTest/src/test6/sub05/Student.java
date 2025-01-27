package test6.sub05;

import java.awt.geom.GeneralPath;

public class Student {
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int[10];
	}
	
	public void enrollSubject(Subject subject){
		this.subjects[subjectCount++] = subject;
		subject.addStudent(this);
		System.out.println(this.name +" - " +  subject.getName() + " 과목 신청완료");
	}
	
	public void setScore(Subject subject, int score){
		for(int i=0; i<subjectCount; i++) {
			if(subject.getName().equals(subjects[i].getName())) {
				scores[i] = score;
			}
		}
		
		 System.out.println(name + " - " + subject.getName() +" 점수 입력완료");
	}
	
	public void printStudentInfo(){
		System.out.println("학생명 : " + name);
		System.out.println("아이디 : " + studentId );
		System.out.println("성적");
		for(int i=0; i<subjectCount; i++) {
			System.out.println(" - " + subjects[i].getName() + ":" + scores[i] );
		}
	}
	
	public String getName() {
		return name;
	}
}