package springweb.a05_mvcexp.a03_dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import springweb.a05_mvcexp.z01_vo.Region;

public interface A07_RegDao {
	@Select("SELECT * \r\n"
			+ "FROM regions01\r\n"
			+ "WHERE REGION_NAME LIKE '%'||#{region_name}||'%'\r\n"
			+ "order by region_id")
	public List<Region> regionList(@Param("region_name")
		String region_name);
	@Insert("INSERT INTO regions01 values(\r\n"
			+ "			#{region_id},#{region_name})")
	public int insertRegion(Region insert);
	@Select("	select *\r\n"
			+ "	from regions01\r\n"
			+ "	where  region_id = #{region_id}")
	public Region getReg(@Param("region_id") int region_id);
	@Update("	update regions01\r\n"
			+ "	   set region_name = #{region_name}\r\n"
			+ "	where region_id = #{region_id} ")
 	public int updateReg(Region upt);
	@Delete("	delete regions01\r\n"
			+ "	where region_id = #{region_id}")
	public int deleteReg(@Param("region_id") int region_id);

}
