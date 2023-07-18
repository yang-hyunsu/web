package backendWeb.z02_exp;

import java.util.ArrayList;
import java.util.List;

import springweb.a05_mvcexp.z01_vo.Member;

public class A01_InterfaceExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다형성의 형태,  추상 ==> 실제
		Flyway f01 = new CountryFly();
		// 추상인터페이스의 메서드가 실제를 상속해주었기 때문에
		// 상속한 실제 객체의 내용을 처리해준다.
		f01.flying();
		// service단에서.
		// Autowired 처리
		MemberDao dao;
		dao=new MemberDaoImpl();
		dao.memberList();
		
	}
}
interface MemberDao{
	public List<Member> memberList();
}
// mybatis ==> XXMapper.xml의해서 sql 
class MemberDaoImpl implements MemberDao{

	@Override
	public List<Member> memberList() {
		// TODO Auto-generated method stub
		// sql의 데이터 처리에 의해 최종적으로 결과 ArrayList
		// 가 있는 객체를 생성해준다.
		ArrayList<Member> mlist = new ArrayList<Member>();
		mlist.add(new Member());
		mlist.add(new Member());
		mlist.add(new Member());
		mlist.add(new Member());
		return mlist;
	}
	
}

interface Flyway{
	void flying();
}
class CountryFly implements Flyway{
	@Override
	public void flying() {
		System.out.println("우리 동네를 나르다");
		
	}
	
}


