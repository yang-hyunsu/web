package javaexp.a08_relation.vo;

public class Cpu {
	private String company;
	private String spec;
	public Cpu() {
		// TODO Auto-generated constructor stub
	}
	public Cpu(String company, String spec) {
		this.company = company;
		this.spec = spec;
	}
	public void showInf() {
		System.out.println("# cpu 정보 #");
		System.out.println("제조사:"+company);
		System.out.println("spec:"+spec);
	}
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	
}
