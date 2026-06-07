package construct.ex;

/**
 *  생성자 : 2026/06/07
 *  생성자 사용
 *  오버로딩으로 다양한 생성자 생성
 */
public class Book {

    String title; //제목
    String author; //저자
    int page; //페이지 수

    //코드 완성

    Book() {
        this("", "", 0);
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " +author+ ", 페이지: " + page);
    }
}
