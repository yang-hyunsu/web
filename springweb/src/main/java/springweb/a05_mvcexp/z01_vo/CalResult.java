package springweb.a05_mvcexp.z01_vo;

import java.util.List;

public class CalResult {
	private String flag;
	private List<Calendar> calList;
	
	public CalResult(String flag, List<Calendar> calList) {
		this.flag = flag;
		this.calList = calList;
	}
	
	public CalResult() {
		// TODO Auto-generated constructor stub
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public List<Calendar> getCalList() {
		return calList;
	}
	public void setCalList(List<Calendar> calList) {
		this.calList = calList;
	}
	
}
