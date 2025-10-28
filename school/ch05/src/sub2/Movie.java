package sub2;

public class Movie {

	//속성
	private String title;
	private String director;
	private double rating;
	private int availableSeats;
	
	//  Getter/Setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	//생성자
	public Movie(String title, String director, double rating, int availableSeats) {
		this.title = title;
		this.director = director;
		this.rating = rating;
		this.availableSeats = availableSeats;
	}
	
	
	//기능
	public boolean reserveSeat() {
		if(this.availableSeats>0) {
			availableSeats--;
			return true;
		}else {
			return false;
		}
	}
	
	public void cancelReservaton() {
		availableSeats++;
	}
	
	public void showDetails() {
		System.out.println("영화 제목 : " + this.title);
		System.out.println("감독 이름 : " + this.director);
		System.out.println("영화 평점 : " + this.rating);
		System.out.println("예약 가능한 좌석 수  : " + this.availableSeats);
		
	}
	
	
	
	
	
	
}
