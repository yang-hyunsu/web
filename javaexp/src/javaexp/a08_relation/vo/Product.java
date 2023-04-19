package javaexp.a08_relation.vo;

public class Product {
	private String name;
	private int price;
	private int cnt;
	public Product() {
		
		// TODO Auto-generated constructor stub
	}
	public Product(String name, int price, int cnt) {
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	// 출력과 함께 단위계를 리턴 처리..
	public int totBuyInfo() {
		System.out.print(name+"\t");
		System.out.print(price+"\t");
		System.out.print(cnt+"\t");
		int tot = price*cnt;
		System.out.print(tot+"\n");
		return tot;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}
