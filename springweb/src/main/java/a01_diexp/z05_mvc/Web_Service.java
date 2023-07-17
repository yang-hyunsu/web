package a01_diexp.z05_mvc;

import java.util.List;

import org.springframework.stereotype.Service;

import backendWeb.z01_vo.Dept;

@Service
public class Web_Service {
	private Web_Dao dao;
	public Web_Service() {
		dao = new Web_Dao();
	}
	public List<Dept> deptList(Dept sch){
		return dao.deptList(sch);
	}
}
