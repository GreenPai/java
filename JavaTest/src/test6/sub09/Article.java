package test6.sub09;

import java.util.ArrayList;
import java.util.List;

public class Article {
	private String no;
	private String title;
	private String content;
	private User user;
	private List<Comment> comments;
	
	
	//| 번호 | 제목 | 내용 | 작성자 |	
	public Article(int no, String title, String content, User user) {
		this.no = String.valueOf(no);
		this.title = title;
		this.content = content;
		this.user = user;
		this.comments = new ArrayList<>();
	}
	
	public String getNo() {
		return no;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	public User getUser() {
		return user;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public List<Comment> getComments(){
		return comments;
	}
	
	
}
