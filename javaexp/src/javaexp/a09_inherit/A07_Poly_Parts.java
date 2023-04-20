package javaexp.a09_inherit;

public class A07_Poly_Parts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com01 = new Computer("삼성");
		com01.showPartsInfo();
		com01.addPart(new Cpu("i7 3.4GHZ"));
		com01.showPartsInfo();
		com01.addPart(new Ram("8G"));
		com01.showPartsInfo();
		com01.addPart(new Ssd("500G"));
		com01.showPartsInfo();
		
		// addPart(String name)
		// Part part1 = new Cpu("i7 3.4GHZ")
		// Part part2 = new Ram("8G")
		// addPart(Part part)
		// 
		// ex) Ssd를 상속해서 추가하고 main()에서 호출해보세요..
		
	}

}


class ComputerParts2{
	private String company;
	private Part part;
	public ComputerParts2(String company) {
		this.company = company;
	}
	public void addPart(Part part) {
		this.part = part;
		System.out.println("부품이 장착되었습니다.");
	}
	public void showPartsInfo() {
		System.out.println(company+" 컴퓨터!!");
		if(part!=null) {
			part.showInfo();
		}else {
			System.out.println("부품이 장착되지 않았습니다.");		
		}
	}
	
	
}


