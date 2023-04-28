package javaexp.a11_api;

import java.util.Random;

public class A08_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 임의의 수를 보다 효과적을 처리하는 Random api 객체
		1. boolean, int, long, float, double 등의
			데이터를 메서드를 이용해서 임의로 처리 할 수 있다.
		2. 난수를 만드는 알고리즘에 사용되는 종자값(seed) 설정
			가능하여 처리된다. 종자값이 설정되면 처음에 나온
			임의 수는 계속 보존된다.
		*/
		Random r1 = new Random();
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextInt());
		// r1.nextInt(경우의수)+시작수
		System.out.println(r1.nextInt(5)+1);
		System.out.println("주사위:"+(r1.nextInt(6)+1));
		System.out.println("0~100:"+r1.nextInt(101));
	}

}
