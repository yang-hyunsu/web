package javaexp.z01_home;

import java.util.Scanner;

public class A16_0426 {

	/*
	 * 
	 * 2023-04-25 [1단계:조원] 1. 예외처리에 대한 이론과 실습(조원들과 아래 내용에 대한 이야기를 수업 내용을 보면서 나누세요)
	 * 1) 예외 처리를 왜 하는지 알고 있나요? 2) 예외 처리를 하는 기본 단계별 구조를 설명할 수 있고, 코드할 수 있는지? 3)
	 * args값이 입력하지 않을 때, 처리되는 메서드를 선언하고, 예외를 위임하세요. 4) 아이디 입력시 8자미만 이거나 16자이상시 사용자
	 * 정의 예외를 발생하게 처리하세요 [1단계:개념] 2. css 문자열 관련 속성을 예제와 함께 기술하세요 [1단계:개념] 3. css box
	 * 모델의 단계별 속성을 설명하세요 [1단계:개념] 4. css border의 위치관련 속성, 굵기, 종류관련 개별적 속성과 전체 설정 처리를
	 * 기술하세요 [1단계:확인] 5. css box 모델의 모서리 둥글기 속성을 이용하여, 버튼1, 버튼2를 span으로 만들어 보세요.
	 * [1단계:확인] 6. 예외 위임을 코드를 기본 예제와 함께 설명하세요. [1단계:확인] 7. 1~10까지 출력할 때, 짝수인 경우에 사용자
	 * 정의 예외가 처리되게 하세요.
	 */
	static void call(String[] err) throws ArrayIndexOutOfBoundsException {
		// 예외 나올 수 있는 데이터 ==> 예외 발생.
		System.out.println(err[0]);
	}

	public static void main(String[] args) {

//      2023-04-25
//      [1단계:조원] 1. 예외처리에 대한 이론과 실습(조원들과 아래 내용에 대한 이야기를 수업 내용을 보면서 나누세요)
//      [1단계:조원] 1. 예외처리에 대한 이론과 실습(조원들과 아래 내용에 대한 이야기를 수업 내용을 보면서 나누세요
//      1) 예외 처리를 왜 하는지 알고 있나요?
		/*
		 * 개발자의 입력이나 사용자의 사용으로 인해서 발생하는 에러들을 효율적으로 발견하여 처리하기위함이다. 더 나아가 프로그램 자체가 멈추는 상황에
		 * 미리 대응하여 에러가 생겨도 프로그램이 멈추지 않도록 하는것이 목표이다.
		 */

//      2) 예외 처리를 하는 기본 단계별 구조를 설명할 수 있고, 코드할 수 있는지?
		/*
		 * 1단계 try{ 예외가 나올 수 있는 코드; }catch(Exception e){ e.기능메소드(); // 예외발생시, 처리내용 }
		 * 
		 * 2단계 try{ 여러 예외가 발생할 수 있는 구문; } catch(최하위예외클래스) {
		 * 
		 * } catch(차상위예외클래스) {
		 * 
		 * } catch(최상위예외클래스) {
		 * 
		 * } finally { // 다양한 에러처리를 할 때에는 계층적으로 최하위-> 차상위->최상위 순으로 처리한다 }
		 * 
		 * 3단계 void 메소드명() throws 위임할예외1, 위임할예외2...{ 예외가 처리될 가능성이 있는 코드 }
		 * 
		 * // 메소드별로 예외발생한 경우들을 위임하여 처리하도록 한다
		 * 
		 * try { 메소드명1 (); 메소드명2(); } catch(위임된 예외처리클래스 1) {
		 * 
		 * } catch(위임된 예외처리클래스 2) {
		 * 
		 * }
		 * 
		 * // 예외가 위임된 후에 호출할 내용을 try 블럭안에 넣는다 // 메소드 별로 위임된 예외들이 처리되며 던져진 메소드에 따라 처리될
		 * catch 블럭이 다르다.
		 * 
		 * 4단계 class 사용정정의 예외 클래스 extends Exception{ 사용자정의생성자(){ super("예외"); }
		 * 
		 * 사용자정의오버라이딩메소드(){ return @@; } } // Exception을 상속받은 사용자 정의 클래스를 생성하여, 사용자가 정의한
		 * 에러를 잡고 처리할 수 있다. main() try{ throw new 사용자정의예외(); } catch(사용자정의예외) { 사용자 정의예외
		 * 발생시 처리할 구문; 오버라이딩한 메소드 처리 } // main()에서 try블럭내, throw 뒤에 객체를 생성하여 문제코드를 잡을 수
		 * 있도록한다. // catch에서 오버라이딩한 메소드를 불러와 처리내용을 사용자가 원하는대로 정의할 수있다.
		 */
//        3) args값이 입력하지 않을 때, 처리되는 메서드를 선언하고, 예외를 위임하세요.
		try {
			call(args);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("데이터가 입력되지 않았습니다.~~");
			System.out.println(e.getMessage());
		}

//      4) 아이디 입력시 8자미만 이거나 16자이상시 사용자 정의 예외를 발생하게 처리하세요
		System.out.println("아이디를 입력해주세요 >> ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		try {
			if (input.length() < 8 || input.length() >= 16) {
				throw new UserException2(input);
			}
		} catch (UserException2 e) {
			// System.out.println("8자 이상, 16자 미만으로 적어주세요!");
			System.out.print("에러내용:" + e.getMessage());
		}

//      [1단계:개념] 2. css 문자열 관련 속성을 예제와 함께 기술하세요
//         font-family : 글꼴 관련 속성
//          font-size : 40px, medium, 1.6em등 속성값 지정..
//          font-weight : bold, light

//      <style>
//          font-family: 궁서체; //글꼴을 궁서체로
//          font-size: 40px; //글씨를 40px로
//          font-weight: bold; //글씨의 굵기를 볼드로 
//      </style>

//      [1단계:개념] 3. css box 모델의 단계별 속성을 설명하세요
//       1. 내부를 콘텐츠 문자나, 이미지가 포함되는 요소를 칭한다
//       2. 패딩(padding) : 테두리 선을 나타내는 border과 사이의 간격을 설정하는 요소를 말한다.
//       3) 테두리(border) : padding 외부에 외곽선으로 직선이나 점선 혹은 이미지로
//           테두리를 그릴 수 있는 경계선을 말한다.
//       4) 여백(margin) : 박스의 맨 바깥 영역으로 테두리 border와 외부 다른 요소들과의 간격을 지정할 때 활용된다.

		// 홈페이지에 F12를 누르면 아래 이미지가 있다.

//          2. border의 유형에 따른 옵션
//              border-style: dotted, solid, double, dashed

//      [1단계:확인] 5. css box 모델의 모서리 둥글기 속성을 이용하여, 버튼1, 버튼2를 span으로 만들어 보세요.
		/*
		 * <!DOCTYPE html> <html lang="ko"> <head> <meta charset="UTF-8">
		 * <title></title> <style> div{ height: 1000px; width: 1000px; text-align:
		 * center; font-size: 120px; } </style> </head> <body> <div> <span
		 * style="background: olive; border: 2px black solid; border-radius: 20px;">버튼1<
		 * /span> <span style=" background: blue; border: 2px black solid;
		 * border-radius: 20px 30px 50px;">버튼1</span> </div> </body> </html>
		 * 
		 */

//      [1단계:확인] 6. 예외 위임을 코드를 기본 예제와 함께 설명하세요.
		/*
		 * class 사용정정의 예외 클래스 extends Exception{ 사용자정의생성자(){ super("예외"); }
		 * 
		 * 사용자정의오버라이딩메소드(){ return @@; } } // Exception을 상속받은 사용자 정의 클래스를 생성하여, 사용자가 정의한
		 * 에러를 잡고 처리할 수 있다. main() try{ throw new 사용자정의예외(); } catch(사용자정의예외) { 사용자 정의예외
		 * 발생시 처리할 구문; 오버라이딩한 메소드 처리 } // main()에서 try블럭내, throw 뒤에 객체를 생성하여 문제코드를 잡을 수
		 * 있도록한다. // catch에서 오버라이딩한 메소드를 불러와 처리내용을 사용자가 원하는대로 정의할 수있다.
		 * 
		 * 
		 */

//      [1단계:확인] 7. 1~10까지 출력할 때, 짝수인 경우에 사용자 정의 예외가 처리되게 하세요.
		System.out.println("# 7번 문제 시작 #");
		/*
		 * # 예외 처리 반복문 1. 반복문 안에서 처리 for() try{ if() }catch(){} 해당 조건이 나왔을 때, 예외
		 * catch블럭이 수행되고, 다시, 다음 반복 step을 수행 처리한다. 2. 반복문 포함 밖에 처리 try{ for() } 해당 조건이
		 * 나오면 반복문 수행도 중지되고 예외 처리가 된다.
		 * 
		 */
		for (int i = 1; i <= 10; i++) {		
			try {
				if (i % 2 == 0) {
					throw new TestException(i + "번에서 예외 발생");
				}
				// 반복문 수행할 때 처리할 구문..
				// 만약 예외가 발생하면 처리되지 않을 구문을 처리..
				System.out.println(i + "번");
			} catch (TestException e) {
				System.out.println("#! 예외발생 !#");
				System.out.println(e.getMessage());
			}
		}
	}
}

class TestException extends Exception {
	TestException(String err) {
		super("" + err);
	}

	@Override
	public String getMessage() {
		String msg = super.getMessage();
		return msg;
	}

}

class UserException2 extends Exception {
	UserException2(String err) {
		super(err);
	}

	public String getMessage() {
		// System.out.println("#8자 이상, 16자 미만으로 적어주세요!#");
		// System.out.println("입력한 값 : " + super.getMessage());
		String ret = "입력한 값 : " + super.getMessage();
		ret += ", 내용:8자 이하이거나 16자 이상 입력됨";

		return ret;
	}
}