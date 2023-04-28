package javaexp.z01_home;

public class A17_0427 {
	/*
	2023-04-27
	[1단계:개념] 1. 배경이미지관련 속성을 예제와 함께 기술하세요.
	[1단계:개념] 2. display의 속성 3개 특징을 예제와 함께 기술하세요
	[1단계:개념] 3. 배경이미지관련 속성을 예제와 함께 기술하세요.
	[1단계:확인] 4. css 글자 그림자 처리 옵션을 지정하여, 화면에 이름, 나이, 사는 곳을 출력하세요.
	[1단계:개념] 5. position 옵션을 예제를 통해 기술하세요.
	[1단계:개념] 6. Object의 메서드의 기능을 기술하세요.
	[2단계:확인] 7. 물건명, 가격, 갯수를 필드로 하는 Product클래스를 생성하고 사용하되, 재정의하여 객체 생성 후, 참조 변수를 호출했을 때, 물건명/가격/갯수/총계를 출력할려면 처리해야 할 내용은?
	[1단계:개념] 8. String의 비교연산자의 비교와 equals()처리 형식의 차이점에 대하여 기술하세요
	[1단계:개념] 9. String 생성자의 주요 매개변수를 통한 처리 내용을 기술하세요
	[1단계:확인] 10. 임시비밀번호를 알파벳 대소문자 숫자를 조합해서 10자를 만드는 프로그램을 만드세요
	[2단계:확인] 11. charAt()를 활용하여, 우리나라에서 가장 많은 성 1~10, 가장 많이 사용하는 이름 중간자, 가장 많이 사용하는 마지막자를 조합하여 임의의 이름 3개를 출력하세요

	 * */
//  2023-04-27
//  [1단계:개념] 1. 배경이미지관련 속성을 예제와 함께 기술하세요.
  /*
          1) background-image : 배경이미지 지정
             ex) background-img:url("./media/person01.jpeg");
          2) background-position : 배경 이미지의 위치
             ex) background-position: center center;
                   - 상하 옵션 : top/center/bottom
                 - 좌우 옵션 : left/center/right
          3) background-repeat: 배경 이미지 반복 출력
             ex) background-repeat:   no-repeat;   반복 x
                               repeat;      반복 o   
                               repeat-x;   행 반복
                               repeat-y;   열 반복
   */
  
//  [1단계:개념] 2. display의 속성 3개 특징을 예제와 함께 기술하세요
  /*
   *    본래 태그가 가지고 있는 속성을 display의 세가지 속성을 통해 변경할 수 있다.
              1) block 
                ex) span{display:block; }      // inline -> block
             2) inline
                ex) div{display:inline; }      // block -> inline
             3) inline-block
                ex) span {display:inline-block; }   // inline -> inline-block
   */
  
//  [1단계:개념] 3. 배경이미지관련 속성을 예제와 함께 기술하세요.
  
//  [1단계:확인] 4. css 글자 그림자 처리 옵션을 지정하여, 화면에 이름, 나이, 사는 곳을 출력하세요.
        /*
            # style #
                div.red{text-shadow: 1px 1px 10px red;}
                div.blue{text-shadow: 1px 1px 10px blue;}
                div.yellow{text-shadow: 1px 1px 10px yellow;}
        
                div > h3{text-shadow: 1px 1px 10px rgb(193, 105, 228);}
                #id01{text-shadow: 1px 2px 7px rgb(126, 97, 231);}
                #id02{text-shadow: 1px 3px 4px rgb(58, 32, 150);}
                #id03{text-shadow: 1px 4px 2px rgb(47, 2, 207);}
           
           # body #
            <div>
                <h3>신상 정보</h3>
                <span id="id01">이름: 이은서</span><br>
                <span id="id02">나이: 25</span><br>
                <span id="id03">사는곳: 경기도</span>
            </div>
         */
//  [1단계:개념] 5. position 옵션을 예제를 통해 기술하세요.
     /*
             1) 기본 default 옵션
                  웹페이지에 태그가 나온 순서대로 처리가 된다. static옵션으로 지정.
              2) 기본 형식 및 속성에 따른 처리
                  선택자{position:속성값; top: 위로부터; left:왼쪽으로부터;}
                  
                  - relative: 상대배치 - 현재 위치를 기준으로 x/y축으로 이동된다.
                  - absolute: 절대 위치배치 - 왼쪽 상단 꼭지점을 기준으로 x/y 이동처리
                                       (top:0px; left:0px;) 
                                          - 오른쪽 하단 꼭지점을 기준으로 x/y 이동처리
                                            (bottom:0px; right:0px;)
                         div#div01{
                         	position:absolute;top:10px;left:20px;
                         }                   
                  - fixed: 고정 배치로 화면을 스크롤 상관없이 특정 위치를 고수하여 처리되는 것을 말한다.
      */
  
//  [1단계:개념] 6. Object의 메서드의 기능을 기술하세요.
  /*
             1) hashCode()   : 10진수로 고유 코드값을 가져온다.
             2) equals(Object obj)   : 객체가 같은지 비교
             3) clone()      : 현재 객체를 복사하여 같은 내용의 새로운 객체를 생성.
             4) toString()   : 객체를 문자열로 반환. 패키지이름.클래스이름@16진수
   */
  
//  [2단계:확인] 7. 물건명, 가격, 갯수를 필드로 하는 Product클래스를 생성하고 사용하되,
//           재정의하여 객체 생성 후, 참조 변수를 호출했을 때, 물건명/가격/갯수/총계를 출력할려면 처리해야 할 내용은?
        /*
             toString()함수의 return값이 물건명/가격/갯수/총계를 출력하도록 재정의해야한다.
         */
  public static void main(String[] args) {
     Product prd = new Product("감자", 2000, 10);
     System.out.println(prd);      // 출력 결과: 감자/2000/10/20000
     
     System.out.println();
  
//  [1단계:개념] 8. String의 비교연산자의 비교와 equals()처리 형식의 차이점에 대하여 기술하세요
  /*
          1) 비교연산자 ==
             stack영역의 데이터(주소값)를 비교한다.
                String prd1= "고구마";
              String prd2= "고구마";   
                 // prd1과 prd1을 비교연산자로 비교하면 같은 주소를 가리키기 때문에 true를 반환하지만
           String prd3= new String("고구마");
           String prd4= new String("고구마");
                 // prd1과 prd1을 비교연산자로 비교하면 각각 주소값을 갖고있기 때문에 때문에 false를 반환함.
           
          2) equals()
             문자열 데이터가 같은지 확인한다.
                prd1.equals(prd4);
                   // 두 개의 문자열을 비교하기 때문에 true를 반환한다.
   */   
//  [1단계:개념] 9. String 생성자의 주요 매개변수를 통한 처리 내용을 기술하세요
        /*
            new String()
           new String(byte[]) **
           new String(char[])
           new String("문자열") 
         */
     
//  [1단계:확인] 10. 임시비밀번호를 알파벳 대소문자 숫자를 조합해서 10자를 만드는 프로그램을 만드세요
     System.out.println("# 코드값 #");
     for(int cnt=0;cnt<=128;cnt++) {
    	 System.out.println(cnt+":"+((char)cnt));
     }
     char[] arr = new char[10];
     for(int idx=0; idx<arr.length; idx++) {
    	// 경우수 : 알파벳 26*2 ==> 52, 숫자 0~9 ==> 10
    	/*
        int ranNum = (int)(Math.random() * 69 + 48);   // ranNum 48~116
        if(ranNum>57 && ranNum<65) ranNum+=7;   // ranNum 57부터는, ranNum에 7을 더해 대문자가 나올 수 있게 함
        if(ranNum>90) ranNum+=6;
        arr[idx] = (char)ranNum;
        */
    	int ranNum = (int)(Math.random()*62+48);
    	if(ranNum>57) ranNum +=7; // 58~64 65가 A  
    	if(ranNum>90) ranNum +=6; // 91~96 97이 a  
    	arr[idx] = (char)ranNum;
     }
     
     
     String str1 = new String(arr);
     System.out.println("대/소문자/숫자 조합 10자리: " + str1);

     System.out.println();
     
//  [2단계:확인] 11. charAt()를 활용하여, 우리나라에서 가장 많은 성 1~10,
//           가장 많이 사용하는 이름 중간자, 가장 많이 사용하는 마지막자를 조합하여 임의의 이름 3개를 출력하세요
     String first = "김이박최정조강윤장임";
     String middle = "은재동민혜다석수소아";
     String last = "빈희영현원훈원윤영구";
     
     // first.charAt(0~9)
     // first.charAt(랜덤범위로 0~9) : 특정한 문자 하나가 랜덤 나온다.
     String []names = new String[3]; // 이름3개..
     for(int idx=0; idx<3; idx++) {
        int ran1 = (int)(Math.random()*first.length());
        int ran2 = (int)(Math.random()*middle.length());
        int ran3 = (int)(Math.random()*last.length());
        System.out.print("임의의 이름" + (idx+1) + ": ");
        char []name = new char[3];
        System.out.print(first.charAt(ran1));
        System.out.print(middle.charAt(ran2));
        System.out.println(last.charAt(ran3));
        name[0] = first.charAt(ran1);
        name[1] = middle.charAt(ran2);
        name[2] = last.charAt(ran3);
        names[idx] = new String(name); 
        // 이름 3개가 배열로 할당.
     }
     System.out.println("#임의의 이름 3개#");
     for(String name:names) {
    	 System.out.println(name);
     }
     
  }   
}
class Product{
  String pname;
  int price;
  int pCnt;

  public Product(String pname, int price, int pCnt) {
     this.pname = pname;
     this.price = price;
     this.pCnt = pCnt;
  }
  @Override
  public String toString() {
     int tot = price * pCnt;
     String str = pname +"/"+price+"/"+pCnt+"/"+tot ;
     return str;
  }
  
}