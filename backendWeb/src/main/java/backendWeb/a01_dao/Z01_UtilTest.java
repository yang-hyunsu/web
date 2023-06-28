package backendWeb.a01_dao;

import com.google.gson.Gson;

import backendWeb.z01_vo.Person;

public class Z01_UtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		// 객체 ==> json데이터 변환
		Person p01 = new Person("홍길동",25,"서울");
		String jsonData = gson.toJson(p01);
		System.out.println(jsonData);
	}

}
