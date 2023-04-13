package javaexp.z01_home;

import java.util.Scanner;

public class A03_0403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		04/03
//		[1단계:개념] 1. 3항 연산자의 기본형식을 새로운 예제로 설명하세요
//		[1단계:코드] 2. 3항 연산자를 활용하여 문제(3+4=?)를 내고, 해당 문제의 정답이 맞을 때, 정답 그외는 오답으로 처리하세요
//		[1단계:개념] 3. Math.random 클래스와 메서드의 기능을 정수의 임의범위 처리 예제를 통해서 기술하세요
//		[1단계:코드] 4. 두 친구가 주사위 2개를 던져서 값을 확인려고 한다. 각각 홍길동/김길동일 때, 각각 나온 주사위 합을 출력하세요
//		[1단계:개념] 5. if 조건 구문의 기본형식 3개를 예제를 만들어 기술하세요 
//		[1단계:코드] 6. 넌센스 퀴즈를 검색해서 문제로 만들어 문제가 맞을 때, 정답 그외는 오답이 되게 처리하세요
//		[1단계:코드] 7. Math.random/Scanner활용하여 컴퓨터가 임의로 구슬을 1~10개 랜덤으로 쥐게하되,
//					  0) 해당 갯수를 맞추는지 여부에 따라 success/failure 처리하게 하세요
//					  1) 1입력시 홀, 0입력시 짝으로 하여 success/failure 처리하게 하세요
//					  2) 홀/짝을 입력하여, success/failure 처리하세요.
//		[1단계:개념] 8. if else if 구문의 기본예제를 만들어 해당 구문의 기본형식을 설명하세요.
//		[1단계:코드] 9. 주사위가 임의로 나오게 하여, 컴퓨터가 낸 임의 주사위 수와 내가 낸 임의 주사위 수를
//					  비교하여, 승/무/패를 출력하세요.
//		[1단계:개념] 10. switch case문의 기본형식과 기능내용을 기본 예제를 만들어 설명하세요.
//		[1단계:코드] 11. 가고자하는 위치 2개와 집에 가는 노선버스를 검색하여, switch case처리하여 해당 최종 위치를 처리하고, 그외는 정보가 없습니다 라고 표시하세요.
//	    1. 3항 연산자의 기본형식을 새로운 예제로 설명하세요
	      int numm = 10;
	      String message = (numm %2 ==0)?"홀수":"짝수";
	      // numm %2 : 숫자가 나머지연산자로 0,1
	      // 0일때를 조건으로 해서,
	      // 0이면 "홀수" 문자열 처리
	      // 그외 1이면 "짝수" 문자열 처리
	//   2. 3항 연산자를 활용하여 문제(3+4=?)를 내고, 해당 문제의 정답이 맞을 때, 
//	      정답 그외는 오답으로 처리하세요
	      Scanner sc = new Scanner(System.in);
	      System.out.print("3 + 4 = ? 정답입력하세요:");
	      int answer = sc.nextInt();
	      String result = (answer == 7) ? "정답!":"오답";
	      
	      
//	    3. Math.random 클래스와 메서드의 기능을 정수의 임의범위 처리 예제를 통해서 기술하세요
	//   ex) 0~50까지 임의의 수 / Math.random()*경우의수+시작수
	      int ran = (int)(Math.random()*51);
	      System.out.println("임의의 수: "+ran);
	      
	//   4.  두 친구가 주사위 2개를 던져서 값을 확인려고 한다. 각각 홍길동/김길동일 때, 각각 나온 주사위 합을 출력하세요
	      int hong1 = (int)(Math.random()*6+1);
	      int hong2 = (int)(Math.random()*6+1);
	      int kim1 = (int)(Math.random()*6+1);
	      int kim2 = (int)(Math.random()*6+1);
	      int hong = hong1+hong2;
	      int kim = kim1+kim2;
	      int hongkim = hong+kim;
	      System.out.println("홍의 수: "+hong);
	      System.out.println("김의 수: "+kim);
	      System.out.println("둘의 합: "+hongkim);
	      
	//   5.  if 조건 구문의 기본형식 3개를 예제를 만들어 기술하세요 
//	     간단한 if문
//	      	if(조건){}, 
//	        if(조건) 바로옆라인; 
//	        if(조건)
//	      		바로밑라인
	      int gre = 10;
	      if(gre>5) {
	         System.out.println("5보다 크다");
	      }

//	     if else 구문 
	      int gre2 = 3;
	      if(gre2 > 5) {
	         System.out.println("5보다 크다");
	      }else {
	         System.out.println("5보다 작다");
	      }
//	     if else if
	      int gre3 = 6;
	      if(gre3<0) {
	         System.out.println("gre3은 음수이다");
	      }else if (gre3 == 0) {
	         System.out.println("gre3은 0이다");
	      }else {
	         System.out.println("gre3은 양수이다");
	      }

	//   6.  넌센스 퀴즈를 검색해서 문제로 만들어 문제가 맞을 때, 정답 그외는 오답이 되게 처리하세요
	      
	      Scanner quiz = new Scanner(System.in);
	      System.out.println("개미네 집 주소는?");
	      int  ans1 = Integer.parseInt(sc.nextLine());
	      // Integer.parseInt(), sc.nextInt() : 정답을 숫자형으로 받을 때만 사용
	      String ans = quiz.nextLine();
	      // 단답형으로 문자열을 입력받을 때는 문자형 그대로 처리
	      if (ans.equals("허리도 가늘군 만지면 부러지리")) {
	         System.out.println("정답");
	      }else {
	         System.out.println("오답");
	      }
	/*   7. Math.random/Scanner활용하여 컴퓨터가 임의로 구슬을 1~10개 랜덤으로 쥐게하되,
	      0) 해당 갯수를 맞추는지 여부에 따라 success/failure 처리하게 하세요 
	      1) 1입력시 홀, 0입력시 짝으로 하여 success/failure 처리하게 하세요 
	      2) 홀/짝을 입력하여, success/failure 처리하세요.
	*/
	      int ball = (int)(Math.random()*10+1);
	      
	      
	      
	      Scanner cor = new Scanner(System.in);
//	      System.out.println("구슬의 갯수를 입력하세요");
//	      int com = cor.nextInt();
//	      /*
//	      
//	       * */
//	      
//	      System.out.println("컴퓨터의 구슬 수: "+ball);
//	      System.out.println("내가 입력한 구슬 수: "+com);
//	      // 0) 해당 갯수를 맞추는지 여부에 따라 success/failure 처리하게 하세요
//	      if(ball == com) {
//	    	  System.out.println("success");
//	      }else {
//	    	  System.out.println("failure");
//	      }
	      //1) 1입력시 홀, 0입력시 짝으로 하여 success/failure 처리하게 하세요
//	      System.out.println("홀일 때는 1, 짝일 때는 0입력하세요");
//	      int divIdx = sc.nextInt();
//	      System.out.println("입력한 구분자:"+divIdx);
//	      System.out.println("구슬 수:"+ball);
//	      int corIdx = ball%2;
//	      System.out.println("홀/짝?:"+(corIdx==1?"홀":"짝"));
//	      if(divIdx==corIdx) {
//	    	  System.out.println("success");
//	      }else {
//	    	  System.out.println("failure");
//	      }
//	      2) 홀/짝을 입력하여, success/failure 처리하세요.
	      System.out.print("홀/짝을 입력하세요:");
	      String divStr = sc.nextLine();
	      System.out.println("구슬수:"+ball);
	      String corStr = ball%2==1?"홀":"짝";
	      if(divStr.equals(corStr)) {
	    	  System.out.println("success");
	      }else {
	    	  System.out.println("failure");
	      }
	      int div = ball%2;
//	      System.out.println("홀or짝: "+(div == 0?"짝":"홀"));
//	      
//	      if(div == com%2) {
//	         System.out.println("success");
//	      }else {
//	         System.out.println("failure");
//	      }
	            
	//   8. if else if 구문의 기본예제를 만들어 해당 구문의 기본형식을 설명하세요.
	      int voteAge = 25;
	      // -투표권없음----17--투표가능----20-민사상 성인---
	      /*
	      if(voteAge>=20){
	      	 민사상 성인
	      }else if(voteAge>=17){
	         투표가능
	      }else{
	         투표권없음
	      }
	       * */
	      if(voteAge<15) {
	         System.out.println("투표 불가");
	      }else if(voteAge>=20) {
	         System.out.println("투표 가능");
	      }else {
	         System.out.println("");
	      }
	      
	//   9. 컴퓨터가 낸 임의 주사위 수와 내가 낸 임의 주사위 수를 비교하여, 승/무/패를 출력
	      int numCom = (int)(Math.random()*6+1);
	      System.out.println("컴퓨터가 낸 수: "+numCom);
	      
	      int numPer = (int)(Math.random()*6+1);
	      System.out.println("내가 낸 수: "+numPer);
	      
	      if(numCom>numPer) {
	         System.out.println("컴퓨터 승");
	      }else if(numCom == numPer) {
	         System.out.println("무승부");
	      }else {
	         System.out.println("컴퓨터 패");
	      }
	      
	//   10. switch case문의 기본형식과 기능내용을 기본 예제를 만들어 설명하세요.
	      Scanner dayWeek = new Scanner(System.in);
	      System.out.println("평일 or 주말(이번주 날짜를 입력하세요 1~7까지)");
	      int num = dayWeek.nextInt();
	      switch(num) {
	      case 1:
	      case 2:
	         System.out.println("주말");
	         break;
	      case 3:
	      case 4:
	      case 5:
	      case 6:
	      case 7:
	         System.out.println("평일");
	         break;
	      default:
	         //System.out.println("1,2: 주말 / 3~7: 평일");
	         System.out.println("이번주 날짜는 1~7까지 입력가능합니다.");
	      }
	      
	//   11. 가고자하는 위치 2개와 집에 가는 노선버스를 검색하여, switch case처리하여 해당 최종 위치를 처리하고, 그외는 정보가 없습니다 라고 표시하세요.
//	      	 switch, case, break
//	         집으로 가는 버스 7780, 3003
//           인천 1000 1002
//	         평택 2000
	      System.out.print("경로 확인 버스번호를 입력하세요:");
	      Scanner sc1 = new Scanner(System.in);
	      int busNo = sc1.nextInt();
	      switch(busNo) {
	      	case 7780: 
	      	case 3003: 
	      		System.out.println("집으로 가는 버스");
	      		break;
	      	case 1000:
	      	case 1002:
	      		System.out.println("인천으로 가는 버스");
	      		break;
	      	case 2000:
	      		System.out.println("평택으로 가는 버스");
	      		break;
	      	default:
	      		System.out.println("해당버스번호는 정보가 없습니다");
	      }
	     
	      
	      
//	      Scanner locat = new Scanner(System.in);
//	      System.out.println("출발지: ");
//	      System.out.println("도착지: ");
//	      String busLoc = locat.nextLine();
//	      
//	      Switch(busLoc){
//	         case 1:
//	            System.out.println("루트1");
//	            break;
//	         case 2:
//	            System.out.println("루트2");
//	         default:
//	            System.out.println("그 외는 정보가 없습니다");
//	         }
		
		
		
	}

}
