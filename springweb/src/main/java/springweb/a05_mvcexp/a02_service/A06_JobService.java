package springweb.a05_mvcexp.a02_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a05_mvcexp.z01_vo.Job;
import springweb.a05_mvcexp.a03_dao.A06_JobDao;

@Service
public class A06_JobService {
	
	@Autowired 
	private A06_JobDao dao;
	public List<Job> getJobList(Job sch){
		if(sch.getJob_id()==null) sch.setJob_id("");
		if(sch.getJob_title()==null) sch.setJob_title("");
		return dao.getJobList(sch);
	}

}
