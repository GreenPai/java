package test6.sub04;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public void borrowBook() {
		
		if(isBorrowd) {
			System.out.println("도서 대출 : " + title);
		}else {
			System.out.println(title + " 이미 대출됨");
		}
	}
	
	public void returnBook() {
		isBorrowd = false;
		System.out.println("도서 반납 : " + title);
	}
	
	public void getBookInfo() {
		System.out.println("도서명 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("ISBN : " + isbn);
		System.out.println("대출여부 : " + (isBorrowd ? "불가능" : "가능"));
	}
	
	public String getTitle() {
		return title;
	}
	
}
