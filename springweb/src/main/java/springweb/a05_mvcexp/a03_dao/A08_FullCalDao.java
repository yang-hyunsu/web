package springweb.a05_mvcexp.a03_dao;

import java.util.List;

import springweb.a05_mvcexp.z01_vo.Calendar;
// springweb.a05_mvcexp.a03_dao.A08_FullCalDao
public interface A08_FullCalDao {
	public int insertCalendar(Calendar ins);	
	public List<Calendar> calList();
	public int uptCalendar(Calendar upt);
	public int delCalendar(int id);	
	
	public int insertCalendar2(Calendar ins);	
	public List<Calendar> calList2();
	public int uptCalendar2(Calendar upt);	
	public int delCalendar2(int id);	

}
