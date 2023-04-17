package javaexp.a08_relation.vo;


public class Music {
	// 필드는 접근제어자를 private 선언(직접 접근이 안되고 간접접근 처리)
	private String title;
	private String singer;
	private int pubYear;
	// 생성자나 메서드의 접근제어자는 public
	public Music() {
		// TODO Auto-generated constructor stub
	}
	public Music(String title, String singer, int pubYear) {
		this.title = title;
		this.singer = singer;
		this.pubYear = pubYear;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getPubYear() {
		return pubYear;
	}
	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}
	
}
