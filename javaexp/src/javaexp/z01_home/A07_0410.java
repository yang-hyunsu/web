package javaexp.z01_home;

public class A07_0410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		04/07
		[1단계:개념] 1. 클래스와 객체의 차이점을 예제를 통하여 기술하세요
		[1단계:개념] 2. 필드의 특성을 예제를 통해 기술하세요
		[1단계:개념] 3. 생성자와 일반 메서드의 기능적 차이점을 기술하세요
		[1단계:코드] 4. Computer 클래스에서 속성으로 제조사, cpu종류, ram 메모리용랑, ssd용량을 속성을 지정하여,
				기본생성자, 매개변수가 3개인 생성자(오버로딩규칙에 의해 2개 선언)를 선언하고, 객체를 생성하고 확인하세요.
		[1단계:개념] 5. html의 meta 정보의 의미를 기술하세요.
		[1단계:개념] 6. base 태그를 처리하는 방법을 예제를 통해서 기술하세요.
		[1단계:개념] 7. img 태그가 가지고 있는 속성을 기술하세요.
		[1단계:확인] 8. webapp 하위에 a00_img안에 img03.jpg를 복사해와서 현재 폴드에서 
				img 태그로 호출해서 수행 하는 것과,  a00_img하위  img05.jpg
				파일을 해당 경로 그대로 두고, img 태그로 호출해서 수행하는 것의 차이점을 기술하세요.

		 * */
	      // 1. 클래스와 객체의 차이점을 예제를 통하여 기술하세요
	      EverLand seoul = new EverLand();
	      EverLand busan = new EverLand();
	      EverLand gangwon = new EverLand();
	      
	      System.out.println(seoul);
	      System.out.println(busan);
	      System.out.println(gangwon);
	      
	      /*
	      클래스는 설계도이고 객체는 설계도를 바탕으로 만드는 구체적인 물체나 사물이다.
	      하나의 클래스를 만들면 여러 개의 인스턴스를 만들 수 있다.
	      ex) 에버랜드를 서울,부산,강원도 등 다양한 곳에 설계도를 바탕으로 만들 수 있음
		  클래스(class, 어원: classification)는 객체 지향 프로그래밍(OOP)에서 특정 객체를 생성하기 위해 변수와 메소드를 정의하는 일종의 틀(template)이다. 객체를 정의하기 위한 메소드와 변수로 구성된다.[1][2]
		  템플릿을 사용하면 객체를 분류할 때 멤버의 자료형을 미리 정하지 않고 객체를 사용할 때 결정할 수 있다. 이를 통해 클래스나 변수의 중복 정의를 하지 않아도 되므로 효율적으로 코딩이 가능하다.
		  객체는 클래스로 규정된 인스턴스로서, 변수 대신 실제값을 가진다.
		  클래스는 OOP를 정의하는 개념 중 하나인데, 클래스에 대한 중요한 몇가지의 개념들은 다음과 같다.
		  클래스는 전부 혹은 일부를 그 클래스 특성으로부터 상속받는 서브클래스를 가질 수 있으며, 클래스는 각 서브클래스에 대해 수퍼클래스가 된다.      
			      
	      */
	      
	      // 2. 필드의 특성을 예제를 통해 기술하세요
	      
	      /*
	      필드는 클래스(객체)의 전역변수(상수)이며 클래스의 모든 구성 요소에 영향을 미친다.
	      지역변수와 이름이 같을 경우 클래스 내에서 this.필드명을 통해 구분한다.
	      객체생성시는 참조명.전역변수로 사용.
	      */
	      
	      Person3 p01 = new Person3("홍길동",27);
	      System.out.println("이름: "+p01.name);
	      System.out.println("나이: "+p01.age);
	      
	      // 3. 생성자와 일반 메서드의 기능적 차이점을 기술하세요
	      /*
	       생성자는 클래스를 생성할 때 클래스명과 똑같은 함수를 만드는 것을 말한다.
	       또한, 함수의 일부 기능을 사용할 수 있으며 주로 저장 기능을 이용한다.
	       객체의 초기화를 위해서 사용된다.
	       클래스를 만들 때 생성자를 만들지 않으면 자동으로 클래스명과 동일하고 매개변수가 없는 함수를
	       만들어 실행시 사용할 수 있도록 한다.
	       
	       일반 메서드는 저장,로직,리턴에 해당하는 함수의 모든 기능을 사용할 수 있다.
	       
	       */
	      
	      //4. Computer 클래스에서 속성으로 제조사, cpu종류, ram 메모리용랑, ssd용량을 속성을 지정하여,
////	         기본생성자, 매개변수가 3개인 생성자(오버로딩규칙에 의해 2개 선언)를 선언하고, 
////	         객체를 생성하고 확인하세요.
//	      class Computer01{
//	      	 Computer01(){}
//	      	 Computer01(String cpu, int ram, int ssd){}
//	      	 Computer01(int ram, int ssd, String cpu){}
//	      }
//	      
//	         
//	      Computer01 com01 = new Computer01("AMD",32,500);
//	      System.out.println("제조사: "+com01.company);
//	      System.out.println("ram 메모리 용량: "+com01.ramMem);
//	      System.out.println("ssd 용량: "+com01.ssdMem);
//	      
//	      Computer01 com02 = new Computer01(64,500,"Intel");
//	      System.out.println("제조사: "+com02.company);
//	      System.out.println("ram 메모리 용량: "+com02.ramMem);
//	      System.out.println("ssd 용량: "+com02.ssdMem);
//	      
	      //5. html의 meta 정보의 의미를 기술하세요
	      
	      /*
	      
	      메타 데이터는 데이터를 설명하는 데이터를 의미한다.
	      
	      ex)
	      사진을 찍었을 때 사진에 담겨있는 장소나 시간 
	      오디오 데이터에 있는 재생 시간, 채널 수
	      이미지 데이터에 들어 있는 이미지 폭, 넓이, 컬러 해상도 등
	      
	      html에서 메타 정보를 담기위한 태그로는 link, base, meta, style, script 등이 있다.
	      메타 태그들은 head 태그 안에 넣어서 작성해야 하며 script 태그 같은 경우에는 body태그 안에
	      작성할 수 있다.
	      
	      */
	      
	      // 6. base 태그를 처리하는 방법을 예제를 통해서 기술하세요 
	      /*
	       <!DOCTYPE html>
	          <head>
	              <base href="http://localhost:8080/frontWeb/a03/">
	              <meta charset="UTF-8">
	              <title>Document</title>
	          </head>
	          <body>
	              <a href="a01_show.html">base 이동합니다.</a>
	          </body>
	      </html>
	       */
	      
	      // 7.  img 태그가 가지고 있는 속성을 기술하세요
	      /*
	       img 태그의 src에 이미지 주소를 지정한다.
	       <img src="이미지 주소">
	       alt="이미지 없을 때 나오는 문자열"
	       width="이미지 넓이"
	       height="이미지 폭"
	       
	       src를 통해 지정할 수 있는 이미지 종류는 bmp, gif, png, jpg가 있다.
	       */
	      
	      // 8. webapp 하위에 a00_img안에 img03.jpg를 복사해와서 현재 폴드에서 
//	         img 태그로 호출해서 수행 하는 것과,  a00_img하위  img05.jpg
//	         파일을 해당 경로 그대로 두고, img 태그로 호출해서 수행하는 것의 차이점을 기술하세요.
	      
	      /*
	       1. <img src="img03.jpg"> : 
	       		이 내용을 포함한 html 파일의 같은 폴드에 img가 있는 경우
	       2. <img src="/frontWeb/a00_img/img05.jpg">
	       3. 외부 서버에 특정한 이미지가 있는 경우..
	       		<img src="data:image/jpeg;base64,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">
	       
	       첫 번째 경우는 현재 폴더에 사진 파일이 있어야지 작동하며 일일이 필요한 이미지들을 현재 폴더로 복사해와야하는
	       번거로움이 있다.
	       하지만 두 번째 경우는 이미지들을 한 곳에 모아놓고 필요한 이미지가 있을 때마다 현재 폴더에 복사하는 것 없이
	       경로를 입력하는 것만으로 불러와서 쓸 수 있다. 또한, src/webapp의 경로를 생략하고 /frontWeb만으로
	       처리할 수 있어서 간편하다.
	       */		
	}

}

class EverLand {
   
}

class Person3 {
   String name;
   int age;
   
   Person3(String name, int age) {
      this.name = name;
      this.age = age;
   }
}

class Computer01 {
   String company;
   String cpu;
   int ramMem;
   int ssdMem;
   Computer01() {
      
   }
   Computer01(String company,int ramMem, int ssdMem) {
      this.company = company;
      this.ramMem = ramMem;
      this.ssdMem = ssdMem;
   }
   
   Computer01(int ramMem, int ssdMem, String company) {
      this.company = company;
      this.ramMem = ramMem;
      this.ssdMem = ssdMem;
   }
}
