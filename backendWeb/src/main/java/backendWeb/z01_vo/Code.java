package backendWeb.z01_vo;

public class Code {
	private int no;
	private String title;
	private int refno;
	private int ordno;
	public Code() {
		// TODO Auto-generated constructor stub
	}
	public Code(int no, String title, int refno, int ordno) {
		this.no = no;
		this.title = title;
		this.refno = refno;
		this.ordno = ordno;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getRefno() {
		return refno;
	}
	public void setRefno(int refno) {
		this.refno = refno;
	}
	public int getOrdno() {
		return ordno;
	}
	public void setOrdno(int ordno) {
		this.ordno = ordno;
	}
	
}
