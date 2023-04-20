package javaexp.a09_inherit;

public class A06_Poly_Parts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
class ComputerParts{
	private String company;
	private Part[] parts;
	private int idx;
	public ComputerParts(String company) {
		this.company = company;
		parts = new Part[3];
	}
	public void addPart(Part part) {
		if(idx<3) {
			this.parts[idx++] = part;
			System.out.println("부품이 장착되었습니다.");
		}else {
			System.out.println("더 이상 부품을 장착할 수 없습니다.");
		}
		
	}
	public void showPartsInfo() {
		System.out.println(company+" 컴퓨터!!");
		if(parts!=null) {
			for(Part part:parts) {
				if(part!=null)
					part.showInfo();
			}
		}else {
			System.out.println("부품이 장착되지 않았습니다.");		
		}
	}
	
	
}


