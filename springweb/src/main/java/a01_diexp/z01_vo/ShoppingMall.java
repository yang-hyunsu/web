package a01_diexp.z01_vo;

import java.util.ArrayList;
import java.util.List;
// a01_diexp.z01_vo.ShoppingMall
public class ShoppingMall {
	private String sname;
	private List<Member> mlist;
	public ShoppingMall() {
		// TODO Auto-generated constructor stub
	}
	public ShoppingMall(String sname) {
		this.sname = sname;
		mlist = new ArrayList<Member>();
	}
	public void showMemberList() {
		System.out.println(sname+"의 회원들");
		System.out.println("아이디\t이름\t권한\t포인트");
		if(mlist.size()>0) {
			for(Member m:mlist) {
				System.out.print(m.getId()+"\t");
				System.out.print(m.getName()+"\t");
				System.out.print(m.getAuth()+"\t");
				System.out.print(m.getPoint()+"\n");
			}
		}else {
			System.out.println("회원이 없네요!!");
		}
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Member> getMlist() {
		return mlist;
	}
	public void setMlist(List<Member> mlist) {
		this.mlist = mlist;
	}
	
	
}
