package javaexp.z01_home;

import java.util.Arrays;

public class A08_0412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
2023-04-12
[1단계:개념] 1. 메서드의 여러가지 처리형태(입력,로직,리턴,복합형태)를 기술하고 간단한 예제로 구현하세요
[1단계:개념] 2. 생성자로 데이터를 사용할 때와 메서드를 데이터를 사용할 때, 어떤 차이점이 있는지 예제로 기술하세요.
[1단계:확인] 3. 메서드(입력+로직) 선언 예제( class RetExp100 하위에 선언하여 호출하세요)
		1) 3개에 입력값 중에 가장 큰수 출력
		2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력
		*3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.
[1단계:확인] 4. 메서드(입력+로직+리턴) 선언  예제( class RetExp100 하위에 선언하여 호출하세요)
		1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서 리턴 메서드(5세미만 65이상 무료)
		2) 놀이공원 클래스에서 나이에 따라 입장료 10%, 15%, 20% 처리(나이구간 임의 적용)
		*3) 배열로 등록된 회원 선언하고, 입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.
[1단계:확인] 5. 클래스(필드,생성자,메서드) 선언  예제( class RetExp100 하위에 선언하여 호출하세요)
		1) 버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언, 탑승자인원수 누적메서드 리턴 현재 총탑승자수
		   탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수) 
			버스번호 @@번 @@명이 탑승했습니다. 
[1단계:개념] 6. 클래스내 일반변수, static 변수, final 상수, static final 상수의 차이점을 기본 예제로 설명하세요.
[1단계:확인] 7. 상대적경로 이동과 절대적 경로 이동예제를 하나씩 만들어 이동처리하세요
		
		 * */
//      2023-04-12
//      [1단계:개념] 1. 메서드의 여러가지 처리형태(입력,로직,리턴,복합형태)를 기술하고 간단한 예제로 구현하세요
      // # 메소드 처리형태 #
      
      // 예시 클래스 = Example
      
      // class Example{
      
      // 1. 메소드 매개변수(입력값) + 리턴값 
      // int number(int num01, int num02){
      //       return num01+num02;
      // }
      // - return 값이 있는 메소드를 선언 : int num
      // - 매개변수 2개 입력받기 : (int num01, int num02)
      // - 리턴값 받기 : return num01+num02
      
      // 2. 메소드 매개변수(입력값) + 프로세스 처리
      // void number(int num01, int num02){
      //      int sum = num01 + num02;
      //      System.out.println(num01+"+"+num02+"="+sum)
      //      if(sum>10){
      //         System.out.println("두개의 합이 10보다 큽니다")
      //      }
      // }
      // - return 값이 필요없는 메소드 선언 : void number
      // - 매개변수 2개 입력 받기 : (int num01, int num02)
      // - 프로세스 처리 : 
      //      if(sum>10){
      //         System.out.println("두개의 합이 10보다 큽니다")
            
      // 3. 메소드 매개변수(입력값) + 프로세스처리 + 리턴값처리
      // int number2(int num01, int num02) {
      //      result = "두 숫자가 다릅니다";
      //       if(num01==num02) {
      //         result = "두 숫자가 같습니다";
      //      }
      //       return result;
      // }
      // - return 값이 필요한 메소드 선언 : int number2
      // - 매개변수 2개 입력 받기 : (int num01, int num02)
      // - 프로세스 처리 : 
      //      result = "두 숫자가 다릅니다";
      //       if(num01==num02) {
      //         result = "두 숫자가 같습니다";
      //      }
      // - return 값 받기 : return result;
      
      
//      [1단계:개념] 2. 생성자로 데이터를 사용할 때와 메서드를 데이터를 사용할 때, 어떤 차이점이 있는지 예제로 기술하세요.
      /*
      생성자는 주로 해당객체를 생성해서 초기값이 설정할
      필요가 있을 때 주로 사용된다.
      ex) Person : 사람이름, 초기할당 정보
      			age(0) - 숫자형 데이터는 기본적으로 0이기에 설정 불필요
          Car : 자동차의 종류, 기본 배기량.. 최고속도..
      메서드는 주로 해당 객체 생성 후, 변경되는 데이터를 처리할 때
      사용된다.. 
      	  	getAge() : 나이를 먹다.
      	  	chLoc("서울") : 사는 곳이 변경되다..
      	  	speedUp(30)   속도가 증가되다.
      	  	drivingPerson("친구1") : 사람을 태우다..
      	  	
       * */
      // 예시 클래스 = Example2
      // class Example2{
      //       int num01;
      //      int num02;
      // 생성자로 데이터를 사용할 때 : 매개변수에 의해 전달되는 데이터 int num01 과 필드로 선언한 num01을 구분해야한다.
      //                   구분하기 위해, 필드 멤버를 this.변수 로 불러온다. 
      //       Example2(int num01){
      //             this.num01=num01;
      //       }
      // 메서드를 사용 할 때
      //       int getNum(int num01){
      //            return num01;
      //      }
      
//      [1단계:확인] 3. 메서드(입력+로직) 선언 예제( class RetExp100 하위에 선언하여 호출하세요)
//      1) 3개에 입력값 중에 가장 큰수 출력
      RetExp100 ex01 = new RetExp100();
      ex01.getLargest(5, 7, 9);
      
//      2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력
      ex01.pass01(75);
      
      
//      3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.
      ex01.sell("딸기");
      ex01.sell("키위");
      
//      [1단계:확인] 4. 메서드(입력+로직+리턴) 선언  예제( class RetExp100 하위에 선언하여 호출하세요)
//            1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서 리턴 메서드(5세미만 65이상 무료)
      
      ex01.isAdult(19);
      
//            2) 놀이공원 클래스에서 나이에 따라 입장료 10%, 15%, 20% 처리(나이구간 임의 적용)
      ex01.getPrice(4);
      ex01.getPrice(17);
      ex01.getPrice(20);
      ex01.getPrice(49);
      
//            3) 배열로 등록된 회원 선언하고, 입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.
      ex01.checkM("홍길동");
      ex01.checkM("박다솜");
      
//      [1단계:확인] 5. 클래스(필드,생성자,메서드) 선언  예제( class RetExp100 하위에 선언하여 호출하세요)
//            1) 버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언, 탑승자인원수(모든 버스에 탄 전체인원) 누적메서드 리턴 현재 총탑승자수
//               탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수) 
//               버스번호 @@번 @@명(각 차마다)이 탑승했습니다. 
      
      Bus b1 = new Bus(7001);
      b1.getOn(10);
      Bus b2 = new Bus(3007);
      b2.getOn(30);
      Bus b3 = new Bus(506);
      b3.getOn(14);

      Bus.total();
      
//      [1단계:개념] 6. 클래스내 일반변수, static 변수, final 상수, static final 상수의 차이점을 기본 예제로 설명하세요.
      
      // 1. 일반변수
      //      int num01;
      //      변수유형 변수이름;    
      //   - 클래스 내에서 사용 가능
      
      // 2. static 변수
      //      static int num01;
      //      static 변수유형 변수이름;
      //   - 클래스와 이로 만들어진 모든 객체들에서 사용할 수 있는 변수
      
      // 3. final 변수
      //       final int num01=0;
      //   - final로 선언되면 객체로 공유 된 후 변경 할 수 없다.
      
      // 4. static final 변수 
      //   - 클래스와 모든객체들에서 사용 가능하며 객체 생성 없이 호출 변수를 호출 할 수 있다. 값은 변경 되지 않는다.
      
//      [1단계:확인] 7. 상대적경로 이동과 절대적 경로 이동예제를 하나씩 만들어 이동처리하세요
      
      // 상대적 경로이동 : 현재 폴더에 있는 특정 파일로 이동 
      //             주소를 입력할 때 파일명으로 호출
      //            <a href = "a01_filename.html">문자</a>
      
      // 절대적 경로이동 : webapp에 있는 기준경로를 설정한 후 그 밑에 파일경로를 입력하여 호출
      //            <a href = "/frontWeb/a02_table/a03_imgTable.html">문자</a>
      
   }

}
class RetExp100{
   int num01;
   int num02;
   int num03;
   int largest;
   
   // 4-3)
   
  // String str02;
   String checkM(String str02) {
	   String members [] = {"홍길동", "김길동", "신길동"};
	   String ckMem = "가입되어 있지 않습니다.";
	   for(String name:members) {
		   if(name.equals(str02)) {
			   ckMem = "가입되어 있습니다."; 
		   }
	   }
	   //System.out.println("가입여부:"+ckMem);
	   return ckMem;
	   /*
      if(Arrays.asList(member).contains(str02)) {
         System.out.println("가입되어 있습니다");
      } else {
         System.out.println("가입되어 있지 않습니다.");
      }
      */
   }      
   
   
   // 4-2)
   double price=58000;
   double getPrice(int age) {
      double fPrice;
      if(age>=6 && age<18) {
         fPrice=(double)price*0.9;
         System.out.println("6세 이상 18세 미만 가격 : "+fPrice);
      } else if(age>=18 && age<35) {
         fPrice=(double)price*0.85;
         System.out.println("18세 이상 35세 미만 가격 : "+fPrice);
      } else if(age>=35 && age<65) {
         fPrice=(double)price*0.8;
         System.out.println("35세 이상 65세 미만 가격 : "+fPrice);
      } else {
         fPrice=0;
         System.out.println("6세 미만 65세 이상 가격 : "+fPrice);
      }
      return fPrice;
      
   }
   
   
   // 4-1)
   int age;
   String isAdult(int age){
      String result = "";
      if(age<5 || age>=65) {
         result="입장료 무료";
         System.out.println(result);
      } else {
         result="입장료 유료";
         System.out.println(result);
      }
      return result;
   }
   
   // 3-3)   
   String str01;   
   void sell(String str01) {
	   String products[]= {"사과","바나나","딸기"};
	   String ckProd="해당 물건이 없습니다";
	   for(String prod:products) {
		   if(prod.equals(str01)) {
			   ckProd="물건이 있습니다.!!"; 
		   }
	   }
	   System.out.println("구매할 물건:"+str01);
	   System.out.println("결과:"+ckProd);
	   /*
	      if(Arrays.asList(product).contains(str01)) {
	         System.out.println("재고가 있습니다");
	      } else {
	         System.out.println("재고가 없습니다");
	      }
      */
   }      
      
      
      
   
   
   // 3-1)
   void getLargest(int num01, int num02, int num03) {
	   int maxNum = 0;
	   if(num01>maxNum) {
		   maxNum = num01;
	   }
	   if(num02>maxNum) {
		   maxNum = num02;
	   }	   
	   if(num03>maxNum) {
		   maxNum = num03;
	   }
	   System.out.println("가장 큰 수:"+maxNum);
	   
	   /*
	   num01이 가능 큰 경우
	   		num01>num02  num01<num03
	   		num01=num02  num02>num03
	   		num01==num02==num03
	   				
	    * 
	    * */
	   
	   
      if(num01>num02) {
         if(num02<num03 && num01>num03) {
            largest=num01;
         } else if(num02<num03 && num01<num03) {
            largest=num03;
         } else {
            largest=num01;
         }
      }
      else if(num02>num01) {
         if(num01<num03 && num02>num03) {
            largest=num02;
         } else if(num01<num03 && num02<num03) {
            largest=num03;
         } else {
            largest=num02;
         }
      
      }
      System.out.println("가장 큰 수 : "+largest);
   }
   
   //3-2)
   void pass01(int score) {
      if(score>=70) {
         System.out.println("합격");
      } else {
         System.out.println("불합격");
      }
   }

}

//[1단계:확인] 5. 클래스(필드,생성자,메서드) 선언  예제( class RetExp100 하위에 선언하여 호출하세요)
//1) 버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언, 탑승자인원수(모든 버스에 탄 전체인원) 누적메서드 리턴 현재 총탑승자수
//   탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수) 
//   버스번호 @@번 @@명(각 차마다)이 탑승했습니다. 


class Bus{
   int busNum;
   int passenger;
   static int totP;
   public Bus(int busNum) {
      this.busNum = busNum;
   }
   int getOn2(int passCnt) {
	   System.out.println(busNum+
			   "번 버스 이번 정거장에서 탑승자수:"+passCnt);
	   passenger+=passCnt;
	   return passenger; // 이버스의 총탑승자 수 리턴
   }
   /*
   Bus b1 =new Bus(9001);
   b1.getOn2(5);
   int tot01 = b1.getOn2(5);
   System.out.println("현재 총탑승자수:"+tot01);
   b1.getOn2(10);
   System.out.println("현재 총탑승자수:"+b1.getOn2(10)); 
   Bus b2 =new Bus(8001);
   System.out.println("현재 총탑승자수:"+b2.getOn2(10));
   System.out.println("현재 총탑승자수:"+b2.getOn2(10));
   System.out.println("현재 총탑승자수:"+b2.getOn2(10));
    * */
   void getOn(int passenger) {
      totP+=passenger;
      System.out.println("버스 번호 "+busNum+"번 "+passenger+"명이 탑승했습니다.");
   }

   static String total() {
      System.out.println("총 승객 : "+totP);
      return "총 승객 : "+totP;
   }
   
   
   
}


