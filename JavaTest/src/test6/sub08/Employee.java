package test6.sub08;

public class Employee extends Person{

	private String employeeId;
	private String dept;
	private int salary;
	private Person person;

	public Employee(String name, String birth, String employeeId, String dept, int salary) {
		super(name, birth);
		this.employeeId = employeeId;
		this.dept = dept;
		this.salary = salary;
	}

	public void raiseSalary(int salary) {
		this.salary += salary;
	}
	
	public void changeDept(String dept) {
		System.out.println("부서 변경");
		this.dept = dept;
	}
	
	public void printEmployeeInfo() {
		super.printPersonInfo();
		System.out.println("직원 아이디 : " + employeeId);
		System.out.println("부서  : " + dept);
		System.out.println("급여 : " + salary);
		
	}
	

}
