package javaexp.z01_home;

public class A15_0425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
2023-04-25
[1단계:개념] 1. 예외 처리의 기본형식 코드는 수행시키고, 해당 코드가 의미하는 바를 구체적으로 기술하세요.
[1단계:확인] 2. args로 입력 받게 하고, 물건명 가격 갯수를 입력 받게 하고 입력이 없을 시  "물건정보를 입력하세요!" 라고 예외 처리로 처리되게 하세요.
[1단계:개념] 3. 실행예외와 컴파일예외의 차이점을 예제로 설명하세요.
[1단계:개념] 4. 예외처리의 계층 구조에 따른 선언 순서를 기술하세요.
[1단계:확인] 5. args[0], String name=null;name.toString(); 해당 내용을 구체적 예외는 처리하고, 그외는 Exception처리하는다중예외를 처리하세요.
[1단계:개념] 6. 동적처리하는 가상클래스의 내용을 예제와 함께 기술하세요.
[1단계:개념] 7. 공통 속성값인 색상 선언 규칙 3가지를 기술하세요
[1단계:개념] 8. 공통 속성값인 단위(크기,넓이,폭)을 기본예제와 함께 설명하세요

[1단계:개념] 1. 예외 처리의 기본형식 코드는 수행시키고, 해당 코드가 의미하는 바를 구체적으로 기술하세요.
try{//예외가 나올만한 코드
         System.out.println("1줄");
         System.out.println("2줄");
         System.out.println(1/0); // 예외가 나오면 해당 라인에서 예외를 던짐..
         System.out.println("3줄");
         System.out.println("4줄");
      } catch(Exception e){
         System.out.println(e.getMessage());// e.기능메서드() 예외에 대한 정보를 처리할 수 있는 내용 수행
         System.out.println("5줄");
         //예외가 나왔을때 처리할 내용
         
         
      }
[1단계:확인] 2. args로 입력 받게 하고, 물건명 가격 갯수를 입력 받게 하고 입력이 없을 시  
"물건정보를 입력하세요!" 라고 예외 처리로 처리되게 하세요.
System.out.println("물건입력 프로그램 ");
      try {
         String pname = args[0];
         System.out.println("입력한 물건명:"+pname);
         int price = args[1];
         System.out.println("입력한 가격:"+price);
         int cnt = args[2];
         System.out.println("입력한 갯수:"+cnt);
      }catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("물건정보를 입력하세요!");
      }catch(Exception e){
      	System.out.println("기타 예외 발생");
      }
[1단계:개념] 3. 실행예외와 컴파일예외의 차이점을 예제로 설명하세요.
      - 일반(컴파일 체크)예외
      // 컴파일 예외 처리 : 반드시 처리해야 컴파일됨(기계어로된 파일 생성)..
      try {
         //Class.forName("javaexp.a10_exception.A06_CompileException"); 형식
         Class.forName("aa.bb"); 
      } catch (ClassNotFoundException e) {
         System.out.println("예외 내용:"+e.getMessage());
         System.out.println("예외가 처리되는 경로 trace");
         e.printStackTrace();
      }
      - 실행(런타임 에러)예외
      //예외 처리 코드를 생략하더라도 컴파일이 되는 예외로
         경험에 따라 예외 처리 코드 작성이 필요하다.

      try {
         int num01 = Integer.parseInt("십오");
      }catch(NumberFormatException e) {
         System.out.println("숫자형 문자열을 입력하세요");
      }

[1단계:개념] 3. 예외처리의 계층 구조에 따른 선언 순서를 기술하세요.
                  Exception(최상위)
         
   차상위   ClassNotFundException, InterruptionExpeption,          RuntimeException 
                  (컴파일예외)                       (실행예외)
                                    
      실행예외하위 클래스 - NullPonterException, NumberFormatException
      try{
      
      }catch(상속하위예외클래스){
      
      }catch(상위중간예외클래스){
      
      }catch(최상예외클래스Exception){
      
      }
      
[1단계:확인] 4. args[0], String name=null;name.toString(); 해당 내용을 구체적 예외는 처리하고, 
그외는 Exception처리하는다중예외를 처리하세요.
public static void main(String[] args) {
      String name=null;
      try {
         System.out.println(args[0]);
         System.out.println(name.toString());
      
      }catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("예외   1"+e.getMessage());
      }catch(NullPointerException e) {
         System.out.println("예외 2 "+e.getMessage());
      }catch(Exception e) {
         System.out.println(e.getMessage());
      }finally {
         System.out.println("항상처리되는 부분");
      }
   }
[1단계:개념] 5. 동적처리하는 가상클래스의 내용을 예제와 함께 기술하세요.
<Style>
        h6:active{font-size: large;}
        h6:hover{background-color: aquamarine;}
        input:focus{background-color:yellow;}
</Style>
	이름:<input/>
    <h6>11111</h6>
    <h6>22222</h6>
    <h6>33333</h6>
    <h6>44444</h6>
    <h6>55555</h6>
[1단계:개념] 6. 공통 속성값인 색상 선언 규칙 3가지를 기술하세요
1. 색이름 표현 
css3표준으로 140개의 색이름을 정하고있다
   red, yellow, 
2. 16진수 코드값 : #6A2BE2
   red: 6A (0~255)
   green: 2B (0~255)
   blue: E2 (0~255)
3. rgb()형식표현
	rgb(1,1,1)
	rgb(0~255,0~255,0~255)
[1단계:개념] 6. 공통 속성값인 단위(크기,넓이,폭)을 기본예제와 함께 설명하세요
<table border="1px" width="50%" height="100px"> <!-- 높이는 비율로지정하면 안된다-->
         <tr><td style="font-size:10px">1</td><td>2</td></tr>
         <tr><td style="font-size:1.5em">3</td><td>4</td></tr>
         <tr><td>5</td><td>6</td></tr>
      </table>
상대적 크기 : em 배수 / % 페이지크기의 퍼센트
절대적 크기 : px,cm,mm,in,pt,pc,deg 측정단위에 따른크기		 
		 */
	}

}
