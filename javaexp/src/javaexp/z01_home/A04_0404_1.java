package javaexp.z01_home;

import java.util.Scanner;

public class A04_0404_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
//      [1단계:코드] 5. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
//                      no 과일명  가격
//                       1 사과    3000            
//                       2 바나나   4000           
//                       3 딸기    12000
//                         총계    19000
/*		전역변수 : 총계값(totPay), 전체계산내용출력문자열(show)
 * 	    지역변수 : 번호 no, 과일명(fname), 과일의가격(price)
 *      Scanner sc = new Scanner(System.in);
 *      .nextInt(), .nextLine(), 
 *      Integer.parseInt()
 *      for(int cnt=1;cnt<=3;cnt++){}
 */
		Scanner sc = new Scanner(System.in);
		int totPay=0;
		String show="no\t과일명\t가격\n";
		for(int cnt=1;cnt<=3;cnt++){
			System.out.println(cnt+"번째 과일 정보 입력");
			System.out.print("과일명:");
			String fname=sc.nextLine();
			System.out.print("과일가격:");
			int price=Integer.parseInt(sc.nextLine());
			totPay+=price;
			show+=cnt+"\t"+fname+"\t"+price+"\n";
		}
		show+="\t총계\t\t"+totPay;
		System.out.println(show);
		
	}

}
