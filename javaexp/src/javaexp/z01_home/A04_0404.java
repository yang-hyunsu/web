package javaexp.z01_home;

import java.util.Scanner;

public class A04_0404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		04/04
//		[1단계:개념] 1. for문의 기본 구성요소를 기본 예제를 통하여 특징을 기술하세요.
//		[1단계:코드] 2. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
//		              1) 200~300 10단위 출력, 2) 1000~950 3단위 감소, 3) 100~0까지 2로 나눈값
//		[1단계:개념] 3. for문의 지역변수와 전역변수의 개념을 예제를 통해서 설명하세요
//		[1단계:개념] 4. for문의 전역변수를 활용한 출력형태를 예제를 통해 설명하세요              
//		[1단계:코드] 5. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
//		                no 과일명  가격
//		                 1 사과    3000            
//		                 2 바나나   4000           
//		                 3 딸기    12000
//		                   총계    19000            
//		[1단계:코드] 6. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
//			            # 출력 형식
//			            날짜  갯수 누적
//			            1일차 2개  2개
//			            2일차 4개  6개
//			            3일차 6개 12개
//		[1단계:코드] 7. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
//		[2단계:코드] 8. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
//		[1단계:개념] 9. 2중 for문을 기본형식을 예제를 통하여 설명하세요.
//		[1단계:코드] 10. 아래 내용을 2중 for문을 활용하여
//						1) 2X2(행X열)로 ♥를 표시 2) 3X2(행X열)로 ★표시 3) 입력한 행/열로 입력한 기호표시
//		[1단계:개념] 11. while문의 기본 형식을 예제를 통해 설명하세요.
//		[1단계:개념] 12. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
//		[1단계:코드] 13. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
//		[1단계:개념] 14. 반복문에서 break와 continue의 차이점을 기본 예제를 통하여 기술하세요

//      04/04
//      [1단계:개념] 1. for문의 기본 구성요소를 기본 예제를 통하여 특징을 기술하세요.
      for   (int i = 0; i <= 5; i++) {          // for(초기값; 반복조건; 증/감연산자)의 구성
         System.out.println("카운트: " + i);   // 반복시행될 구문이 중괄호 블럭 안에 들어감
      }
      // 초기값이 선언되고 반복조건에 해당하면 수행할 구문을 시행하고 증가연산자에 의해 변수 값이 증가함.
      // 위의 수행이 반복조건동안 반복되는 구조
      
//      [1단계:코드] 2. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
//                    1) 200~300 10단위 출력, 2) 1000~950 3단위 감소, 
      				//3) 100~0까지 2로 나눈값 +=,-=,*=,/=,%=      	
        // nu1+=10 : 10단위로 증가처리
        for (int nu1=200;nu1<=300;nu1+=10){
        //    if (nu1%10==0){
                System.out.print(nu1+" ");
        //    }
        }
        
         System.out.println();
        for (int nu2=1000;nu2>=950;nu2-=3){
            System.out.print(nu2+" ");
        }
         System.out.println();
         // nu3 = 100/2 50
         for (int nu3=100;nu3>=0;nu3/=2){
             System.out.print(nu3+" ");
             // 100, 50, 25....
        } 
        for (int nu3=100;nu3>=0;nu3--){
             System.out.print((nu3%2)+" ");
        }
        System.out.println();
       
//    //  [1단계:개념] 3. for문의 지역변수와 전역변수의 개념을 예제를 통해서 설명하세요
      // 담배를 하루에 한 갑 태울 때, 달마다 몇개피의 담배를 태우는지 누적 출력
        // 한갑에 20개
      /*
      int ciga = 20; //   아래의 for문의 전역변수로 for문 안에서 재할당하여 사용 가능하나 중복선언 불가
      int pieces = 0; // 한달에 피우는 담배 갯수
      for(int day = 1; day <= 30; day++) {   // for문의 지역변수로 for문 안에서 선언하였지만 
                                    // 해당 for문의 블럭이 끝나는 지점부터 재 선언하여 할당 해야함
         pieces+=ciga;
         System.out.println(day + "일차: " + day*ciga + "개피");
         
      }
      Systm.out.println(pieces);
      */
//      [1단계:개념] 4. for문의 전역변수를 활용한 출력형태를 예제를 통해 설명하세요      
      // 담배를 하루에 10개피 태울 때, 하루에 몇 개피를 태우는지 누적 출력하고 총 얼마의 금액을 사용했는지 출력
      // 한 갑에 20개, 4500원
      /*
      int cigaPrice = 4500;
      int dayCiga = 10;
      for(int day = 1; day <= 30; day++) {
         
         System.out.println(day + "일차: " + dayCiga + "개피");
         dayCiga += 10;
      }
      System.out.println("4월 담배값: " + dayCiga/20*4500 + "원");
      */
//      [1단계:코드] 5. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
//                      no 과일명  가격
//                       1 사과    3000            
//                       2 바나나   4000           
//                       3 딸기    12000
//                         총계    19000      
      
      Scanner scan = new Scanner(System.in);
      int totPrice = 0;      
      String fList = "";
      
      for (int cnt = 1; cnt <= 3; cnt++) {
         System.out.print("구매하실 과일 이름을 입력하세요: ");
         String fruit = scan.nextLine();
         System.out.print(fruit + "의 가격을 입력하세요: ");
         int fPrice = Integer.parseInt(scan.nextLine());
         if(cnt == 1) {
            System.out.println("no\t과일명\t가격");
         }
         fList = cnt + "\t" + fruit + "\t" + fPrice;
         System.out.println(fList);
         totPrice += fPrice;         
      }
            
      System.out.println("구매한 과일의 총 가격: " + totPrice); 
     
      
//      [1단계:코드] 6. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
//                     # 출력 형식
//                     날짜  갯수 누적
//                     1일차 2개  2개
//                     2일차 4개  6개
//                     3일차 6개 12개
      /*
      String brList = "";
      int brTot = 0;
      int brCnt = 0;
      System.out.println("날짜\t갯수\t누적");
      for(int day = 1; day <= 10; day++) {
         //if(day == 1) {
         //   System.out.println("날짜\t갯수\t누적");
         //}         
         brCnt += 2;
//         brList = day + "일차\t" + brCnt + "개\t" + brTot + "개";
         brList = day + "일차\t" + day*2 + "개\t" + brTot + "개";
//         brTot += brCnt;
         brTot+= day*2;      
 //        System.out.println(brList);
          System.out.println(day + "일차\t" + day*2 + "개\t" + brTot + "개");
      }
      입력데이터가 없이 리스트된 출력내용일 때, 반복문 안에서 바로 출력..
      */      
//      [1단계:코드] 7. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
      /*
      int x4_tot = 0;
      
      for(int cnt = 1; cnt <= 100; cnt++) {
         if(cnt % 4 == 0) {
            System.out.print("#");
            x4_tot += cnt;
         } else {
            System.out.print(cnt + " ");
         }         
      }
      System.out.println("\n4의 배수 총합: " + x4_tot);
      */
//      [2단계:코드] 8. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
      
      /*  1~10   cnt%3
       *  11~20  cnt%10 ==> 0~9
       *         cnt%10%3 ==> 마지막 3, 6, 9가 있을 때 처리
       *  cnt 10 ?  cnt%10 ==> 0, %3 ==>0 
       *         if(cnt%10!=0 && cnt%10%3==0)       
      System.out.println("369게임 시작(1~20)");
         for(int cnt = 1; cnt <= 20; cnt++) {            
            if(cnt % 3 == 0) {
               System.out.print("짝 ");
            } else {
               System.out.print(cnt + " ");
            }
         }
      */
//      [1단계:개념] 9. 2중 for문을 기본형식을 예제를 통하여 설명하세요.
      //   (1X1)   (1X2) 의 행열을 출력하시오.
      //   (2X1)   (2X2)
      /*
      for(int i = 1; i <= 2; i++) {   
         // i는 1이고 2보다 작기 때문에 아래 구문 수행
         for(int j = 1; j <= 2; j++) {
            // 1) i가 1인 상태로 j가 1로 선언되었고 아래 구문 수행
            // 4) i가 2가 되고 여전히 조건에 해당하니 아래 for문 수행...
            System.out.print("(" + i + "X" + j + ")\t");
            // 2) (1X1) 를 출력하고 j가 2가 되어 다시 해당 구문 수행 ==> (1X2)
            // 3) j가 3이 되어 for문의 반복조건에 해당하지 않으니 현재의 for문 탈출
         }
         System.out.println();
      }
      */
//      [1단계:코드] 10. 아래 내용을 2중 for문을 활용하여
//                  1) 2X2(행X열)로 ♥를 표시 2) 3X2(행X열)로 ★표시 3) 입력한 행/열로 입력한 기호표시
      /*
        int iRow = sc.nextInt();
        int iCol = sc.nextInt();
        String symbol = sc.nextLine();
        for(int row=1;row<=iRow;row++){
        	for(int col=1;col<=iCol;col++){
        		System.out.print(symbol);
        	}
        	System.out.println();
        } 
        
        for(int row=1;row<=2;row++){
        	for(int col=1;col<=2;col++){
        		System.out.print("♥");
        	}
        	System.out.println();
        } 
       
        for (int ha=1;ha<=3;ha++){
              for (int yu=1;yu<=3;yu++){
                  
                  if (ha==2&&yu==2){
                      System.out.print("♡\t");
                  } else if (ha==3&&yu==2){
                      System.out.print("☆\t");
                  } else {
                      System.out.print(ha+"×"+yu+"\t");
                  }
                  
              }
              System.out.println();
          }
      */
      
//      [1단계:개념] 11. while문의 기본 형식을 예제를 통해 설명하세요.
//      [1단계:개념] 12. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
      /*
      int whi01 = 100;
      int wTot = 0;
      while(whi01>=90) {         
         System.out.println(whi01--);
         wTot += whi01;      
         }         
      System.out.println(wTot);
      */
//      [1단계:코드] 13. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
      /*
      Scanner scan = new Scanner(System.in);
      int head = 0;
      int tot = 0;
      
      while(true) {         
         System.out.print("학생의 점수를 입력하세요: ");
         int point = scan.nextInt();         
         if(point==-1) {
            break;
         }         
         System.out.println( (++head) + "번 째 학생 점수: " + point);
         // 
         tot += point;
      }
      System.out.println("총점: " + tot + "점");
      System.out.println("평균 점수: " + (double)tot/head + "점");
      */
//      [1단계:개념] 14. 반복문에서 break와 continue의 차이점을 기본 예제를 통하여 기술하세요
      // 잡은 해양생물의 사이즈를 입력하고 30cm 이하면 방생하시오. -1 입력으로 종료
      // 잡은 해양생물 사이즈의 합계 출력
      Scanner scan2 = new Scanner(System.in);
      int sizeTot = 0;
      int fishCnt = 0;
      while(true) {
         
         System.out.print("방금 잡은 것의 크기는: ");
         int size = scan2.nextInt();         
         System.out.println(size + "cm 입니다.");
         if(size<=30 && size>=0) {
            System.out.println("방생합니다.");
            continue;
         } else if(size==-1) {
            System.out.println("낚시를 종료합니다.");
            break;
         } else {
        	fishCnt++; 
            System.out.println(size + "cm의 해양생물을 어망에 담습니다.");
         }
         sizeTot += size;         
      }
      System.out.println("오늘 잡은 물고기 갯수: " + fishCnt + "마리");
      System.out.println("오늘 잡은 사이즈 총합: " + sizeTot + "cm");
   }
}
