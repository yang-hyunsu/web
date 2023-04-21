package javaexp.a09_inherit.abstrac;

import java.util.ArrayList;

public class A02_CompanyAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ex) 
		상위 추상 클래스 Company 회사명, working() 공통, 
					 earnMoney 돈을 버는 방법() 추상 
		하위 실제 클래스 HyunDae, Samsung
		
		ArrayList<Company> comList =new ArrayList<Company>();			 					  
		 * 
		 * */
		ArrayList<Company> comList =new ArrayList<Company>();
		comList.add(new Samsung());
		comList.add(new HyunDae());
		for(Company com:comList) {
			com.working();
			com.earnMoney();
		}
	}

}
abstract class Company{
	private String name;

	public Company(String name) {
		this.name = name;
	}	
	public String getName() {
		return name;
	}
	public void working() {
		System.out.println(name+"에서 일을 하다!!");
	}
	public abstract void earnMoney();
}
class HyunDae extends Company{
	public HyunDae() {
		super("현대 중공업");
	}
	@Override
	public void earnMoney() {
		System.out.println(getName()+"은 선박을 건조하여 돈을 벌다!!");
	}
}
class Samsung extends Company{
	public Samsung() {
		super("삼성전자");
	}
	@Override
	public void earnMoney() {
		System.out.println(getName()+"  전자제품을 판매하여 돈을 벌다!!");
	}
}


