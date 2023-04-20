package javaexp.a09_inherit;

public class A06_Poly_Parts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerParts com1 = new ComputerParts("조립");
		//com1.showPartsInfo();
		com1.addPart(new Cpu("AMD 6core 3.4GHZ"));
		com1.addPart(new Ram("16G"));
		com1.addPart(new GraphicCard("128bit 6core"));
		com1.showPartsInfo();
	}
}
class GraphicCard extends Part{
	public GraphicCard(String spec) {
		super("그래픽카드", spec);
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("그래픽 카드는 컴퓨터의 동적 화면 처리를 빠르게 한다.");
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
		// parts에 부품 하나라도 추가되어 있을 때..
		if( parts[0]!=null) {
			for(Part part:parts) {
				if(part!=null)
					part.showInfo();
			}
		}else {
			System.out.println("부품이 장착되지 않았습니다.");		
		}
	}
	
	
}


