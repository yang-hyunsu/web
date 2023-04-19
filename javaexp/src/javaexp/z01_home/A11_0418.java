package javaexp.z01_home;

public class A11_0418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
2023-04-18
[1단계:개념] 1. 오늘 진행한 css 속성을 다른 예제와 함께 기술해보세요.
[1단계:개념] 2. css 선언 선택자와 함께 선언한 형식을 구성요소별 내용을 예제와 함께 기술하세요
[1단계:개념] 3. css 선언 형식(기본,외부,inline)을 예제를 만들고 설명하세요.
[1단계:개념] 3. 선택자의 종류를 간단한 예제와 함께 기술하세요.
[1단계:확인] 4. webapp하위에 a00_com폴드에 z03_style.css로 h1,h2의 배경색상,글자색을 지정하여, 현재폴드에서 적용되게 절대 경로로 처리하여 출력하세요.
[1단계:개념] 5. 1:다 관계의 필드기준 예제(필드만 선언, 메서드 처리x)를 만들어 보자
[1단계:개념] 6. 상속의 기본형식을 알고 접근제어자의 한계와 함께 예제를 만들어 보자.

선생님 안녕하세요! 과제 제출합니다!
//      2023-04-18
//      [1단계:개념] 1. 오늘 진행한 css 속성을 다른 예제와 함께 기술해보세요.
         /*
         p{color:yellow;font-size:20px;}
         1. selector(선택자) = p : css스타일 시트를 html 페이지에 적용하도록 만든 이름
         2. property(속성) = color : 로 스타일 속성 이름 약 200개 정도의 프로퍼티가 있음
         3. value(값) = blue : 로 위 속성에 대입되는값을 지정한다
         4. 주석문 : 스타일 시트 내에 붙이는 설명문으로 /*와 사이에 설정
         /*
         5. 선택자, 속성, 속성값은 대소문자 구분이 없다. 동일하게 인식
            body{background-color:blue;}
            Body{Background-COLOR:blue;}
         # 지금까지 한 속성
            
         */
      
//      [1단계:개념] 2. css 선언 선택자와 함께 선언한 형식을 구성요소별 내용을 예제와 함께 기술하세요
      /*
      # 선택자의 종류
      1. 태그
      2. .클래스명
      3. #아이디명
      4. 중첩적 사용
      5. 상위 하위, 부모>자식
      6. *, 선택자1, 선택자2{속성:속성값;} 선택자[속성=속성값]
      7. 가상선택자 선택자:hover, 선택자:nth-child(2n+1)
      
      <style type="text/css">      
      h1{background-color:red;}
      h2{background-color:green;}
      h3{background-color:blue;}
      h1, h3{color:white;}
      </style>
      */
      
//      [1단계:개념] 3. css 선언 형식(기본,외부,inline)을 예제를 만들고 설명하세요.
      /*
      1. 기존 처리 방법
         <style type="text/css">
         h1{color:white;background-color:lavender;font-size:20px;}
         </style>
         상단에 type 선언
      2. inline
         <h1 style="color:Violet;background-color:blue;font-size:30px;">안녕</h1>
         태그 내부에서 처리
      3.외부
         1) link 태그 사용
           <title>&lt;link&gt;</title>
           <link type="text/css" rel="stylesheet" href="z02_style.css">
         2) @import 사용
            <style type="text/css">
            @import url("z02_style.css")
            </style>
      */
      
//      [1단계:개념] 3. 선택자의 종류를 간단한 예제와 함께 기술하세요.
     /*
     1. 태그
     2. .클래스명 : 태그의 속성으로 class="클래스명"으로 지정되어 여러개를 하나의 분류(class)로 구분하여 속성과 속성값을 지정할 때 활용된다.
                 여러개를 선택해서 처리할 때 사용한다.
     3. #아이디명 : 태그의 속성으로 id="아이디명"으로 지정되어 있는 페이지에서 단일 선택으로 속성과 속성값을 처리할 때, 활용한다.
     4. 위 태그, 클래스명, 아이디명으 혼합적으로 사용
     5. 자식 선택자와 자손 선택자(계층 구조 하에 선택자 지정)
        최종적으로 가장 마지막에 있는 자식 또는 자손 선택자에 대하여 적용된다.
        부모 > 자식 : 해당 부모를 가진 자식 태그를 처리
        조상 자손: 한칸 띄움, 해당 조상을 가진 자손 태그에 대한 속성 처리
     6. 전체와 속성처리
       * : 전체
       선택자[속성=속성값] ex) input[type=password]{color:yellow;}
     7. 가상 클래스 선택자
         주로 동적인 처리를 할 때, 사용하는 선택자
         ex) h1:hover{background=color:yellow;}
         ==> 오른쪽 마우스 커서를 해당 태그 위로 움직이는 순간 배경 색상이 노란색으로 변함
      */
      
//      [1단계:확인] 4. webapp하위에 a00_com폴드에 z03_style.css로 h1,h2의 배경색상,글자색을 지정하여, 현재폴드에서 적용되게 절대 경로로 처리하여 출력하세요.
      /*
      // z03_style.css 파일에 선언
      h1{background-color:linen;color:DarkSeaGreen;}
      h2{background-color:beige;color:lightpink;}
      
      // 현재 폴드에 출력
      <style type="text/css">
      @import url("/프로젝트명/a00_com/z03_style.css")
      </style>
      <body>
      <h1>안녕하세요</h1>
      <h2>좋은 저녁이에요</h2>
      </body>
      */
      
//      [1단계:개념] 5. 1:다 관계의 필드기준 예제(필드만 선언, 메서드 처리x)를 만들어 보자
      /*
      class Depart{}
         String product;
         Brand[] pArry;
         int idx;
         
       public class Brand {
		      private String pname;
		      private int price;
		      private int cnt;
         */
//      [1단계:개념] 6. 상속의 기본형식을 알고 접근제어자의 한계와 함께 예제를 만들어 보자.
      /*
      public class GrandFather{
         String shape="어깨가 넓다";
         private int sholder=50;
         void playHocky() {
            System.out.println("하키를 잘한다");
         }
         void bigger(int sholder) {
            sholder+=sholder;
         }
         int bigSholder() {
            return sholder;
         }
      }
      public class Father extends GrandFather { // <== GrandFather 클래스를 상속
         String work="모델";
         void playBasckeBall() {
            System.out.println("농구를 잘한다");
            }
         void callGrandFather() {
            System.out.println(shape);
            bigger(5);
            System.out.println(bigSholder());
         }
      }
      // private로 선언되어도 간접적으로 호출이 가능하다
      */
	}

}
