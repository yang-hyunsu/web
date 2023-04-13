package javaexp.a05_process;

import java.util.Scanner;

public class A11_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# while문 : 조건에 따란 반복을 계속할지 결정하는
			경우에 활용되는 반복문
		1. 기본형식
			while(반복할조건){
				반복할 조건이 true일 때 처리할 내용
			}
			무한 반복안에서 break
			while(true){
				처리할 내용
				if(반복문을 벗어날 조건){
					break;
				}
			}
			
			
		2. 처리예
			1) 메뉴가 입력받아서, Q를 누를 때까지 처리
			2) 구매한 과일의 가격을 입력받아서 -1을 입력할 때까지 처리
			
		*/
		int cnt =1;
		while(cnt<=10) {
			System.out.println((cnt++)+"번째 반복");
		}
		
		
		
//		Scanner sc = new Scanner(System.in);
//		String flist = "";
//		while(true) {
//			System.out.print("구매할 과일명을 입력(종료시Q):");
//			String fruit = sc.nextLine();
//			System.out.println("입력한 내용:"+fruit);
//			if(fruit.equals("Q")) {
//				break;
//			}else {
//				flist+=fruit+" ";
//			}
//		}
//		System.out.println("구매한 과일리스트:"+flist);
//		System.out.println("종료!!");
		// ex1) 10~20까지 while문을 통해서 출력하세요
		int cnt02 = 10;
		while(cnt02<=20) {
			System.out.println(cnt02+++"번째 while문");
		}
		// ex2) 구매할 물건의 가격입력, 종료시 -1  
		//      총비용:@@
		Scanner sc2 = new Scanner(System.in);
		int totPay = 0;
		int cnt3 = 0;
		while(true) {
			System.out.print("구매할 물건의 가격입력(종료시-1):");
			int pay = sc2.nextInt();
			if(pay==-1) {
				System.out.println("구매완료!!");
				break;
			}else {
				totPay+=pay;
				cnt3++;
			}
		}
		System.out.println("구매한 물건의 갯수:"+cnt3);
		System.out.println("구매한 전체 비용:"+totPay);
	}

}
