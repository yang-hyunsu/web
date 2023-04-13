package javaexp.z01_home;

public class A01_0330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
0330
[1단계:개념] 1. Z01_JavaPro.java의 실행과정을 오늘한 예제 기준으로 정리해보세요.
[1단계:코드] 2. 변수명과 타입을 적절하게 선언하여 아래와 같이 선언하고 출력하세요
			  - 이름, 나이, 키 
			  - 좋아하는 음악명, 발매연도
			  - 오늘 지출금액 목록과 비용, 합산
[1단계:개념] 3. 기본 출력형식과 특수문자에 대하여 예제를 통해 기술하세요
[1단계:개념] 4. 변수명의 선언 규칙을 예제를 통하여 기술하세요.
[1단계:개념] 5. 기본 데이터 유형을 나열하고, 해당 데이터를 할당하여 출력하는 예제를 만드세요
[1단계:개념] 6. 형변환이란 무엇인가 예제를 통해서 기술하세요.
[1단계:코드] 7. 21억, 15억 데이터를 int에 할당하고, 합산결과를 변수를 선언하여 할당 출력하세요
[1단계:개념] 8. char유형과 code값의 관계에 대하여 기술하세요.
[1단계:코드] 9. 알파벳의 코드값 범위와 문자 0부터 9까지 범위의 코드값 범위를 확인하고 출력하세요.

/*
 
  
1단계.Z01_JavaPro 의 실행과정의 오늘한 예제 기준으로 정리해보세요.
Z01_JavaPro.java 사람이 만든 코드
javac Z01_JavaPro.java
Z01_JavaPro.class
java Z01_JavaPro
 main()메서드가 있으면 수행된다.


 */
  //#변수명명규칙
      int breakCount = 50;
      int apple_price = 4000;
      // 변수를 사용할 때 어떤 목적에 의해 사용되는지 구분하여 선언하고
      // 두가지이상의 단어가 합쳐질 때 뒤에 단어에 대문자나 _ 를 사용한다.
  //#자바 데이터 유형
//      ex)byte유형으로 40을 할당하고, 
//         int유형으로 4000을 할당.
//         long유형으로 50억을 할당
//         float유형으로 58.4 할당.
//         하여 출력하세요.
      byte num01 = 40;
      int num02 = 4000;
      long num03 = 5000000000L;
      // int유형의 범위를 넘어선경우 L/l 붙여서 사용
      float num04 = 58.4f;
      // float유형으로 선언하여 할당하는 경우 마지막 F/f 붙여서 사용
      double num20 = 30.25;
 //# 형변환
//      ex) 80과 6을 정수로 선언하여 
//          소숫점이하가 나오지않는 경우와 나오는 경우를 처리하여 출력하시오.
      int num05 = 80;
      int num06 = 6;
      System.out.println(num05/num06);
      // 나오지않는경우
      System.out.println(num05/(double)num06);
      System.out.println((double)num05/num06);
      System.out.println((double)num05/(double)num06);
      // 나오는경우
  //# 실무형태
//      ex) 문자열을 "20"과 "9"를 정수형으로 형변환하여,
//          합산된 결과를 출력하시오.
      String str01 ="20";
      String str02 ="9";
      int num07 = Integer.parseInt(str01);
      int num08 = Integer.parseInt(str02);
      System.out.println(str01+"+"+str02+"=");
      System.out.println(num07+num08);
      
//      ex2)문자열 "15.2"과 "20.2"를 실수형으로 형변환하여
//          합산된 결과를 출력하세요
      String str03 = "15.2";
        String str04 = "20.2";
        double num09 = Double.parseDouble(str03);
        double num10 = Double.parseDouble(str04);
        System.out.println(str03+"+"+str04+"=");
        System.out.println(num09+num10);
        
// 2. 변수명과 타입을 적절하게 선언하여 아래와 같이 선언하고 출력하시오.
/*      -이름, 나이, 키
 *      -좋아하는 음악명,발매연도
 *      -오늘 지출금액 목록과 비용,합산
 */
//      (이름)
        String name = "강경웅";
        System.out.println(name);
//      (나이)
        int age = 26;
        System.out.println(age);
//      (키)
        double tall = 168.5;
        System.out.println(tall+"cm");
//      (좋아하는 음악명)
        String music = "checklist";
        System.out.println(music);
//      (발매연도)
        int year = 2019;
        System.out.println(year);
//      (오늘 지출금액,목록,비용,합산)
        int pay = 30000;                      
        System.out.println(pay);
        String list = "밥,교통수단,커피,책";
        int eatPay = 7000;
        int transPay = 2500;
        int coffeePay = 3000;
        int bookPay = 22000;
        int totPay = eatPay+transPay+coffeePay+bookPay;
        
       
        
        System.out.println(list);
 
 // 3. 기본 출력형식과 특수문자에 대하여 예제를 통해 기술하세요

//         기본출력형식
     System.out.println("사과"+ "배" + "키위");
     // 특수문자 사용 
     System.out.println("사과\t배\t키위");
     // 띄어쓰기: \t
     System.out.println("사과\n배\n키위");
     // 줄간격 띄우기: \n
     System.out.println("오늘은\"달콤한 사과\"를 먹어야지!!");
     // 특수문자" 사용: \"
     System.out.println("오늘은\'달콤한 사과\'를 먹어야지!!");
     System.out.println("오늘은\\달콤한 사과\\를 먹어야지!!");
     System.out.println("오늘은'달콤한 사과'를 먹어야지!!");
     

// 4. 변수명의 선언 규칙을 예제를 통하여 기술하세요.
/*
      ex)

     int cash01 = 1000; (o)
     int 0415 = 2000; (x) //첫글자는 문자여야한다.
     int $cash01 = 1500; (o) // 변수명에 특수문자 사용은 $, _ 만 가능하다.
     int cash02 = 1400;
     int cash02 = 4200;(x) // 선언은 동일변수 불가
     cash02 = 4200; (o) // 선언된내용을 할당하는것은 가능
     var for = 30; (x) // 예약어는 변수로 사용 x
*/                    
// 5. 기본 데이터 유형을 나열하고, 해당 데이터를 할당하여 출력하는 예제를 만드세요
/*  
     정수
       byte(8bit) - -128~127
            -영문문자를 나타낼 수 word단위
       char(2byte)
       short(2byte) - 0~65535
       int(4byte~32)** -2146483648~2147483647
                      (약21억)
       long(8byte-64) 21억 이상
                 
     실수
      float(4byte)
      double(8byte)
*/
     byte type01 = 126;
     char type02 = 'A';
     short type03 = 6500;
     int type04 = 20000000;
     long type05 = 3000000000000l;
     
     float type06 = 3.5586f;
     double type07 = 300.45;
     
     System.out.println(type01);
     System.out.println(type02);
     System.out.println(type03);
     System.out.println(type04);
     System.out.println(type05);
     System.out.println(type06);
     System.out.println(type07);
     
//   6. 형변환이란 무엇인가 예제를 통해서 기술하세요
     byte code01 = 30;
     long code02 = 30;
   //code01 = code02;(x)  -강제
     code02 = code01;//(o)  -자동
//     =>  code01 = (byte)code02 ;

//   7. 21억, 15억 데이터를 int에 할당하고, 합산결과를 변수를 선언하여 할당 출력하세요
     
     int money01 =2100000000;
     int money02 =1500000000;             
     int tot02 = money01+money02;
//     System.out.println("int합산:"+tot02); (X)
     long tot03 = (long)money01+money02;
     System.out.println((long)money01+(long)money02);
     
//   8. char유형과 code값의 관계에 대하여 기술하세요.
     
     char code05 = 'A'; // ' ' : 한 자를 포함하여 입력
      char[] code06 = {'a','p','p','l','e'};

//      9. 알파벳의 코드값 범위와 문자 0부터 9까지 범위의 코드값 범위를 확인하고 출력
      
      for(int code=0;code<=300;code++) {
           System.out.println(code+":");            
           System.out.println((char)code);
      }
      //숫자형 문자 0~9 48~57
      //65~90 알파벳 대문자, 97~122 알파벳 소문자



/*

		
		*/		
		
	}

}
