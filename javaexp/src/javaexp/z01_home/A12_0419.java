package javaexp.z01_home;

public class A12_0419 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
2023-04-18
[1단계:조별] 1. 접근제어자에 이해와 구현
		1) 접근제어자의 4가지 이해하고 설명할 수 있는가?
		2) 접근제어자에 맞게 구현할 수 있는가?
		3) default와 protected의 상속관계 객체내에서 호출시 어떤 문제가 있고, 원인은 무엇인가?
		4) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
			패키지1 : 참외, 사과, 멜론(참외상속), 바나나, 딸기
			패키지2 : 당근, 양파
			패키지3 : 수박(참외상속)
		   패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
[1단계:개념] 2. this.필드, this()의 사용에 있어서 차이점을 예제로 기술하세요.
[1단계:확인] 3. Team(팀명,승,무,패,승률)을 생성자의 매개변수(0~5)로 오버 로딩 선언하여 this()로 호출 처리하게 하세요
[1단계:개념] 4. this, super의 차이를 상속관계에서 필드, 생성자, 메서드의 관점에서 예제를 통해 기술하세요.
[1단계:개념] 5. 메서드 오버라이딩(overriding)을 메서드 오버로딩(overloading)과의 차이점을 기술해보세요.
[1단계:개념] 6. 선택자중 태그, 아이디, 클래스, 중첩적용의 예를 만들고 설명하세요.
1. 접근제어자에 이해와 구현
      1) 접근제어자의 4가지 이해하고 설명할 수 있는가?
         private: 같은 클래스 내에서만 사용가능
         X(default): 같은 패키지 내에서만 사용가능
         protected: 같은 패키지 내+외부 패키지의 상속관계에 있는 클래스에서 사용가능
         public: 외부패키지에서도 사용가능
         
      2) 접근제어자에 맞게 구현할 수 있는가?
         접근제어자에 대한 이해도를 높이기 위해 4번 문제에서 조원들과 함께 이야기를 나누면서
         상황에 맞는 접근 제어자 사용법을 숙지하도록 했습니다
         
      3) default와 protected의 상속관계 객체내에서 호출시 어떤 문제가 있고, 원인은 무엇인가?
          default는 외부패키지의 상속관계 객체 내에서 호출할 수 없고 protected는 가능하다.
          상위가 default고 하위가 protected라면 문제가 된다.
          default와 protected에서 상위 접근 제어자가 default이고 하위가 protected라면 
         하위의 접근제어가 범위가 더 커서 문제가 발생하지 않지만 반대의 경우에는 에러가 발생한다.
         # 상위관계 외부 패키지에서 클래스에서
         	protected 접근제어자가 설정된 필드에 대하여
         	객체 생성형식으로 호출하면 접근을 할 수 없고,
         	반드시 상속관계에서 호출하는 형식으로 처리하여야 접근이 가능.
         	class Son01 extends WoodCutter{
         		void callWoodCutter(){
         			WoodCutter w = new WoodCutter();
         			System.out.println(w.inheritMoney);
         			// protected이지만 객체생성 참조변수.필드이기에 접근 불가
         			System.out.println(inheritMoney); 
         			// 상속관계 바로 필드호출가능
         			
         		}
         	}
         	 
         	
         	
         	
         	
         	
      4) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
         패키지1 : 참외, 사과, 멜론(참외상속), 바나나, 딸기
         패키지2 : 당근, 양파
         패키지3 : 수박(참외상속)
         패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.

package javaexp.z01_homework.package1;

public class KoreanMelon {
   private String str01 = "나만 먹고 싶은 과일";
   String str02 = "같은 팀원끼리 먹고 싶은 과일";
   protected String str03 ="계절과일";
   public String str04 = "하우스과일";
   
   public void callFruitInfo(){
      KoreanMelon km = new KoreanMelon();
      System.out.println("private:"+km.str01);
      System.out.println("X(default):"+km.str02);
      System.out.println("protected:"+km.str03);
      System.out.println("public:"+km.str04);
   }
   public void callFruitInfo2(){
      System.out.println("private:"+str01);
      System.out.println("X(default):"+str02);
      System.out.println("protected:"+str03);
      System.out.println("public:"+str04);
   }
}

--------------------------------------------------

package javaexp.z01_homework.package1;

public class Apple {
   public void callFruitInfo(){
      KoreanMelon km = new KoreanMelon();
//      System.out.println("private:"+km.str01);
      System.out.println("X(default):"+km.str02);
      System.out.println("protected:"+km.str03);
      System.out.println("public:"+km.str04);
   }
//   public void callFruitInfo2(){   상속관계가 아니기 때문에 에러발생
//      System.out.println("private:"+str01);
//      System.out.println("X(default):"+str02);
//      System.out.println("protected:"+str03);
//      System.out.println("public:"+str04);
//   }
}

----------------------------------------------------

package javaexp.z01_homework.package1;

public class Banana {
   public void callFruitInfo(){
      KoreanMelon km = new KoreanMelon();
//      System.out.println("private:"+km.str01); 
      System.out.println("X(default):"+km.str02);
      System.out.println("protected:"+km.str03);
      System.out.println("public:"+km.str04);
   }
//   public void callFruitInfo2(){ 
//      System.out.println("private:"+str01);
//      System.out.println("X(default):"+str02);
//      System.out.println("protected:"+str03);
//      System.out.println("public:"+str04);
//   }
}

----------------------------------------------------

package javaexp.z01_homework.package1;

public class Melon extends KoreanMelon{
   public void callFruitInfo(){
      KoreanMelon km = new KoreanMelon();
//      System.out.println("private:"+km.str01); 
      System.out.println("X(default):"+km.str02);
      System.out.println("protected:"+km.str03);
      System.out.println("public:"+km.str04);
   }
   public void callFruitInfo2(){
//      System.out.println("private:"+str01);
      System.out.println("X(default):"+str02);
      System.out.println("protected:"+str03);
      System.out.println("public:"+str04);
   }
}

-----------------------------------------------------

package javaexp.z01_homework.package1;

public class Strawberry {
   public void callFruitInfo(){
      KoreanMelon km = new KoreanMelon();
//      System.out.println("private:"+km.str01); 
      System.out.println("X(default):"+km.str02); 
      System.out.println("protected:"+km.str03);
      System.out.println("public:"+km.str04);
   }
//   public void callFruitInfo2(){
//      System.out.println("private:"+str01);
//      System.out.println("X(default):"+str02);
//      System.out.println("protected:"+str03);
//      System.out.println("public:"+str04);
//   }
}

-------------------------------------------------------

package javaexp.z01_homework.package2;

import javaexp.z01_homework.package1.KoreanMelon;

public class Carrot {
   public void callFruitInfo(){
      KoreanMelon km = new KoreanMelon();
//      System.out.println("private:"+km.str01); 
//      System.out.println("X(default):"+km.str02); 
//      System.out.println("protected:"+km.str03); 
      System.out.println("public:"+km.str04);
   }
//   public void callFruitInfo2(){
//      System.out.println("private:"+str01);
//      System.out.println("X(default):"+str02);
//      System.out.println("protected:"+str03);
//      System.out.println("public:"+str04);
//   }
}

------------------------------------------------------

package javaexp.z01_homework.package2;

import javaexp.z01_homework.package1.KoreanMelon;

public class Onion {
   public void callFruitInfo(){
      KoreanMelon km = new KoreanMelon();
//      System.out.println("private:"+km.str01); 
//      System.out.println("X(default):"+km.str02); 
//      System.out.println("protected:"+km.str03); 
      System.out.println("public:"+km.str04);
   }
//   public void callFruitInfo2(){
//      System.out.println("private:"+str01);
//      System.out.println("X(default):"+str02);
//      System.out.println("protected:"+str03);
//      System.out.println("public:"+str04);
//   }
}

---------------------------------------------------------

package javaexp.z01_homework.package3;

import javaexp.z01_homework.package1.KoreanMelon;

public class Watermelon extends KoreanMelon{
   public void callFruitInfo(){
      KoreanMelon km = new KoreanMelon();
//      System.out.println("private:"+km.str01); 
//      System.out.println("X(default):"+km.str02); 
//      System.out.println("protected:"+km.str03); 
      System.out.println("public:"+km.str04);
   }
   public void callFruitInfo2(){
//      System.out.println("private:"+str01);
//      System.out.println("X(default):"+str02);
      System.out.println("protected:"+str03); 
      System.out.println("public:"+str04);
   }
}

-------------------------------------------------------
         
         
2. this.필드, this()의 사용에 있어서 차이점을 예제로 기술하세요.
   1) this.필드 : 지역변수와 구분하여 class의 전체 전역변수에 사용되는 변수를 호출해서 할당/사용할 때 사용된다.
            
   2) this(), this(25), this("홍길동") : 
         생성자가 overloading으로 여러 개 선언되어 있을 때
         다른 생성자를 호출해서 데이터를 할당할 때 사용된다.
         - 호출시 반드시 생성자 선언 첫 라인에서 호출하여야 한다.
   예시)
      class Person0419{
      String name;
      int age;
      String loc;
      public Person0419() {
         System.out.println("객체 생성: "+this);
      }
      public Person0419(String name) {
         this();                  // 위의 Person0419()를 지칭
         this.name = name;          // this.name: 전역변수, name: 지역변수
         System.out.println("매개변수 1개");
      }
}
3. Team(팀명,승,무,패,승률)을 생성자의 매개변수(0~5)로 오버 로딩 선언하여 this()로 호출 처리하게 하세요
*/
      Team t01 = new Team("과일바구니",3,0,7,0.3);
/*
4. this, super의 차이를 상속관계에서 필드, 생성자, 메서드의 관점에서 예제를 통해 기술하세요.
   super은 같은 이름을 갖는 메서드를 호출할 때 상위 클래스의 것을 지칭하고
   this는 같은 이름을 갖는 메서드를 호출할 때 현재 클래스의 것을 지칭한다.
*/
      Son s01 = new Son();
      s01.papajohns();
/*
5. 메서드 오버라이딩(overriding)을 메서드 오버로딩(overloading)과의 차이점을 기술해보세요.
   메서드 오버라이딩: 부모 클래스의 상속 메서드를 동일한 이름, 심지어 동일한 매개변수로 다시 자식 클래스에서 정의하는 것을 말한다.
   	     접근제어자는 하위에서는 동일하거나 더 넓은 접근제어자를 사용하여야 한다.
   	     private < default(X) < protected < public
   메서드 오버로딩: 메서드는 이름 뿐 아니라 매개변수의 개수, 유형, 순서에 따라서도 구분할 수 있기 때문에 같은 이름의 메서드일지라도
         매개변수로 구분할 수 있다면 사용할 수 있다. 이것을 메서드 오버로딩이라 한다.
         
   오버로딩은 같은 클래스 내에서도 가능하지만, 오버라이딩은 상속관계의 메서드에서 가능한 기법이다.
   
   
6. 선택자중 태그, 아이디, 클래스, 중첩적용의 예를 만들고 설명하세요.
<!DOCTYPE html>
<html>
   <head>
      <!-- 6. 선택자중 태그, 아이디, 클래스, 중첩적용의 예를 만들고 설명하세요. -->
      <meta charset="UTF-8">
      <title>Insert title here</title>
      <style type="text/css">
         h2{color:green;}
         #id01{color:navy}
         .cls01{color:red;}
         .cls02{background-color:yellow;}
      </style>
   </head>
   <body>
      <h2>안녕하세요</h2>
      <h3 id="id01">안녕하세요</h3>
      <h3 class="cls01">안녕하세요</h3>
      <h3 class="cls01 cls02">안녕하세요</h3>
      
   </body>
</html>

*/
   }

}
class Team{
   String name;
   int win;
   int draw;
   int lose;
   double winPers;
   public Team() {
      
   }
   public Team(String name) {
      this();
      this.name = name;
   }
   public Team(String name, int win) {
      this(name);
      this.win = win;
   }
   public Team(String name, int win, int draw) {
      this(name, win);
      this.draw = draw;
   }
   public Team(String name, int win, int draw, int lose) {
      this(name, win, draw);
      this.lose = lose;
   }
   public Team(String name, int win, int draw, int lose, double winPers) {
      this(name, win, draw, lose);
      this.winPers = winPers;
      System.out.println("팀 명: "+name+", 승: "+win+", 무: "+draw+", 패: "+lose+", 승률: "+winPers);
   }
   
}

class Father {
   String name = "아버지";
   
   public Father(){
      
   }
   
   public Father(String name) {
      this.name = name;
   }
   
   void papajohns() {
      System.out.println("#아버지 메서드 호출#");
      System.out.println("아버지 호출:"+name);
   }
}


class Son extends Father {
   String name = "아들";
   

   public Son() {
      super("아버지");
   }


   public Son(String name) {
      this.name = name;
   }
   void papajohns() {
      super.papajohns(); // 호출하지않으면 에러발생
      System.out.println("#아들 메서드 호출#");
      System.out.println("super.name(아버지 호출):"+super.name);
      System.out.println("this.name(아들 호출):"+this.name);
   }
}