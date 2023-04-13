package javaexp.z02_util;

public class A06_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 임의의 수를 처리해주는 Math객체의 random()메서드
		1. 여러가지 임의의 수를 가져와서 프로그램에 적용하여 처리할
			때, 활용하는 내장된 기능 함수(메서드)
		2. 기본 형식
			1) 기본 범위
				0.0 <= Math.random() < 1.0
			2) 임의의 정수 범위 처리
				0~9 정수범위처리
				0.0*10 <= Math.random()*10 < 1.0*10
				0.0 <= Math.random()*10 < 10.0
				0 <=(int)(Math.random()*10) < 10
				0~9까지 10개의 경우가 나오는 것을 확인
				1~10 정수범위처리 
				1 <=(int)(Math.random()*10+1) < 11
			3) 공식 정리
				(int)(Math.random()*경우의수+시작수)
				Q1) 주사위 던지는 수를 처리할려면?
				(int)(Math.random()*6+1)
				Q2) 0/1 두가지 경우가 나오는 처리할려면?
				(int)(Math.random()*2)
				
				 
		 * */
		System.out.println("임의의 수");
		double num01 = Math.random();
		System.out.println(num01);
		System.out.println(num01*10);
		System.out.println((int)(num01*10));
		System.out.println((int)(num01*10+1));
		int dice01 = (int)(Math.random()*6+1);
		System.out.println("나온 주사위 :"+dice01);
		int gameDiv = (int)(Math.random()*2);
		System.out.println("나온수(0/1):"+gameDiv);
		String gDiv = gameDiv==0?"짝":"홀";
		System.out.println("임의의 짝/홀:"+gDiv);
		// ex1) 0~100까지 임의의 수를 point에 할당하여 출력하세요
		int point = (int)(Math.random()*101); // 1~100
		System.out.println("임의의 점수:"+point);
		// ex2) 구슬 8개을 임의로 쥘 때, 나오는 수를 출력?
		int mCnt = (int)(Math.random()*8+1);
		System.out.println("구슬의 수:"+mCnt);
		// ex3) 위 수가 홀인지 짝인지 처리하여 출력(hint %-나머지연산자)
		int divM = mCnt%2; // 2로 나누었을 때, 나머지 0/1
		System.out.println("구분자 :"+ divM );
		System.out.println("홀/짝?"+(divM%2==0?"짝":"홀"));
		
		
	}

}
