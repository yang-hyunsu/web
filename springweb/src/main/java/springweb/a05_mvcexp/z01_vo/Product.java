package springweb.a05_mvcexp.z01_vo;

import java.util.List;

public class Product {
	private String pname;
	private String address;
	private String[] name;
	private int[] price;
	private int[] cnt;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String[] getName() {
		return name;
	}
	public void setName(String[] name) {
		this.name = name;
	}
	public int[] getPrice() {
		return price;
	}
	public void setPrice(int[] price) {
		this.price = price;
	}
	public int[] getCnt() {
		return cnt;
	}
	public void setCnt(int[] cnt) {
		this.cnt = cnt;
	}

	
}
