package ch16.sec02.exam02;

public class ButtonExample {

	public static void main(String[] args) {
		//OK 버튼 객체 생성
		Button btnOk = new Button();
		
		btnOk.setClickListener(() -> {System.out.println("OK 버튼을 클릭했습니다.");});
		
		//OK 버튼 클릭하기
		btnOk.Click();
		
		//Cancle 버튼 객체 생성
		Button btnCancle = new Button();
		
		//Cancel 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
		btnCancle.setClickListener(()->{
			System.out.println("Cancel 버튼을 클릭했습니다.");
		});
		
		btnCancle.Click();
		
	}

}
