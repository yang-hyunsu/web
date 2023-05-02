package javaexp.a11_api;

import java.util.ArrayList;

public class A06_WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# Wrapper 클래스
		1. 기본데이터유형을 사용하다 보면 여러 형태로 변환이 필요하거나
			기능적으로 처리해야되는 경우가 많다. type이 기본 유형으로
			되다보니 형변환이 일어나지 않으면 이러한 기능에 대한 한계가
			발생한다.
		2. 이 때, 자바 api에서는 기본 데이터유형과 연결되는 객체 유형
			을 만들어 필요에 따라 제공되는 메서드를 이용해서
			여러가지 데이터 유형 변경, 치환, 기능 처리를 할 수 있게
			하는데 이것을 Wrapper 클래스라고 한다.
		3. 형태..(기본유형과 연결)
			byte ==> Byte
			char ==> Character(*)
			...
			int ==> Integer(*)
			..
			double ==> Double
			boolean ==> Boolean
		 * */
		int num01 = 25; // 기본데이터 유형
		Integer numWrap01 = new Integer(num01);
		// Wrapper 클래스 
//		numWrap01.XXXX() 를 통해 포함되는 여러기능메서드 지원
		System.out.println(numWrap01.byteValue());
		System.out.println(numWrap01.hashCode());
		System.out.println(numWrap01.MAX_VALUE);
		/*
		3. 변경 처리 
			1) 기본데이터 ==> Wrapper class(Boxing)
				Integer ob1 = Integer.valueOf(1000);
				1000 정수를 Wrapper클래스 ob1에 할당.
				Byte ob2 = Byte.valueOf(25); 
			2) Wrapper class ==> Wrapper class(UnBoxing)
		 * */
		// Boxing
		Byte obj01 = Byte.valueOf("25");
		Integer obj02 = Integer.valueOf(30);
		Double obj03 = Double.valueOf("30.7");
		System.out.println(obj01);
		System.out.println(obj02);
		System.out.println(obj03);
		// Ex) boolean, float, short, char를  
		//    기본데이터를 박싱하여 출력하세요..
		Boolean obj04 = Boolean.valueOf(true);
		Float obj05 = Float.valueOf("40.7F");
		Short obj06 = Short.valueOf("30");
		Character obj07 = Character.valueOf('A');
		System.out.println(obj04);
		System.out.println(obj05);
		System.out.println(obj06);
		System.out.println(obj07);
		// boxing(객체)되었을 때, 지원하는 여러가지 기능 메서드를
		// 활용할 목적으로 처리..
		
		// UnBoxing : 기본유형의 데이터로 할당..
		byte num05 = obj01.byteValue();
		int num06 = obj02.intValue();
		double num07 =obj03.doubleValue();
		/*
		# Auto Boxing/Auto UnBoxing
		1. 기본 데이터 유형을 보다 간편하게 객체형으로 또는
			기본 유형으로 변경처리하는 기능이 필요해서 자바에서는
			이러한 auto 기능을 대입연산자로 지원하고 있다.
		 * */
		// Auto Boxing
		Integer obj10 = 30; // 바로 대입처리..
		// Auto UnBoxing
		Double obj11 = Double.valueOf("30.7");
		double num08 = obj11;
		System.out.println(obj10);
		System.out.println(num08);
		ArrayList<Integer> iList = new ArrayList<Integer>();
		iList.add(Integer.valueOf(25));
		iList.add(Integer.valueOf(75));
		iList.add(30); // Integer num = 30 할당 가능..
		iList.add(70);
		System.out.println("# auto unboxing에 의해 바로 연산 가능#");
		for(Integer i : iList) {
			System.out.println(i+50);
		}
		// ex) args에서 3000 true 40.2F   int  boolean float데이터 유형  
		//     문자열로 입력받아서 각각의 Wrapper 클래스에 할당하고
		//     출력하세요..
		Integer data01 = Integer.valueOf(args[0]);
		Boolean data02 = Boolean.valueOf(args[1]);
		Float data03 = Float.valueOf(args[2]);
		System.out.println(data01);
		System.out.println(data02);
		System.out.println(data03);
		
		
		
		
		
		
		
		
		
	}

}
