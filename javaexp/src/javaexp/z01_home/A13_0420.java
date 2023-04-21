package javaexp.z01_home;

public class A13_0420 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		2023-04-18
		[1단계:조별] 1. 다형성을 대한 내용을 정리해보자.
				1) 다형성을 위해 오버라이딩을 사용하는 이유를 아는가?
				2) 다형성을 처리하기 위한 클래스 구조를 이해하고 만들 수 있는가?
				3) 상위클래스를 다각형으로 하고, 하위 클래스를 삼각형, 사각형, 오각형으로 선언하여, 필드 kind, 기능메서드 drawing()을 처리하여 출력되게 하세요
				삼각형 ==> 삼각형 모양으로 (세모난 새집을 그리다.), 사각형 ==> 사각형 모양으로 (네모난 빌딩을 그리다)...
		[1단계:개념] 2. 선택자 중에서 계층적 선택자의 종류와 특징을 기본예제와 함께 기술하세요
		[1단계:개념] 3. 속성 선택자 종류를 기본예제와 함께 기술하세요
		[1단계:확인] 4. 회원등록화면을 table안에 만들고, 전체선택자와 속성선택자의 단계(선택자[속성=속성값],[속성=속성값],[속성])에 따라 css가 다르게 선언된 것을 적용되게 하세요
		[1단계:확인] 5. 가상클래스의 종류를 간단한 예제와 함께 기술하세요.
		[1단계:개념] 6. 다형성을 위한 상위 클래스를 멤버(필드,생성자,재정의메서드) 예제와 함께 설명하세요.
		[1단계:개념] 7. 다형성을 위한 하위 클래스의 구성을 예제와 함께 설명하세요.
package javaexp.z01_home;

public class A13_0420 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		2023-04-18
		[1단계:조별] 1. 다형성을 대한 내용에 대하여 정리해보자.
      	1) 다형성을 위해 오버라이딩을 사용하는 이유를 아는가?
      	2) 다형성을 처리하기 위한 클래스 구조를 이해하고 만들 수 있는가?
      	3) 상위클래스를 다각형으로 하고, 하위 클래스를 삼각형, 사각형, 오각형으로 선언하여, 필드 kind, 기능메서드 drawing()을 처리하여 출력되게 하세요
      	삼각형 ==> 삼각형 모양으로 (세모난 새집을 그리다.), 사각형 ==> 사각형 모양으로 (네모난 빌딩을 그리다)...
		[1단계:개념] 2. 선택자 중에서 계층적 선택자의 종류와 특징을 기본예제와 함께 기술하세요
		[1단계:개념] 3. 속성 선택자 종류를 기본예제와 함께 기술하세요
		[1단계:확인] 4. 회원등록화면을 table안에 만들고, 전체선택자와 속성선택자의 단계(선택자[속성=속성값],[속성=속성값],[속성])에 따라 css가 다르게 선언된 것을 적용되게 하세요
		[1단계:확인] 5. 가상클래스의 종류를 간단한 예제와 함께 기술하세요.
		[1단계:개념] 6. 다형성을 위한 상위 클래스를 멤버(필드,생성자,재정의메서드) 예제와 함께 설명하세요.
		[1단계:개념] 7. 다형성을 위한 하위 클래스의 구성을 예제와 함께 설명하세요.
 
		*/
		Polygon p1 = new Triangle();
		p1.drawing();
		Polygon p2 = new Square();
		p2.drawing();
	}

}
//=====================================================================================
//	1) 다형성을 위해 오버라이딩을 사용하는 이유를 아는가?
/*
  상위 객체가 선언되어 있으면 추가 내용은 하위객체에서만 선언하면 상위 객체는 건드리지 않아도 되니까
  오버라이딩을 하지 않으면 객체에서 일일이 다시 선언해야하지만 오버라이딩을 하면 상속된 객체에서 재할당 되니까 
*/
//=====================================================================================
//	2) 다형성을 처리하기 위한 클래스 구조를 이해하고 만들 수 있는가?
/*
	부모 클래스 생성 > 필드(변수) 선언 > 생성자 > 기능 메서드 생성
	자식 클래스 생성 > extends 부모 클래스 명 상속 하기 > super()이용하여 부모클래스 this재할당 >
	.super()를 이용하여메서드를 재할당 한 후 main에서 호출 
	
	1. 상위클래스 class Part
		공통필드     String name(부품명)
		오버라이딩메서드  void showInfo()
	2. 상속받는 하위클래스(계속추가)
		상위생성자를 호출하는 생성자  super("CPU")
		오버라이딩메서드   void showInfo()
					       super.showInfo()
	3. 위 내용을 다형성 처리를 하는 클래스
		class 포함할클래스{     class Computer
			고유 필드				String company
			상위클래스 참조명       Part part
			하위클래스를 추가할 메서드   void addPart(Part part)
				void addXXXX(상위클래스 참조명){}
			void showInf() 전체정보를표현할 메서드
								   void showAll()
								   	   if(part!=null)
*/
//=====================================================================================
//	3) 상위클래스를 다각형으로 하고, 하위 클래스를 삼각형, 사각형, 오각형으로 선언하여, 필드 kind, 기능메서드 drawing()을 
//		처리하여 출력되게 하세요 삼각형 ==> 삼각형 모양으로 (세모난 새집을 그리다.), 사각형 ==> 사각형 모양으로 (네모난 빌딩을 그리다)...
class Polygon{
   private String kind;
   public Polygon(String kind) {
      this.kind = kind;
   }
   public void drawing() {
      System.out.println(kind+"을 그리다");
   }
}
class Triangle extends Polygon{

   public Triangle() {
      super("삼각형");      
   }

   @Override
   public void drawing() {   
      super.drawing();
      System.out.println("세모난 새집을 그리다");
   }
   
   
}
class Square extends Polygon{

   public Square() {
      super("사각형");      
   }

   @Override
   public void drawing() {   
      super.drawing();
      System.out.println("네모난 빌딩을 그리다");
   }  
} 
//=====================================================================================
//	[1단계:개념] 2. 선택자 중에서 계층적 선택자의 종류와 특징을 기본예제와 함께 기술하세요

	/*
	1. 부모>자식{속성:속성값;}
		h1>p{color:tomato; background-color: burlywood;}
		<h1><p>부모 아래 자식</p></h1>
		h1 바로 밑에 p 태그가 있으면 해당한다. p는 배경색상이 burlywood, 글자색상이 tomato
		<p>그냥 피</p> <== 얘는 해당 안된다.
	
	2. 자손 선택자	
		table#tab01 td{background-color: yellow; color: darkblue; font-size: 20px;}
		id명이 tab01인 table 태그 바로 밑을 포함해 여러 계층 레벨이(td) 있어도 적용됨
	    <table id="tab01"  >
        <tr><td>할미</td><td>손녀</td></tr>
    	</table>
	 
	*/
//	=====================================================================================
//	[1단계:개념] 3. 속성 선택자 종류를 기본예제와 함께 기술하세요
	/*
	html 태그의 속성에 대해 값이 일치하는 태그를 스타일로 적용하는 선택자를 말한다.
	
    태그[속성=속성값] : 해당 선택자의 속성과 속성값인 경우
    input[type=submit]{background-color: tomato; color: rgb(49, 49, 49); width: 100px;}
    input태그이고 해당 태그의 type이 submit이면 배경색은 tomato, 글자색상은 회색, 넓이는 100px로 처리한다.
 
	[속성=속성값] : 태그 상관없이 속성과 속성값이 경우
    [name=Button]{background-color: black; color: lime;}
    선택자 상관없이 name속성이 Button으로 설정된 경우에 배경색은 블랙, 글자는 라임색으로 처리한다.
    
	[속성]
    ex) [type]{backgroudn-color blue;}
    선택자, 속성값 상관없이 속성이 type이 있으면
    배경색상을 파란색으로 처리한다.
	*/
// =====================================================================================
//	[1단계:확인] 4. 회원등록화면을 table안에 만들고, 전체선택자와 
//  속성선택자의 단계(선택자[속성=속성값],[속성=속성값],[속성])에 따라 css가 다르게 선언된 것을 적용되게 하세요
/*
    h1{text-align: center;}
    input[type=submit]{background-color: rgb(52, 252, 52); border: none; width: 140px; height: 30px;}
    [type=password]{color: red;}
    [name=email]{background-color: rgba(255, 255, 89, 0.781); border: solid 1px rgba(255, 255, 89, 0.781);}
    [type]{height: 30px; border-radius: 10px;} 
    
    <h1>회원가입</h1>
    <table align="center">
        <tr>
            <td><input type="text" name="email" size="15" placeholder="이메일"></td>
        </tr>
        <tr>
            <td><input type="password" name="pass" size="15" placeholder="비밀번호"></td>
        </tr>
        <tr>
            <td><input type="text" name="name" size="15" placeholder="이름"></td>
        </tr>
        <tr>
            <td><input type="submit" name="Join" value="Join"></td>
        </tr>
    </table>
*/
//=====================================================================================
//	[1단계:확인] 5. 가상클래스의 종류를 간단한 예제와 함께 기술하세요.
/*
# 가상 클래스(pesudo-class) 선택자
1. 어떤 조건이나 상황에서 스타일을 적용핟록 만든 선택자
    1) 40개 이상의 많은 가상 클래스 선택자가 있음.
        ex)
        a:visited{color:green;} 링크로 방문했을 때 글자 색상
            을 초록색으로 처리
        li:hover{background-color:yellow}
            리스트에 커서를 위치시켰을 때, 배경색상을 노랑색으로 처리.
2. 가상 클래스의 유형과 내용
    1) 마우스
        :hover - 마우스의 커서가 해당 요소객체 위에 위치시켰을 때
        :active - 마우스로 클릭하여 누르고 있는 상태에서 적용할
            스타일 지정
    2) 폼하위 요소
        :focus - 폼 요소가 키보드나 마우스 클릭으로 포커스를 위치시켰을 때,
            적용할 스타일 지정
        ex) 아이디:[    ]
            패스워드:[    ]
            input:focus{background-color:yellow;}
            입력하기 위해 커서를 위치 시켰을 때, 배경색상을 노랑색으로 변경
            커서를 다른 곳으로 이동하면 배경색상적용이 사라진다.
    3) 링크
        :link - 링크된 글자나 이미지가 아직 클릭을 통해 방문하지 않을 때
            적용할 스타일 지정
        :visited - 링크된 글자나 요소객체가 클릭 후, 방문한 후에 다시
            현재 페이지를 볼 때, 방문 후인 것을 구분하기 위한 css적용
    4) 블럭형 태그에 적용(주의 inline형 태그에는 적용되지 않음)
        ::first-letter - p, div등과 같은 문자를 포함하고 있는 블럭형
            태그의 첫 글자에 스타일 적용하는 것을 말한다.
        ::first-line - p, div등과 같은 문자를 포함하고 있는 블럭형
            태그의 첫 라인에 적용할 스타일을 지정할 때 사용한다.
    5) 구조처리 - 반복적으로 처리되는 태그에 대하여 구조적으로
        반복적인 css 적용이 필요할 때, 사용된다.
        ex) 짝수번째 라인, 홀수 번째 요소객수, 3개단위 데이터에
            데이터 css적용 등
        :nth-child(even|odd) : 해당 반복적인 태그의 순서기준으로
            짝수인 것 또는 홀수인 것에 대한 적용을 할 때 사용된다.
        :nth-child(1) : 첫번째 자식 태그에 스타일 적용
        :nth-child(3n+1) : 반복된 해당 요소객체의 자식 태그가 3개
            단위로 반복 스타일 적용하는 것으로 3개 단위마다 첫번째
            것에 대한 선택자를 지칭한다. 
*/
//=====================================================================================
//	[1단계:개념] 6. 다형성을 위한 상위 클래스를 멤버(필드,생성자,재정의메서드) 예제와 함께 설명하세요.


/*
 * 상위 클래스
 
class Musical{
	private String kind; // 필드 

	public Musical(String kind) { // 생성
		this.kind = kind;
	}
	public void playing() { // 재정의 메서
		System.out.print(kind+" 는 공연중 인가요?");
	}
	
} 
*/
//=====================================================================================
//	[1단계:개념] 7. 다형성을 위한 하위 클래스의 구성을 예제와 함께 설명하세요.
/*
다형성 처리..
Musical m1 = new Six();
Musical m2 = new Mammamia();
m1.playing();
m2.playing();
 * 
 * 
class Six extends Musical{ // 상속 

	public Six() {
		super("Six the Musical"); 
	}

	@Override
	public void playing() {
		super.playing();
		System.out.println(" 현재 코엑스 아티움에서 공연중 입니다.");
	}
	
}
*/
		


