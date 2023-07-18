package a01_diexp.z07_mvcAuto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backendWeb.a01_dao.A04_PreparedDao;
import backendWeb.z01_vo.Emp;

@Service
public class A02_EmpService {

	
	// 컨테이너에 객체 안에 있는 Autowired에 의해
	// 자동 로딩되게 한다.
	// new XXX() 없이 컨테이너에 있는 객체를 
	// 활용할 수 있다.
	@Autowired
	private A04_PreparedDao dao;
	
	
	public void callService() {
		System.out.println("사원 서비스 객체");
		for(Emp emp:dao.getEmpList()) {
			System.out.print(emp.getEmpno()+"\t");
			System.out.print(emp.getEname()+"\t");
			System.out.print(emp.getJob()+"\n");
		}
		
		
	}
}
