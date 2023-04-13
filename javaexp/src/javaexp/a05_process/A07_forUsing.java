package javaexp.a05_process;

import java.util.Scanner;

public class A07_forUsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# for의 활용
		1. 여러가지 출력형식 처리
		2. for문과 전역변수 사용
		3. for문에서 조건문 사용
		4. for문 안에 for문(이중 for문) 사용
		 * */
		for(int cnt = 1;cnt<=10;cnt++) {
			// 줄바꿈 처리:System.out.println();
			// 특수문자/일반문자 활용 처리: \t, \n
			System.out.print(cnt+"\t");
		}
		System.out.println();
		// 1 + 2 + 3 + ....
		for(int cnt = 1;cnt<=10;cnt++) {
			System.out.print(cnt+" + ");
		}
		System.out.println();
		// ex) 다음과 형태로 출력해보세요
		// 1. 카운트 다운 시작 10, 9, 8..... 0.  완료
		System.out.print("카운트 다운 시작 ");
		for(int cnt=10;cnt>=0;cnt--) {
			System.out.print(cnt+", ");
		}
		System.out.println(" 완료!");
		// 2. 100에서부터 120까지 합산 처리
		//    100 + 101 + ......    120 +
		//    합산처리 완료
		int start = 100; // 변수의 범위에 따라서 for문 처리
		int end = 120;
		System.out.println(start+"에서부터 "+end+"까지 합산 처리");
		for(int cnt=start;cnt<=end;cnt++) {
			System.out.print(cnt+" + ");
		}
		System.out.println("\n합산처리 완료");
		
		// 3. 학생 번호(1~10)와 점수(임의의 점수-0~100)
		//    번호	점수
		//    1		78
		//    2		98
		//    3		88
		System.out.println("번호\t점수");
		for(int cnt=1;cnt<=10;cnt++) {
			System.out.print(cnt+"\t");
			System.out.println((int)(Math.random()*101));
		}
		
		
		// 4. 임의의 구구단 출력 
		//    단수 : @@ 단(2~9) (임의값) for문 1~9반복
		//    @@ X 1 = @@ 
		//    @@ X 2 = @@ 
		//    @@ X 3 = @@ 
		//    @@ X 4 = @@ 
		// 전역변수로 설정해 반복문 안에 재활용
		int grade = (int)(Math.random()*8+2);
		System.out.println("단수 :"+grade+"단");
		for(int cnt =1;cnt<=9;cnt++) {
			System.out.println(grade+" X "+cnt+
					" = "+(grade*cnt));
			// + 연산이외는 처리가 된다.
		}
		// 과일의 단가를 입력하고 해당 과일의 1~10까지 구매
		// 총계를 아래 형식으로 출력하세요..
		// 단가 : @@@
		// 갯수	총계
		// 1개   @@원
		// 2개   @@원
		// 3개   @@원
		// 4개   @@원
		// ..
		// 10개  @@원
		Scanner sc = new Scanner(System.in);
		System.out.print("과일의 단가를 입력:");
		int fruPrice = sc.nextInt();
		System.out.println("단가:"+fruPrice);
		System.out.println("갯수\t총계");
		for(int cnt=1;cnt<=10;cnt++) {
			System.out.print(cnt+"\t");
			System.out.print(cnt*fruPrice+"\n");
		}
		fruPrice=25;
		for(int cnt=1;cnt<=10;cnt++) {
			int cnt2=25;
			fruPrice=30;
		}
		for(int cnt=1;cnt<=10;cnt++) {
			int cnt2=25;
		}	
		//cnt2=30;
	}

}
