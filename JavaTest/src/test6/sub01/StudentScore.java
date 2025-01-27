package test6.sub01;

public class StudentScore {
	
	private String studentName; //학생 이름
	private String studentId;   //학생 아이디
	private String subject;		//과목명
	private double score;		//과목 점수
	
	
	StudentScore(String studentName, String studentId, String subject, double score){
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}
	
	public void updateScore(double score) {
		
		if(score > 100) {
			System.out.println("잘못된 점수 입력");
			return;
		}
		this.score = score;
		System.out.println("점수 수정 완료");
	}
	
	public double getScore() {
		return score;
	}
	
	public void printStudentInfo() {
		System.out.println("학생이름 : " + studentName);
		System.out.println("학생 ID : " + studentId );
		System.out.println("과목 : " + subject);
		System.out.println("점수 : " + score);
	}
	

}
