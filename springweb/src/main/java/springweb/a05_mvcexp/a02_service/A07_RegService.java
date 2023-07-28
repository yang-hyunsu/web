package springweb.a05_mvcexp.a02_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a05_mvcexp.a03_dao.A07_RegDao;
import springweb.a05_mvcexp.z01_vo.Region;

@Service
public class A07_RegService {
	@Autowired
	private A07_RegDao dao;
	public List<Region> regionList(String region_name){
		if(region_name==null) region_name="";
		return dao.regionList(region_name);
	}
	public String insertRegion(Region insert) {
		return dao.insertRegion(insert)>0?
				"등록성공":"등록되지 않음";
	}
	public Region getReg(int region_id){
		return dao.getReg(region_id);
	}
	public String updateReg(Region upt){
		return dao.updateReg(upt)>0?"수정성공":"수정되지않음";
	}
	public String deleteReg(int region_id){
		return dao.deleteReg(region_id)>0?"삭제성공":"삭제되지않음";
	}		

}
