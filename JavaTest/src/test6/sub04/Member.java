package test6.sub04;

public class Member {
	private String name;
	private String memberId;
	private Book book;
	
	public Member(String name, String memberid) {
		this.name = name;
		this.memberId = memberid;
	}
	
	public void borrowBook(Book book) {
		book.borrowBook();
		this.book = book;
	}
	
	public void returnBook(Book book) {
		book.returnBook();
		this.book = null;
	}
	
	public void getMemberInfo() {
		System.out.println("회원명 : " + name);
		System.out.println("아이디 : " + memberId);
		System.out.println("대출한 도서 : " + ((book== null) ? "없음" : book.getTitle()));
	}
}
