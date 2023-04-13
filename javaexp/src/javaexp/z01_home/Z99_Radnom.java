package javaexp.z01_home;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Z99_Radnom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mlist = Arrays.asList(new String[]{
			"강경웅", "강준규", "김동현", "김예진",
			"김윤아", "김학수", "노현우", "박다솜",
			"박상우", "서유림", "서지우", "신예원",
			"유영재", "유예나", "윤석민", "이성현",
			"이은서", "임소정", "정다은", "정준혁",
			"최선영"				
		});
		Collections.shuffle(mlist);
		System.out.println(mlist.get(0));
//		System.out.println(mlist.get(1));
//		System.out.println(mlist.get(2));
	}

}
