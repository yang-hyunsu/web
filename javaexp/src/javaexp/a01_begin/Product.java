package javaexp.a01_begin;
// javac Product.java
// Product.class
// java Product(X) main()메서드가 없기에 수행 불가능
// main()메서드 있는 곳에서 호출하여 사용
public class Product {
	String name;
	int price;
	int cnt;
	public Product(String name, int price, int cnt) {
		this.name =name;
		this.price = price;
		this.cnt = cnt;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void show() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(cnt);
	}
}
