package javaexp.z01_home;

public class A06_0406 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		04/06
//		[1단계:개념] 1. http://localhost:8080/frontWeb/a01_start/a01_show.html를 브라우저를 통해 실행했다고 한다.
//					  위 url의 각 구성요소의 의미를 기술하세요
//		[1단계:개념] 2. 문자를 강조하는 태그들의 각 기능을 간단한 예제를 통해 기술하세요.
//		[1단계:개념] 3. 특수문자를 처리하는 코드를 예제를 통해 기술해 보세요.
//		[1단계:개념] 4. html에서 줄바꾸기와 공백에 대한 처리방식을 2가지가 있다. 일단, 기본 코드로 처리되는 내용을 예제와 함께 설명하고, 두번째 방식에 대한 내용을 예제와 함께 기술하세요				 
//		[1단계:코드] 5. html에서 h1~h6, 속성 align, hr, br, p태그를 활용하여, 위키백과사전에서 검색된 자바, ajax, jsp, 스프링의 내용을 각 과목의 타이틀과 함께 웹화면에 출력되게 하세요
//		[1단계:개념] 6. html에서 블럭태그와 인라인 태그의 차이점을 유형을 나열하고, 예제를 통해서 특징을 기술하세요.
//		[1단계:개념] 7. 2차원배열의 선언과 할당에 대하여 기본 코드로 설명하세요.
//		[1단계:코드] 8. 2차원으로 회원아이디, 회원명, 회원등급을 설정하여 회원2명을 할당하여 처리할려고 한다.
//					  초기화하고, 데이터를 입력 후, 반복문을 통해서 출력하세요.
//		[1단계:코드] 9. 반에 학생이 30명, 5개반에 임의의 점수(0~100)을 할당하고 점수를 아래와 같이 출력하세요
//					  1반 1번 @@ 점...
//		[1단계:개념] 10. 객체의 데이터 처리 선언, 초기화, 객체 생성,  호출의 각 단계별로 메모리할당 과정과 의미를 문자열과 숫자형 배열의 예로 설명하세요.
/*
안녕하세요 선생님 4월 6일자 과제입니다
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>Insert title here</title>
   </head>
   <body>
<!--  
[1단계:개념] 1. http://localhost:8080/frontWeb/a01_start/a01_show.html를 브라우저를 통해 실행했다고 한다.
           위 url의 각 구성요소의 의미를 기술하세요
           http : html 데이터를 최적으로 전달하는 네트웤상 프로토콜.(네트웤상 전달방식) 
           localhost : 현재 pc (서버/클라이언트 같이 있을 때)
           8080 : 현재 포트 위치(한 pc내에서 여러개 서비스는 지원하고자 할 때)
           /frontWeb/a01_start/a01_show.html : 파일이 위치한 물리 주소
           
[1단계:개념] 2. 문자를 강조하는 태그들의 각 기능을 간단한 예제를 통해 기술하세요.
      <body>
      <h1 align="center">배가 고프다</h1>
       <p align="center">
          어제 비가와서 그런지<br>
          날씨가 쌀쌀하다.
       </p>
       <hr>
       <p align="center">
          이러한 날씨때문인가
          오늘은 어제보다 배가 더 고프다.
       </p>
       <hr/>
       </body>
[1단계:개념] 3. 특수문자를 처리하는 코드를 예제를 통해 기술해 보세요.
      <h3>특수문자 넣어보기</h3>
      <body>
      <hr>
      4 &divide; 2 = 2<br>
      &radic;4 = 2<br>
      3 &nbsp;&nbsp; &lt; &nbsp;&nbsp; 5<br>
      오늘은 &quot;반드시&#34; 숙면을 취할 것이다.<hr/></body>
      
[1단계:개념] 4. html에서 줄바꾸기와 공백에 대한 처리방식을 2가지가 있다. 일단, 기본 코드로 처리되는 내용을 
            예제와 함께 설명하고, 두번째 방식에 대한 내용을 예제와 함께 기술하세요    
      <body>
      <h2>줄바꾸기와 공백처리방법</h2>
      <p>
      줄바꾸기는 &lt;br&gt; 태그를 사용하여 자바의 \n 처럼 사용이 가능.</p>
      <p>
      공백 처리는 &quot;&#38nbsp&#34;를 사용하여 space바처럼 사용 가능</p> 
      <pre>
      &lt;pre&gt; 태그를 사용하면 
                  사용자가 입력한 
                  그대로 출력됩니다.
      </pre>   
      </body>         
[1단계:코드] 5. html에서 h1~h6, 속성 align, hr, br, p태그를 활용하여, 
            위키백과사전에서 검색된 자바, ajax, jsp, 스프링의 내용을 
            각 과목의 타이틀과 함께 웹화면에 출력되게 하세요
            <!DOCTYPE html>

<html>
   <head>
      <meta charset="UTF-8">
      <title>자바 퍼오기</title>
   </head>
   <body>
      <h1>자바</h1>      
      <hr>
      <p align = "left"> 문서&nbsp;&nbsp;토론&nbsp;
      읽기&nbsp;편집&nbsp;역사 보기&nbsp; 도구</p><hr/>
      <p>위키백과, 우리 모두의 백과사전.</p>
<p>자바(Java, 문화어: 쟈바)에는 여러 가지 뜻이 있다.<p>

<p>자바 (Java) - 객체 지향 프로그래밍 언어<br>
자바서버 페이지 (JSP, JavaServer Pages) - HTML 문서에 자바 코드를 삽입하여 동적 웹 페이지를 생성하는 프로그래밍 언어<br>
자바 애플릿 (Java Applet) - 자바 바이트코드 형태로 배포되는 애플릿<br>
자바 라이브러리 (Java Library) - 다양한 패키지를 Zip으로 묶어 .jar 로 변환한 파일<br>
자와섬의 영어 이름.<br>
이에 관한 동음이의어는 자와에 있다.<br>
자바펜 - 대한민국 필기구 제작 업체<br>
자바 커피<br>
스타워즈에 나오는 외계 생물 중 한 명의 이름이 자바 더 헛이다<br> </p>

   </body>
</html>

<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>Ajax 퍼오기</title>
   </head>
   <body>
      <h1>Ajax</h1>      
      <hr>
      <p align = "left"> 문서&nbsp;&nbsp;토론&nbsp;
      읽기&nbsp;편집&nbsp;역사 보기&nbsp; 도구</p><hr/>
      <p>위키백과, 우리 모두의 백과사전.</p>
<p>Ajax(Asynchronous JavaScript and XML, 에이잭스)는 
비동기적인 웹 애플리케이션의 제작을 위해 아래와 같은 조합을 이용하는 웹 개발 기법이다.<p>

<p>표현 정보를 위한 HTML (또는 XHTML) 과 CSS<br>
동적인 화면 출력 및 표시 정보와의 상호작용을 위한 DOM, 자바스크립트<br>
웹 서버와 비동기적으로 데이터를 교환하고 조작하기 위한 XML, XSLT, XMLHttpRequest 
(Ajax 애플리케이션은 XML/XSLT 대신 미리 정의된 HTML이나 일반 텍스트, JSON, JSON-RPC를 이용할 수 있다).<br>
DHTML이나 LAMP와 같이 Ajax는 자체가 하나의 특정한 기술을 말하는 것이 아니며, 
함께 사용하는 기술의 묶음을 지칭하는 용어이다. 실제로 AFLAC와 같이 사실상 Ajax에 바탕을 두고 있는 
유사/복합 기술들이 속속 나타나고 있다.<br>
Ajax 애플리케이션은 실행을 위한 플랫폼으로 위에서 열거한 기술들을 지원하는 웹 브라우저를 이용한다. 
이것을 지원하는 브라우저로는 모질라 파이어폭스, 인터넷 익스플로러, 오페라, 사파리, 구글 크롬 등이 있다. 
단, 오페라는 현재 XSL 포맷팅 객체와 XSLT 변환을 지원하지 않는다.[1]</p>

   </body>
</html>

<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>JSP 퍼오기</title>
   </head>
   <body>
      <h1>JSP</h1>      
      <hr>
      <p align = "left"> 문서&nbsp;&nbsp;토론&nbsp;
      읽기&nbsp;편집&nbsp;역사 보기&nbsp; 도구</p><hr/>
      <p>위키백과, 우리 모두의 백과사전.</p>
<p>JSP는 다음을 의미한다.<p>

<p>잭슨 구조화 프로그래밍(Jackson structured programming)<br>
자카르타 서버 페이지(JavaServer Pages)<br>
일본사회당(Japan Socialist Party)</p>

   </body>
</html>

<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>스프링 프레임워크 퍼오기</title>
   </head>
   <body>
      <h1>스프링 프레임워크</h1>      
      <hr>
      <p align = "left"> 문서&nbsp;&nbsp;토론&nbsp;
      읽기&nbsp;편집&nbsp;역사 보기&nbsp; 도구</p><hr/>
      <p>위키백과, 우리 모두의 백과사전.</p>
<p>스프링 프레임워크(영어: Spring Framework)는 자바 플랫폼을 위한 오픈 소스 애플리케이션 프레임워크로서 
간단히 스프링(Spring)이라고도 한다. <br>동적인 웹 사이트를 개발하기 위한 여러 가지 서비스를 제공하고 있다.<br>
대한민국 공공기관의 웹 서비스 개발 시 사용을 권장하고 있는 전자정부 표준프레임워크의 기반 기술로서 쓰이고 있다.<p>
   </body>
</html>

[1단계:개념] 6. html에서 블럭태그와 인라인 태그의 차이점을 유형을 나열하고, 예제를 통해서 특징을 기술하세요.
<!-- div 블럭코드는 내용(줄바꿈 처리)을 포함하고 끝에는 줄바꿈
           span 인라인코드 내용(줄바꿈 처리 안됨-높이 속성 처리 안됨)
              끝에 줄바꿈하지 않고 바로 연결처리
        --> 
      <!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>Insert title here</title>
   </head>
   <body>
   <div style="background-color:skyblue;
          padding:50px;height:50pt;">
         내가 지금 당장 집에 가고싶어도
         <span style="color:red;height:10pt;">당장</span>
         오늘 해야 할 일을 끝마치지 않았다면
         <span style="color:pink">결국엔</span>
         갈 수 없다
      </div>
      <p>
      돈 많은 백수가 되고싶다~
      </p>
   </body>
</html>

//      [1단계:개념] 7. 2차원배열의 선언과 할당에 대하여 기본 코드로 설명하세요.
      // 6칸씩 있는 창고가 3개 있을 때, 2번째 창고의 4번째 칸을 코드로 출력해보기.
      int[][] box = new int[3][6];
      System.out.println(box[1][3]);
//      [1단계:코드] 8. 2차원으로 회원아이디, 회원명, 회원등급을 설정하여 회원2명을 할당하여 처리할려고 한다.
//                 초기화하고, 데이터를 입력 후, 반복문을 통해서 출력하세요.
      /*String[][] user = new String[1][1]; // 초기화
      /*
       회원2명, 회원마다 속성 3가지 
       String[][] user = new String[2][3]; // 초기화
       user[0][0] ="himan";
       user[0][1] ="홍길동";
       user[0][2] ="관리자";
       user[1][0] ="higirl";
       user[1][1] ="김현정";
       user[1][2] ="슈퍼고객";
       
       
       
       
      System.out.println(user[0][0]);
      user[0][0]= "유저1";
      user[0][1]= "boxes,sliver";
      user[1][0]= "유저2";
      user[1][1]= "power,gold";
      for(int i=0;i<user.length;i++) {
         for(int l=0;l<user[i].length;l++) {
            System.out.println(user[i][l]);
         }
      }*/
//      [1단계:코드] 9. 반에 학생이 30명, 5개반에 임의의 점수(0~100)을 할당하고 점수를 아래와 같이 출력하세요
//                 1반 1번 @@ 점...
      int [][] clsRecords = new int[5][30];
      for(int idx=0;idx<clsRecords.length;idx++) {
    	  for(int jdx=0;jdx<clsRecords[idx].length;jdx++) {
    		  clsRecords[idx][jdx]=(int)(Math.random()*101);//0~100
    		  System.out.print(idx+1+"반 ");
    		  System.out.print(jdx+1+"번 ");
    		  System.out.println(clsRecords[idx][jdx]);
    	  }
      }
      
      
      
      int[] classes = new int[4];
      int[] stuscore = new int[29];
      for(int i=0;i<classes.length;i++) {
         for(int l=0;l<stuscore.length;l++) {
            int score = (int)(Math.random()*101);
            System.out.print(i+1+"반 ");
            System.out.print(l+1+"번 ");
            System.out.println(score+"점");
                  
         }
      }
//      [1단계:개념] 10. 객체의 데이터 처리 선언, 초기화, 객체 생성,  
//               호출의 각 단계별로 메모리할당 과정과 의미를 문자열과 숫자형 배열의 예로 설명하세요.
      // 선언
      int[] arry;
      // 초기화1
      arry=null;
      // 초기화2(초기값 0으로 할당)
      arry = new int[3];
      // 초기화3(초기화 데이터 할당)
      arry = new int[] {1000,2000,3000};
      // 선언, 데이터할당 초기화
      int [] arry2 = {2000,3000,4000};
      // 사용(호출/할당)
      System.out.println(arry[0]);
      arry[0] = 5000;
      
      // 선언
      String str01;
      // 초기화1
      str01=null;
      // 초기화2(할당)
      str01 = "hello";
      String str02 = new String("hello");
      // 사용(호출/재할당)
      System.out.println(str01);
      str01 = "Good day!";
      // 문자열의 경우 문자열자체에 대한 비교시 equals()사용
      System.out.println(str01.equals(str02));
      

	}

}
