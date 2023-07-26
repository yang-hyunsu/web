package springweb.a05_mvcexp.a03_dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import springweb.a05_mvcexp.z01_vo.Job;

public interface A06_JobDao {
	@Select("SELECT * \r\n"
			+ "FROM jobs\r\n"
			+ "WHERE job_id LIKE '%'||#{job_id}||'%'\r\n"
			+ "AND job_title LIKE '%'||#{job_title}||'%'")
	public List<Job> getJobList(Job sch);
}
