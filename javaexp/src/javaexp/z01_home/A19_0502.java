package javaexp.z01_home;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class A19_0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
2023-05-02
[1단계:확인] 1. 사용자 정의 예외 4지 선다 문제를 틀리면 사용자 예외 객체 생성, 맞으면 정답으로 처리.
[1단계:개념] 2. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
[1단계:확인] 3. Random를 활용하여 10번 홀짝 게임 결과를 출력하세요.
[1단계:확인] 4. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
[1단계:개념] 5. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
[단계별:확인] 
1단계 1~10까지 숫자 카드를 만들어 List<String>에 담아서, 임의의 숫자를 1개를 출력하세요
2단계 A~10,J,Q,K번호 문자로 만들어 List<String>를 임의의 카드를 7장을 출력하세요
3단계 카드클래스(두가지 속성 - 모양♣,♥,♠,◆,번호 A~10,J,Q,K)를 선언하고, 52개의 카드를 만들어(for문 활용) List에 담아서 출력하세요
4단계 카드클래스(모양,번호)를 선언하고, 52개의 카드를 만들어(for문 활용) List에 담아서, 임의의 카드를 7장을 출력하세요 4명의 참가자에게 돌리세요.
*/	

//      [1단계:확인] 1. 사용자 정의 예외 4지 선다 문제를 틀리면 사용자 예외 객체 생성, 맞으면 정답으로 처리.
//      Scanner sc = new Scanner(System.in);
//      System.out.println("문제: 1+1은?");
//      System.out.println("1. 1\t2. 2\t3. 3\t4. 4");
//      String cor = "2";
//      while(true) { // 정답이 나올 때까지 반복 처리
//	      try {
//	         System.out.print("정답입력: ");
//	         String ans = sc.nextLine();
//	         if(!ans.equals(cor)){
//	            throw new CorrectException(ans);
//	         }
//	         System.out.println("정답입니다.");
//	         break; // 정답을 입력했을 때, 반복 수행 종료..
//	      }catch(CorrectException e) {
//	         System.out.println(e.getMessage());
//	      }
//      }
//      [1단계:개념] 2. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
      /*
        1) Math 클래스: 주로 데이터의 기능적인 처리를 할 때 활용된다. 
        		객체의 생성 없이 사용하는 static 메서드를 지원하는 클래스.
        2) Random 클래스: 임의의 수를 보다 효과적으로 처리한다.
         		객체 생성 후, 처리하는 기능 메서드 지원
                 boolean, int, long, float, double 등의 데이터를 메소드를 이용해서 임의로 처리할 수 있다.
       */
      
//      [1단계:확인] 3. Random를 활용하여 10번 홀짝 게임 결과를 출력하세요.
//      Random rd = new Random();
//      for(int i=1; i<=10; i++) {
//         int ranNum = rd.nextInt(10);
//         System.out.print(ranNum);
//         if(ranNum %2 == 0) {
//            System.out.println(" : 짝");
//         }else {
//            System.out.println(" : 홀");
//         }
//      }
//      	Scanner sc12 = new Scanner(System.in);
//      	Random rd12 = new Random();
//      	for(int cnt=1;cnt<=10;cnt++) {
//      		boolean isOdd = rd12.nextBoolean();//랜덤 홀이면 true
//      		System.out.println(cnt+"번째 홀/짝게임 컴퓨터가 홀/짝일까요? 입력:");
//      		String inGame = sc12.nextLine();
//      		if( (isOdd && inGame.equals("홀")) ||
//      			(!isOdd && inGame.equals("짝"))	
//      		  ) {
//      			System.out.println(inGame+" 맞추었습니다 ^^ you win!");
//      		}else {
//      			System.out.println("못 맞추었습니다.!!");
//      		}
//      	}
      
      
//      [1단계:확인] 4. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
	  System.out.println("# 컴퓨터와 함께 하는 가위, 바위, 보 #");
      Scanner sc31 = new Scanner(System.in);		
      Random rd1 = new Random();
      //                 0     1    2
      String games[]= {"가위","바위","보"};
      //       games[0], games[1], games[2]
      //       0,1,2를 랜덤으로 가져오고 games배열에 index로 
      //       넣으면 랜덤 가위/바위/보를 가져올 수 있다.
      //                뒤에 있는 사람 승 (comIdx+1)%3==myIdx
      //                myIdx가 이기는 조건
      //                 0+1  == 1  (바위)  
      //                 1+1  == 2  (보)
      //                 2+1%3== 0  (가위)
      //                앞에 있는 사람 승 (comIdx+2)%3==myIdx
      //                comIdx가 이ㅣ는 조건..
      //                 0+2 == 2  (가위)
      //                 1+2%3 == 0  (바위)
      //                 2+2%3 == 1  (보)
      int win,eq,def; win=eq=def=0; // 선언과 초기화
      for(int i=1; i<=3; i++) {
    	  int comIdx = rd1.nextInt(3); //0,1,2
    	  System.out.print(i+"번째 게임 가위는 1번, 바위는 2번, 보는 3번 입력:");
    	  int myIdx = sc31.nextInt()-1; // 0,1,2
    	  System.out.println("컴이 낸 가위/바위/보:"+games[comIdx]);
    	  System.out.println("내가 낸 가위/바위/보:"+games[myIdx]);
    	  if(comIdx==myIdx) {
    		  System.out.println("무승부"); eq++;
    	  }else if(((comIdx+1)%3) ==myIdx) {
    	  // 컴에서 나온 랜덤 index값에서 +1한 값이 내가 선택한 index와 같으면
    	   // 내가 승  ex) games[0]은 가위 이고, games[1] 바위이면
    	   // index 기준으로 0과 1을 비교해서 0+1이 1과 같을때는 내가 승리하는 바위가
    	///    처리된다
    		  System.out.println("나의 승"); win++;
    	  }else {
    		  System.out.println("컴퓨터 승"); def++;
    	  }
    	  
      }
      System.out.println("승:"+win+", 무:"+eq+", 패:"+def);
      // 10:05~ 시작
	  
//      [1단계:개념] 5. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
      /*
           1) List: 순서를 유지하면서 저장한다. 중복으로 저장할 수 있음.
              ArrayList, Vector, LinkedList
            2) Set: 순서에 관계없이 저장한다. 중복으로 저장할 수 없음.
               HashSet, TreeSet
            3) Map: 키-값의 쌍으로 저장된다. 키는 중복될 수 없다.
                HashMap, HashTable, TreeMap, Properties
       */
      
//      [단계별:확인] 
//      1단계 1~10까지 숫자 카드를 만들어 List<String>에 담아서, 임의의 숫자를 1개를 출력하세요
      Random rd2 = new Random();
      int rnum1 = rd2.nextInt(10);
      List<String> card1 = new ArrayList<String>();
      for(int i=0; i<10; i++) {
         card1.add(i,(i+1)+"");
      }
      System.out.println("임의의 숫자: "+card1.get(rnum1));
      
//      2단계 A~10,J,Q,K번호 문자로 만들어 List<String>를 임의의 카드를 7장을 출력하세요

      
//      3단계 카드클래스(두가지 속성 - 모양♣,♥,♠,◆,번호 A~10,J,Q,K)를 선언하고, 
//         52개의 카드를 만들어(for문 활용) List에 담아서 출력하세요
      List<Card> clist = new ArrayList<Card>();
      Card cd = new Card();
      
      for(int i=1; i<=4; i++) {
         if(i==1) {cd.shape ="♣"; }
         else if(i==2) {cd.shape ="♥"; }
         else if(i==3) {cd.shape = "♠"; }
         else {cd.shape = "◆";}
         
         for(int j=1; j<=13; j++) {
            cd.num = j+"";
            if(i==1) {cd.num = "A"; }
            clist.add(cd);
         }
      }
      for(Card c:clist) {
         System.out.print(c.shape +c.num+" ");
      }
      
//      4단계 카드클래스(모양,번호)를 선언하고, 52개의 카드를 만들어(for문 활용) List에 담아서, 
//      임의의 카드를 7장을 출력하세요 4명의 참가자에게 돌리세요.
      
   }
}
class Card{
   String shape;
   String num;
   
   public Card() {}
   
   public Card(String shape, String num) {
      this.shape = shape;
      this.num = num;
   }
}
class CorrectException extends Exception{
   public CorrectException(String ans) {
      super("입력한 답은: " +ans +"입니다.");
   }
   @Override
   public String getMessage() {
      return super.getMessage() + "\n오답입니다. ";
   }
}