package javaexp.z01_home;

import java.util.Scanner;

public class A05_0405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 
04/05
[1단계:개념] 1. 자바의 주요 메모리 2개의 유형에 따른 활용 내용을 기술하세요.
[1단계:개념] 2. 배열의 구성요소를 예제를 통해서 기술하세요
[1단계:개념] 3. 배열의 선언, 할당, 사용 형식을 여러가지 데이터 유형에 따라 구분하여 출력하세요.
[1단계:개념] 4. 배열의 전체 데이터를 처리할 때 for문을 사용한다. 배열의 속성에 따라서 어떻게 활용되는지 예제를 통해 기술하세요.
[1단계:코드] 5. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
[1단계:코드] 6. 배열 3개에 각각 학생명, 국어, 영어를 할당하여, 반복문을 통해서 출력하세요. 
[1단계:코드] 7. 배열로 가위,바위,보라고 선언한 후, 두 친구가 index 0~2 사이에 임의로 호출하여, 임의의 가위/바위/보를 출력하게 하세요  
[1단계:개념] 8. 웹서버와 웹클라이언트는 어떤 프로그램으로 실행되는지? network환경과 함께 기술해보세요.
[1단계:개념] 9. 오늘 eclipse와 vscode를 통해서 설정한 웹환경과 초기 화면 로딩을 위해 필요한 설정 부분을 기술해보세요.
[1단계:개념] 10. html을 구성하고 있는 기본 계층구조의 태그들의 내용을 기술하세요. 
[1단계:개념] 11. html에서 사용하는 3가지 언어의 예제를 통해서 기술하세요.
*/
	    // 1. 자바의 주요 메모리 2개의 유형에 따른 활용 내용을 기술하세요.
	      // 작은 데이터의 저장과 큰 데이터의 heap영역의 주소값 저장된 위치 -> stack의 메모리
		  // 
	      // 큰 데이터의 실제 저장 -> heap 메모리

	      // 2. 배열의 구성요소를 예제를 통해서 기술하세요
	      // 기본 구성 - 데이터 유형 [] 배열명; 데이터 유형 배열명[];
		  //     배열의 index, 배열의 크기
		 //      배열명[index번호], 배열명.length
		  //     배열의 선언과 사용
		
	         int [] array; 
	         String array2[];   
	         
	      // 3. 배열의 선언, 할당, 사용 형식을 여러가지 데이터 유형에 따라 구분하여 출력하세요.
	         // 배열의 선언
	         int[] array01;
	         String[] array02;
	         Math[] array03; // 내장된 api 객체
	         Person[] array04; // 사용자 정의 클래스 객체
	         
	         // 데이터 할당
	         // 배열명 = new 데이터유형[데이터값]; 
	         array01 = new int[3];
	         
	         // 배열의 데이터 확인 배열명[index번호]
	         System.out.println(array01[0]);
	         System.out.println(array01[1]);
	   
	         array02 = new String[2]; // index값 2개로 설정. 0,1까지.
	         System.out.println("문자열 배열의 초기값 확인");
	         System.out.println(array02[0]);
	         System.out.println(array02[1]);

	      // 4. 배열의 전체 데이터를 처리할 때 for문을 사용한다. 배열의 속성에 따라서 어떻게 활용되는지 예제를 통해 기술하세요.
	         String[] album = new String[3];
	         album[0] = "ivy";
	         album[1] = "nights";
	         album[2] = "lost";
	      
	         System.out.println("- music list -");
	         for(int i = 0; i < 3; i++) {
	            System.out.println(album[i]);
	         }
	      
	      // 5. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
	         Scanner sc = new Scanner(System.in);
	         int[] point = new int[3];
	         int tot = 0;
	         
	         for(int i = 0; i < 3; i++) {
	            System.out.print("점수 입력 : ");
	            point[i] = sc.nextInt();
	            tot += point[i];
	         }
	         System.out.println("총계 : " + tot + 
	        		 "\t평균 : " + (tot/point.length));
	      
	      // 6. 배열 3개에 각각 학생명, 국어, 영어를 할당하여, 반복문을 통해서 출력하세요.
	         String []names = {"홍길동","김길동","신길동"};
	         int []kors = {70,80,90};
	         int []engs = {95,85,75};
	         for(int idx=0;idx<names.length;idx++) {
	        	 System.out.print(names[idx]+"\t");
	        	 System.out.print(kors[idx]+"\t");
	        	 System.out.print(engs[idx]+"\n");
	         }
	         
	         String ex06[] = {"Frank", "국어", "영어"}; 
	         
	         for(int i =0; i<ex06.length; i++) {
	            System.out.print(ex06[i] + "\t");
	         }
	         
	         System.out.println();
	         
	      // 7. 배열로 가위,바위,보라고 선언한 후, 두 친구가 index 0~2 사이에 임의로 호출하여, 임의의 가위/바위/보를 출력하게 하세요
	         String rpc[] = {"가위", "바위", "보"};
	      
	         int friend1 = (int)(Math.random() * 3);
	         int friend2 = (int)(Math.random() * 3);
	         
	         System.out.println("친구1 : " +
	        		 rpc[friend1] + ", 친구2 : " + rpc[friend2]);
	      
	      // 8. 웹서버와 웹클라이언트는 어떤 프로그램으로 실행되는지? network환경과 함께 기술해보세요.
	      //    웹서버 : tomcat
	      //    웹클라이언트는 : 브라우저프로그램
	      //    서버와 클라이언트 개념으로 웹서버가 데몬으로 구축되어 실행되고 있으면
	      //    클라이언트는 ip/port/경로의 자원명으로 접근하여 html코드를 받아서
	         // 서버로 부터 받아서 랜더링(해석)한다.
	      // 9. 오늘 eclipse와 vscode를 통해서 설정한 웹환경과 초기 화면 로딩을 위해 필요한 설정 부분을 기술해보세요.
	      /*
	       eclipse에서 html 프로젝트 생성
	      - Project Explorer 창에서 오른쪽 클릭 → Dynamic Project 생성
	      - 하단 server 창에서 tomcat(10.1 ver) 서버 생성
	      - src/webapp 폴더에서 html 파일 생성
	      
	      eclipse에서 생성한 파일 주소 복사해서 vscode 폴더 열기로 실행
	       */

	      // 10. html을 구성하고 있는 기본 계층구조의 태그들의 내용을 기술하세요.
	      /*
	      - html 태그 - 이 태그로부터 시작하여, 상하위 계층화된 코드로 이루어짐. 시작과 끝 코드 안에 반드시 포함 관계 처리해야 함.
	    - head 태그 - body에 대한 메타정보(데이터의 데이터로, 화면에서 비주얼적인 부분 css로 encoding-글자 처리방식, 브라우저 상단에 들어 갈 타이틀)를 선언.
	         화면 처리의 방식을 화면을 출력할 것인지, 파일을 전송할 것인지, 여러가지 형식으로 전달할 것을 선언.
	     - body 태그 - 기본 구조 코드를 작성한다.
	      */
	    
	      
	    // 11. html에서 사용하는 3가지 언어의 예제를 통해서 기술하세요.
	      /*
	      <h1>제목 태그입니다.</h1> // html - 웹페이지의 구조와 내용을 설정
	    <h2 align = "center">css 적용입니다</h2> 
	    // css - 확장된 웹페이지의 비주얼 부분을 설정
	    // <style> h2{background-color:blue;}
	    <h3 onclick="chColor(this)"></h3> // js - 웹 페이지의 동적인 처리와 front단 범위에서 응용 프로그램 처리
	    	<script>
		    	function chColor(obj){
		    		obj.style.color="blue";
		    	}
	      */
	}

}
class Person {}		
