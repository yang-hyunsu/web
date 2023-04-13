package javaexp.z01_home;

import java.util.Scanner;

public class A02_0331 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		0331
//		[1단계:개념] 1. 연산자, 피연산자, 연산식을 예제로 만들어, 해당 내용을 구분하여 설명하세요
//		[1단계:개념] 2. 산술연산자의 종류와 그 특징을 예제를 통하여 설명하세요.
//		[1단계:코드] 3. 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다. 소숫점 이하가 처리된 경우와
//					소숫점 이하가 처리되지 않는 경우를 나누어 코딩하세요
//		[1단계:개념] 3. 증감연산식의 앞에 ++, 뒤에 ++의 차이점을 예제를 통하여 기술하세요.
//		[1단계:개념] 5. 증감대입연산자의 종류를 기술하고 예제를 통하여 설명하세요. 
//		[2단계:코드] 4.구매하는 김밥의 갯수를 선언하고, 1씩 증가하여 김밥의 단가(2500) 아래와 같이 출력
//				김밥 1개 구매  2500 
//				김밥 2개 구매  5000
//				김밥 3개 구매  7500
//		[1단계:개념] 6. 문자열의 비교연산자 사용에서 ==, equals()의 차이점을 기술하세요.
//		[1단계:개념] 7. main()의 args[]의 처리 내용방법 자바 코드를 통한 처리와 함께 기술하세요. 
//		[2단계:코드] 8. args로 물건명1 가격1 갯수1 물건명2 가격2 갯수2로 입력받아 계산서(전체 총계포함)를 출력하세요.
//		[1단계:개념] 9. Scanner의 처리방법을 간단한 예제와 함께 기술하세요.
//		[1단계:코드] 10. Scanner객체를 활용하여 타율계산방법을 확인(검색)하고, 선수명, 타석수, 안타수를 입력 받아 해당 타자의 타율을 출력하세요.
//		[1단계:개념] 11. 비교연산자의 종류를 예시와 함께 기술하세요.
//		[1단계:코드] 12. Scanner를 활용하여 나이를 입력 받아 성인(18이상)여부를 출력하세요 
//		[1단계:개념] 13. 논리연산자의 종류를 예제와 함께 기술하세요.

		/*
		 * 0331 [1단계:개념] 1. 연산자, 피연산자, 연산식을 예제로 만들어, 해당 내용을 구분하여 설명하세요
		 */
//		            연산자 : 연산에 사용되는 표시나 기호
//		            ex) person, book
//		            ex) +, -, *, /, %, =, !=
//		            피연산자 : 연산 대상이 되는 데이터
//		            연산식 : (book/person)
		int person = 5;
		int book = 23;
		System.out.println("공평하게 나눠 갖는 책 : " + (book / person));

		/*
		 * [1단계:개념] 2. 산술연산자의 종류와 그 특징을 예제를 통하여 설명하세요. 산술연산자 : 사칙연산자 + 나머지연산자 ex) +, -,
		 * *, /, %
		 */
		int pen = 10;
		int price = 2000;
		System.out.println("전체 펜 가격 : " + (pen * price));

		/*
		 * 
		 * [1단계:코드] 3. 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다. 소숫점 이하가 처리된 경우와 소숫점 이하가 처리되지 않는
		 * 경우를 나누어 코딩하세요
		 */
		int oranJuice = 500;
		int JuiceCup = 3;
		System.out.println("쥬스 소숫점 이하 불포함 : " + oranJuice / JuiceCup + "cc");
		System.out.println("쥬스 소숫점 이하 포함 : " + (double) oranJuice / JuiceCup + "cc");

		/*
		 * [1단계:개념] 3. 증감연산식의 앞에 ++, 뒤에 ++의 차이점을 예제를 통하여 기술하세요.
		 */

		int a = 5;
		System.out.println(a);
		System.out.println(a++); // 후위 연산자 : 변수를 출력하고 증가
		System.out.println(++a); // 전위 연산자 : 증가된 후 출력

		/*
		 * [1단계:개념] 5. 증감대입연산자의 종류를 기술하고 예제를 통하여 설명하세요.
		 * 
		 * /* 증감대입연산자 : 특정 수 만큼 증가 감소 처리하는 연산자이다. ex) +=, -=, (*=, /=, %=...)\
		 */

		int num1 = 45;
		System.out.println(num1); // 45
		num1 += 71;
		System.out.println(num1); // 45+71 = 116
		num1 -= 55;
		System.out.println(num1); // 116-55 = 61
		num1 *= 2;
		System.out.println(num1); // 61×2 = 122
		num1 /= 3;
		System.out.println(num1); // 122÷3 = 40
		num1 %= 7;
		System.out.println(num1); // 40%7 = 5

		/*
		 * [2단계:코드] 4.구매하는 김밥의 갯수를 선언하고, 1씩 증가하여 김밥의 단가(2500) 아래와 같이 출력 김밥 1개 구매 2500 김밥
		 * 2개 구매 5000 김밥 3개 구매 10000
		 */

		int gimBab = 1;
		int gimPri1 = 2500;
		System.out.println("김밥 " + gimBab + "개 구매 " + gimPri1 * gimBab);
		gimBab++;
		// 증가되는 변수에 기본 데이터를 *으로 연산처리..
		System.out.println("김밥 " + gimBab + "개 구매 " + gimPri1 * gimBab);
		gimBab++;
		System.out.println("김밥 " + gimBab + "개 구매 " + gimPri1 * gimBab);
		gimBab++;
		System.out.println("김밥 " + gimBab + "개 구매 " + gimPri1 * gimBab);
		gimBab++;
		System.out.println("김밥 " + gimBab + "개 구매 " + gimPri1 * gimBab);
		gimBab++;
		System.out.println("김밥 " + gimBab + "개 구매 " + gimPri1 * gimBab);
		gimBab++;
		int gimPri2 = 5000;
		System.out.println("김밥 " + gimBab + "개 구매 " + gimPri2);
		gimBab++;
		int gimPri3 = 10000;
		System.out.println("김밥 " + gimBab + "개 구매 " + gimPri3);

		/*
		 * [1단계:개념] 6. 문자열의 비교연산자 사용에서 ==, equals()의 차이점을 기술하세요.
		 * 
		 */
		// java에서는 ==를 사용하면 값이 같아도 주소가 다르기 때문에 다르고
		// equlas()를 쓰면 가르키는 값이 같기 때문에 같다.

		/*
		 * 
		 * [1단계:개념] 7. main()의 args[]의 처리 내용방법 자바 코드를 통한 처리와 함께 기술하세요. java 클래스명 데이터1
		 * 데이터2 데이터3 args[0] 데이터1 args[1] 데이터2 args[2] 데이터3
		 * 
		 */
		// 일단 run as -> run configurations - > arguments -> program arguments에 값 대입
		// -> 그리고 코딩해주면 됩니다..

		int namePri01 = Integer.parseInt(args[0]);
		int namePri02 = Integer.parseInt(args[1]);
		int namePri03 = Integer.parseInt(args[2]);
		int namePri04 = Integer.parseInt(args[3]);
		int priSum = namePri01 + namePri02 + namePri03 + namePri04;
		System.out.println("# 구매 정보 #");
		System.out.println("가방 : " + namePri01);
		System.out.println("마우스 : " + namePri02);
		System.out.println("책 : " + namePri03);
		System.out.println("커피 : " + namePri04);
		System.out.println("총가격 : " + priSum);

		// [2단계:코드] 8. args로 물건명1 가격1 갯수1 물건명2 가격2 갯수2로 입력받아 계산서(전체 총계포함)를 출력하세요.
		System.out.println("# 계산 정보 #");
		String obj1 = args[0];
		int objPri1 = Integer.parseInt(args[1]);
		int objCount1 = Integer.parseInt(args[2]);
		String obj2 = args[3];
		int objPri2 = Integer.parseInt(args[4]);
		int objCount2 = Integer.parseInt(args[5]);
		int priSum2 = (objPri1 * objCount1) + (objPri2 * objCount2);
		System.out.println("# 계산서 #");
		System.out.print("물건명 : " + obj1 + ",");
		System.out.print(" 가격 : " + objPri1 + ",");
		System.out.println(" 갯수 : " + objCount1);
		System.out.print("물건명 : " + obj2 + ",");
		System.out.print(" 가격 : " + objPri2 + ",");
		System.out.println(" 갯수 : " + objCount2);
		System.out.println("총합 : " + priSum2);

		/* [1단계:개념] 9. Scanner의 처리방법을 간단한 예제와 함께 기술하세요. */

		// Scanner 사용시 import java.util.Scanner; 필요
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine(); // 입력 받기 위한
		System.out.println("입력된 이름:" + name); // 입력 받은 name 출력

		/*
		 * [1단계:코드] 10. Scanner객체를 활용하여 타율계산방법을 확인(검색)하고, 선수명, 타석수, 안타수를 입력 받아 해당 타자의
		 * 타율을 출력하세요. String bplayer = sc.nextLine() int tSeat =
		 * Integer.parseInt(sc.nextLine()); double hits =
		 * Double.parseDouble(sc.nextLine()); double hitRatio = hits/tSeat;
		 * 
		 * 
		 * 
		 * [1단계:개념] 11. 비교연산자의 종류를 예시와 함께 기술하세요.
		 */

		// == 동일할 떄
		int a1 = 2000;
		boolean pass1 = a1 == 2000; // true
		System.out.println(pass1);
		boolean pass2 = a1 == 200; // false
		System.out.println(pass2);

		// != 동일하지 않을 떄
		int a2 = 2000;
		boolean pass3 = a2 != 2000; // false
		System.out.println(pass3);
		boolean pass4 = a2 != 200; // true
		System.out.println(pass4);

		// >초과, <미만, >=이상, <=이하
		int a3 = 2000;
		boolean pass5 = a3 >= 3000; // false
		System.out.println(pass5);
		boolean pass6 = a3 >= 200; // true
		System.out.println(pass6);

		/*
		 * [1단계:코드] 12. Scanner를 활용하여 나이를 입력 받아 성인(18이상)여부를 출력하세요
		 */
		System.out.println("나이를 입력하세요");
		String ageIn = sc.nextLine();
		System.out.println("입력된 나이 : " + ageIn);
		int age01 = Integer.parseInt(ageIn);
		boolean isAdult = age01 >= 18;
		System.out.println("성인 여부 : " + isAdult);

		/*
		 * 
		 * 
		 * [1단계:개념] 13. 논리연산자의 종류를 예제와 함께 기술하세요.
		 */
		// $$ and 연산자 : 전부 만족해야 true
		int sub1 = 30;
		int sub2 = 80;
		boolean pass01 = sub1 >= 80 && sub2 > 70;
		System.out.println("합격 : " + pass01);
		// || or 연산자 : 하나만 만족해도 true
		int age1 = 30;
		boolean pay1 = age1 <= 7 || age1 > 60;
		System.out.println("무료 여부 : " + pay1);
		// ! true는 false로 false는 true로 처리
		int sub3 = 3000;
		boolean isPass = sub3 >= 1200;
		boolean isNotPass = !isPass;
		System.out.println("1200이상 아니면 합격 : " + isNotPass);

	}
}
