package javaexp.z01_home;

public class A10_0417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			2023-04-17
			[1단계:조별확인] 1:1관계 개념을 옆에 있는 조원과 함께 이해 했는지 확인하고 의견을 나누고 정리해보세요.
				1) 1:1관계 객체를 선언하고 만드는 상황을 어떤 상황인지?
				2) 1:1관계 객체 처리할 수 있는지?
				3) 다른 객체 추가 메서드 this.객체 = 객체를 이해하고 있는지?
				4) if(참조==null) 코드는 언제 왜 사용하는지?
				5) 위 내용을 이해 기반으로 커플매칭 사이트에서 Woman/Man 처리해보세요.
			[1단계:개념] 1. 1:1 관계 객체 구현 순서를 예제를 통해 처리하세요.
			[1단계:개념] 2. 객체형 배열의 처리 과정을 기본 예제와 함께 설명하세요.
			[1단계:확인] 3. 아래의 2차원 데이터를 객체형 배열로 선언하고 출력하세요.
					1) 구매물건리스트(물건명,가격,구매갯수)
					2) 회원정보리스트(회원아이디, 패스워드, 회원명, 포인트, 권한)
			[1단계:개념] 4. select 콤보박스의 속성을 각 속성값에 따른 기능적 차이와 함께 기술하세요.
			[1단계:개념] 5. input의 속성에 따른 속성값을 차이를 기술하세요.
			[1단계:확인] 6. 아래 사이트의 회원가입화면을 form요소객체를 table 안에서 적절히 활용하여 처리하세요.(css적용 제외)
					https://www.storyum.kr/story/main/contents.do?menuNo=500018&siteId=5
					에 (기본정보입력 항목)에 맞게 처리하세요

//      2023-04-17
//      [1단계:조별확인] 1:1관계 개념을 옆에 있는 조원과 함께 이해 했는지 확인하고 의견을 나누고 정리해보세요.
//         1) 1:1관계 객체를 선언하고 만드는 상황을 어떤 상황인지?
         //객체 지향 프로그램에서 각 개체별로 관계를 구축하고, 필요에 따라 호출하여 새로운 처리과정에 포함하거나 출력한다. 
      
//         2) 1:1관계 객체 처리할 수 있는지?   
            //네
//         3) 다른 객체 추가 메서드 this.객체 = 객체를 이해하고 있는지?
            //this는 구분자로  this.전역벼수 = 지역변수로 전역변수에 값을 할당한다.. 
      
//         4) if(참조==null) 코드는 언제 왜 사용하는지?
 			 해당객체가 메모리로 할당되어 있는지를 확인해서,
 			 nullpointerexception 방지 목적도 있다.
             //출력하기 위해서..
//         5) 위 내용을 이해 기반으로 커플매칭 사이트에서 Woman/Man 처리해보세요.
/*           (Man 클래스)#############################################################
          package javaexp.a08_relation.vo;

            public class Man {
            private String name;
            private int age;
         
            
            public Man() {
               super();
               // TODO Auto-generated constructor stub
            }
            
            
            
            public Man(String name, int age) {
               this.name = name;
               this.age = age;
            }
            public String getName() {
               return name;
            }
            public void setName(String name) {
               this.name = name;
            }
            public int getAge() {
               return age;
            }
            public void setAge(int age) {
               this.age = age;
            }   
            public void showInf() {
               System.out.println("# 남성유저정보 #");
               System.out.println("이름:"+name);
               System.out.println("나이:"+age);
            }
            
         }
 **/
/*
   (Woman 클래스)########################################################################      
   package javaexp.a08_relation.vo;

public class Woman {

   private String name;
   private int age;
   public Woman() {
      super();
      // TODO Auto-generated constructor stub
   }
   public Woman(String name, int age) {
      this.name = name;
      this.age = age;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   
   public void showInf() {
      System.out.println("# 여성유저정보 #");
      System.out.println("이름:"+name);
      System.out.println("나이:"+age);
   }
}

 **/
/*
 Match클래스 
 package javaexp.a08_relation.vo;

public class Match {
   private String result;
   private Man mm;
   private Woman wm;
   private String siteName;
   public Match(String siteName, String s) {
      this.siteName = siteName;
      // 사이트 이름을 생성자를 통해서 설정..
   }  
   
   
   
   
   public Match(String result) {
      this.result = result;
   }




   public String getResult() {
      return result;
   }




   public void setResult(String result) {
      this.result = result;
   }




   public Man getMm() {
      return mm;
   }




   public void setMm(Man mm) {
      this.mm = mm;
   }




   public Woman getWm() {
      return wm;
   }




   public void setWm(Woman wm) {
      this.wm = wm;
   }




   public Match(String result, Man mm, Woman wm) {
      this.result = result;
      this.mm = mm;
      this.wm = wm;
   }




   public Match() {
      super();
      // TODO Auto-generated constructor stub
   }




   public void connecMan(Man mm) {
      this.mm = mm;
      mm.showInf();
      //
      System.out.println("남성 유저가 +siteName+"에 가입하였습니다.");
   }
   public void connecWoman(Woman wm) {
      this.wm = wm;
      wm.showInf();
       System.out.println("여성 유저가 +siteName+"에 가입하였습니다.");
   }
   
   public void showMatch() {
      if(mm==null) {
         System.out.println("남성유저가 준비가 되지 않았습니다..");
      }if(wm==null) {
         System.out.println("여성유저가 준비가 되지 않았습니다..");
      }if(mm!=null && wm!=null) {
         System.out.println(mm.getName()+"님과");
         System.out.println(wm.getName()+"님의");
         System.out.println("매칭을 시작합니다..");
         
      }
   }
}
 
 **/
/*            (메인)############################################################## 
             Man m1 = new Man("홍길동",40);
            Woman w1 = new Woman("김길순",30);
            Match mc1 = new Match("성공");
            
            mc1.connecMan(m1);
            mc1.connecWoman(w1);
            mc1.showMatch();
**/
      
//      [1단계:개념] 1. 1:1 관계 객체 구현 순서를 예제를 통해 처리하세요.
         /*
             1) 객체관계 구조결정: 자전거, 라이더
             2) 포함될 객체 클래스 선언: 
              class Bike: 필드- 브랜드, 종류, 가격
                        메서드- @@브랜드의 자전거로 라이딩하다.
                       정보출력: 브랜드:@@, 종류:@@, 가격@@
             public class Bike {
            private String company;
            private String kind;
            private int price;
            public Bike() {
               super();
               // TODO Auto-generated constructor stub
            }
            
            public Bike(String company, String kind, int price) {
               this.company = company;
               this.kind = kind;
               this.price = price;
            }
         
            public String getCompany() {
               return company;
            }
         
            public void setCompany(String company) {
               this.company = company;
            }
         
            public String getKind() {
               return kind;
            }
         
            public void setKind(String kind) {
               this.kind = kind;
            }
         
            public int getPrice() {
               return price;
            }
         
            public void setPrice(int price) {
               this.price = price;
            }
            
            public void ridingBike() {
               System.out.println(company+"자전거를 타다..");
            }
            
            public void showInf() {
               System.out.println("# 자전거 정보 #");
               System.out.println("브랜드:"+company);
               System.out.println("종류:"+kind);
               System.out.println("가격:"+price);
            }
             3) 포함될 객체를 호출 및 선언
             
             4) 기능 메서드 처리로해당 포함돌 객체 내용도 선언처리
             public class Rider {
            private String name;
            private Bike bk;
            public Rider() {
               super();
               // TODO Auto-generated constructor stub
            }
            // 고유속성 생성자 할당...
            public Rider(String name) {
               this.name = name;
            }
                        
            public Rider(String name, Bike bk) {
               super();
               this.name = name;
               this.bk = bk;
            }
            public String getName() {
               return name;
            }
            public void setName(String name) {
               this.name = name;
            }
            public Bike getBk() {
               return bk;
            }
            public void setBk(Bike bk) {
               this.bk = bk;
            }
            
            public void buyBike(Bike bk) {
               this.bk = bk;
               System.out.println(bk.getCompany()+"사 자전거");
               System.out.println(bk.getKind()+"타입을");
               System.out.println(bk.getPrice()+"원에 구매하다.");
            
            }
            public void playBike() {
               System.out.println(name+"자전거를 탑승하려고 합니다.");
               if(bk==null) {
                  System.out.println("구매하지 않아서 탑승이 불가능 합니다.");
               }else {
                  bk.ridingBike();
               }
            }
         }

                
                
             }
             5) main()
              Bike bk = new Bike("블랙스미스","철티비",3000);
      
             Rider rid = new Rider(); 
             rid.setName("고길동");
             Rider rid = new Rider("고길동"); 
             
                   
             rid.buyBike(bk);
             rid.playBike();
             
          **/
//      [1단계:개념] 2. 객체형 배열의 처리 과정을 기본 예제와 함께 설명하세요.
      /*
           배열의 크기 선언 후, 객체 생성
          타입[] 배열명  =  new 타입[크기];
          Fruit[] fru  = new Fruit[3];
           fru[0] = new Fruit("한라봉","제주도",20000);
           fru[1] = new Fruit("딸기","인천",30000);
           fru[2] = new Fruit("수박","강원도",50000);
      public class Fruit {
         private String fruName;
         private String orign;
         private int price;
         public String getFruName() {
            return fruName;
         }
         public void setFruName(String fruName) {
            this.fruName = fruName;
         }
         public String getOrign() {
            return orign;
         }
         public void setOrign(String orign) {
            this.orign = orign;
         }
         public int getPrice() {
            return price;
         }
         public void setPrice(int price) {
            this.price = price;
         }
         public Fruit(String fruName, String orign, int price) {
            super();
            this.fruName = fruName;
            this.orign = orign;
            this.price = price;
         }
         public Fruit() {
            super();
            // TODO Auto-generated constructor stub
         }
      }
      
       for(Fruit fr:fru) {
                    System.out.print(fr.getFruName()+"\t");
                    System.out.print(fr.getOrign()+"\t");
                    System.out.print(fr.getPrice()+"\n");
                 }
      
      
      
      **/
      
      
      
      
//      [1단계:확인] 3. 아래의 2차원 데이터를 객체형 배열로 선언하고 출력하세요.
//            1) 구매물건리스트(물건명,가격,구매갯수)
      /*
       OrderList[] ol  = new OrderList[3];
        ol[0] = new OrderList("청소기","300000",2);
        ol[1] = new OrderList("tv","1000000",1);
        ol[2] = new OrderList("선풍기","100000",4);
        
        
        public class OrderList {
         private String objName;
         private int price;
         private int cnt;
         public String getObjName() {
            return objName;
         }
         public void setObjName(String objName) {
            this.objName = objName;
         }
         public int getPrice() {
            return price;
         }
         public void setPrice(int price) {
            this.price = price;
         }
         public int getCnt() {
            return cnt;
         }
         public void setCnt(int cnt) {
            this.cnt = cnt;
         }
         public OrderList(String objName, int price, int cnt) {
            super();
            this.objName = objName;
            this.price = price;
            this.cnt = cnt;
         }
         public OrderList() {
            super();
      // TODO Auto-generated constructor stub
   }
}
        for(OrderList cnt:ol) {
                    System.out.print(cnt.getObjName()+"\t");
                    System.out.print(cnt.getPrice()+"\t");
                    System.out.print(cnt.getCnt()+"\n");
                 }
      **/
//            2) 회원정보리스트(회원아이디, 패스워드, 회원명, 포인트, 권한)
         /*
          LoginList[] log  = new LoginList[3];
           log[0] = new LoginList("himan","7777","홍길동",10000,"관리자");
           log[1] = new LoginList("higirl","9999","홍길순",1000,"유저");
           log[2] = new LoginList("star999","1234","마길동",0,"유저");
           
           public class LoginList {
            private String id;
            private String pass;
            private String name;
            private int point;
            private String auth;
            public String getId() {
               return id;
            }
            public void setId(String id) {
               this.id = id;
            }
            public String getPass() {
               return pass;
            }
            public void setPass(String pass) {
               this.pass = pass;
            }
            public String getName() {
               return name;
            }
            public void setName(String name) {
               this.name = name;
            }
            public int getPoint() {
               return point;
            }
            public void setPoint(int point) {
               this.point = point;
            }
            public String getAuth() {
               return auth;
            }
            public void setAuth(String auth) {
               this.auth = auth;
            }
            public LoginList(String id, String pass, String name, int point, String auth) {
               super();
               this.id = id;
               this.pass = pass;
               this.name = name;
               this.point = point;
               this.auth = auth;
            }
            public LoginList() {
               super();
               // TODO Auto-generated constructor stub
            }
         }
          for(LoginList cnt:log) {
                    System.out.print(cnt.getId()+"\t");
                    System.out.print(cnt.getPass()+"\t");
                    System.out.print(cnt.getName()+"\t");
                    System.out.print(cnt.getPoint()+"\t");
                    System.out.print(cnt.getAuth()+"\n");
                 }
         
           
          **/
      
//      [1단계:개념] 4. select 콤보박스의 속성을 각 속성값에 따른 기능적 차이와 함께 기술하세요.
        
//      name : 해당 name값을 기준으로 선택된 항목을 전송해준다
//            ex) name="com" = com=value값
//      size : 한번에 보일 선택 목록의 갯수를 지정할 수 있다.
         
//      multiple : ctrl 누른 상태에서 마우스 클릭으로 여러개를 선택할 때 사용된다.
//              이렇게 여러개 선택하면, 서버에도 배열데이터로 전송될 수 있다.

   
//   [1단계:개념] 5. input의 속성에 따른 속성값을 차이를 기술하세요.
         
//      name : 해당 name값을 기준으로 선택된 항목을 전송해준다
//         ex) name="com" = com=value값
//         
//         value : 초기값으로 설정하여 입력한 데이터를 지정할 때, 처리된다.
//          보통 이 값을 입력함으로 변경이 된다. 실제 서버에 전달되는 값이다.
//      
//      type="text|password|radio|file..."
//         text = 텍스트 입력가능, password = 입력란이 *****식으로 나옴
//         radio = 하나만 선택할 수 있는 라디오 박스가 생김
//         file = 파일을 서버에 전송할 수 있음
//      
//      size : 화면에 보이는 문자입력 크기 지정
//      
//      maxlength : 최대 입력할 수 있는 문자가 정해져있음
//         ex) maxlength="3"  ==> 3자리만 입력 가능
//      
//      placeholder : 실제로 저장된 문자는 아니지만 해설이나 설명을 하고싶을 때 사용
//         ex) 로그인 화면에 id, pass 워드를 구별하는 불투명한 문자들
         
//   [1단계:확인] 6. 아래 사이트의 회원가입화면을 form요소객체를 table 안에서 적절히 활용하여 처리하세요.(css적용 제외)
//         https://www.storyum.kr/story/main/contents.do?menuNo=500018&siteId=5
//         에 (기본정보입력 항목)에 맞게 처리하세요
//         <form >
//
//           <table >
//               <tr>
//                   <th>√ 이름</th>
//                   <td><input name="name" type="text" maxlength="5" ></td>
//                   
//               </tr>
//               
//               <tr>
//                   <th>√ 아이디</th>
//                   <td><input name="id" type="text" maxlength="16"><input type="button" value="√ 아이디중복확인"></td>
//               </tr>
//
//               <tr>
//               <th> </th>
//               <td>6~16까지 영문자(소문자), 숫자 사용 가능합니다. </td>
//               </tr>
//
//               <tr>
//                   <th>√ 비밀번호</th>
//                   <td><input type="password" maxlength="16"></td>
//               </tr>
//
//               <tr>
//               <th> </th>
//               <td>6~16까지 영문자(대소문자), 숫자 및 특수문자 사용 가능합니다.</td>
//               </tr>
//
//               <tr>
//               <th> </th>
//               <td>3자리 연속 또는 같은 문자, 아이디는 사용할 수 없습니다. </td>
//               </tr>
//
//               <tr>
//                   <th>√ 비밀번호 확인</th>
//                   <td><input type="password" maxlength="16"></td>
//               </tr>
//
//               <tr>
//                   <th>√ 이메일</th>
//                   <td><input type="text" maxlength="20">@<input type="text"><select><option>메일주소 선택</option></td>
//               </tr>
//
//               <tr>
//                   <th>√ 연락처</th>
//                   <td>휴대전화<input type="text" maxlength="9"></td>
//               </tr>
//               <tr>
//                   <th> </th>
//                   <td>일반전화<input type="text"maxlength="9"></td>
//               </tr>
//               <tr>
//                   <th> </th>
//                   <td>연락처는 둘중 하나만 입력해도 됩니다.</td>
//               </tr>
//
//               <tr>
//                   <th>√ 우편번호</th>
//                   <td><input type="text" maxlength="6"><input type="button" value="주소검색"></td>
//               </tr>
//
//               <tr>
//                   <th>√ 주소</th>
//                   <td><input type="text" maxlength="30" size="90"></td>
//               </tr>
//               <tr>
//                   <th> </th>
//                   <td><input type="text" maxlength="6"></td>
//               </tr>
//
//               <tr>
//                   <th>정보수신여부</th>
//                   <td>서비스 및 이벤트 소식을 <input type="checkbox">Email로 수신하겠 습니다.<input type="checkbox">SMS로 수신하겠습니다.</td>
//               </tr>
//           </table>
//
//       </form>   
		
	}

}
