package javaexp.z01_home;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class A20_0503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
2023-05-03
[1단계:개념] 1. set객체의 특징을 예제를 통하여 기술하세요
[1단계:확인] 2. 사과, 바나나, 딸기, 오렌지, 수박을 랜덤으로 10회 Set 주머니에 넣었을 때, 들어간 과일의 종류를 출력하세요.
[1단계:개념] 3. map객체의 특징을 기본 예제를 통하여 설명하세요
[1단계:확인] 4. map으로 회원의 정보를 저장할려고 한다. 저장하고 저장된 정보를 호출할 때, 동일한 id로 회원 정보를
      입력하고 변경되는 회원 정보를 처리해보세요.
[1단계:개념] 5. 입력처리하는 기본 객체와 출력 처리하는 기본 객체를 기본예제를 통해 설명하세요.
[1단계:확인] 6. c:\a01_javaexp\z01_fileExp\ 하위에 a1~a9폴드가 생성되고, 각 폴드에 show01.txt~show09.txt 파일을 생성해보세요.
[1단계:확인] 7. c:\a01_javaexp\z01_fileExp\a1\show01.txt에 입력받은 물건명/가격/갯수 정보를 저장하세요.
*/
//      2023-05-03
//      [1단계:개념] 1. set객체의 특징을 예제를 통하여 기술하세요
      /*
      set객체의 특징
      - 수학의 집합에 비유
      - 저장 순서가 유지되지 않음
      - 객체를 중복 저장 불가
      - 하나의 null만 저장 가능
//       */
//      Set<String> set = new HashSet<String>(); // 기본형식 Set<E> set = new HashSet<E>();
//      set.add("아이스아메리카노"); // 추가
//      set.add("아이스아메리카노");
//      set.add("아이스라떼");
//      set.add("핫라떼");
//      set.add("아이스초코");
//      set.add("아이스초코");
//      set.add("아이스초코");
//      System.out.println("#저장 된 set 데이터#");
//      for(String cafe:set) {
//         System.out.println(cafe);
//      }
////      ==> 아래 데이터가 나오는데 set객체의 특징을 살펴 볼 수 있다.
////      #저장 된 set 데이터#
////      핫라떼
////      아이스초코
////      아이스라떼
////      아이스아메리카노
//      
////      [1단계:확인] 2. 사과, 바나나, 딸기, 오렌지, 수박을 랜덤으로 10회 Set 주머니에 넣었을 때, 들어간 과일의 종류를 출력하세요.
      Set<String> fruits = new HashSet<String>();
      String[] fruit = {"사과", "바나나", "딸기", "오렌지", "수박"};
      Random r1 = new Random();
      for(int i=1;i<=10;i++) {
         String fRan = fruit[r1.nextInt(5)];
         fruits.add(fRan);
      }
      System.out.println("결과");
      for(String f:fruits) {
         System.out.println(f);
      }
      
////      [1단계:개념] 3. map객체의 특징을 기본 예제를 통하여 설명하세요
//      /*특징
//      - 키와 값으로 구성된 Map.Entry객체를 저장하는 구조
//      - 키와 값은 모두 객체
//      - 키는 중복될 수 없지만, 값을 중복 저장 가능
//          ex) 학번의 이름, 주민번호와 이름*/
//      Map<Integer, Personn> perMap = new HashMap<Integer, Personn>();
//      perMap.put(960902, new Personn("김민수",28));
//      perMap.put(980416, new Personn("김영수",26));
//      perMap.put(940128, new Personn("김철수",30));
//      perMap.put(971202, new Personn("김영희",27));
//      perMap.put(950506, new Personn("김수희",29));
//      for(int perId:perMap.keySet()) {
//         Personn p = perMap.get(perId);
//         System.out.println("주민번호 앞자리:"+perId);
//         System.out.println(p.getName()+" ");
//         System.out.println(p.getAge()+" ");
//      }
//      ✨[1단계:확인] 4. map으로 회원의 정보를 저장할려고 한다. 저장하고 저장된 정보를 호출할 때, 동일한 id로 회원 정보를
//            입력하고 변경되는 회원 정보를 처리해보세요.
/*
			1. 회원 정보 설정(아이디 제외)
			2. class 정의(회원정보 설정) Member
			3. Map<String, Member>
			4. 회원등록
				mem.put("himan", new Member("홍길동","관리자","7777"));
				mem.put("girlman", new Member("홍길동","관리자","7777"));
			5. 회원정보수정	: 마지막에 추가된 위에 선언된 key값..
				mem.put("himan", new Member("김길동","관리자","9999"));
 * */      
      	Map<String, Member> mems = new HashMap<String,Member>();
      	// 등록
      	mems.put("himan", new Member("홍길동",25,"관리자",1000));
      	mems.put("higirl", new Member("홍리나",27,"일반사용자",2000));
      	mems.put("goodMan", new Member("오길동",27,"관리자",4000));
      	// 수정
      	mems.put("himan", new Member("김길동",26,"관리자",3000));
      	// 삭제
      	mems.remove("higirl");
      	for(String id:mems.keySet()) {
      		Member m = mems.get(id);
      		System.out.print(id+"\t");
      		System.out.print(m.getName()+"\t");
      		System.out.print(m.getAuth()+"\t");
      		System.out.print(m.getPoint()+"\n");
      	}
      	
      
      
//      [1단계:개념] 5. 입력처리하는 기본 객체와 출력 처리하는 기본 객체를 기본예제를 통해 설명하세요.
//      System.out.println("##입력처리와 출력처리 기본예제##");
//      System.out.print("문자를 1개 입력하세요:");
//      InputStream is01 = System.in; // InputStream객체를 리턴하는 객체
//      try {
//         int data = is01.read(); // 문자를 byte형으로 입력 받는다. io가 발생하기에 컴파일 예외 처리
//         OutputStream os01 = System.out; // OutputStream객체를 리턴하는 객체
//         System.out.print("입력내용1:");
//         os01.write(data); // 코드값 출력
//         os01.flush(); // 임시 메모리 해제
//         char c01 = (char)data; // 형변환 처리
//         System.out.println("\n입력내용2:"+c01);
//         os01.close(); // 자원해제
//      } catch (IOException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      }
//      [1단계:확인] 6. c:\a01_javaexp\z01_fileExp\ 하위에 a1~a9폴드가 생성되고, 각 폴드에 show01.txt~show09.txt 파일을 생성해보세요.
      String path1 = "c:\\a01_javaexp\\z01_fileExp\\";
      File pat = new File(path1); pat.mkdir();
      for(int cnt=1;cnt<=9;cnt++) {
         File f = new File(path1+"a"+cnt);
         f.mkdir(); // 디렉토리 생성
         for(int i=1;i<=9;i++) {
            File fi = new File(path1+"a"+cnt+"\\show0"+i+".txt");
            try {
               fi.createNewFile(); // 파일 생성
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            
         }
      }
      
//      [1단계:확인] 7. c:\a01_javaexp\z01_fileExp\a1\show01.txt에 입력받은 물건명/가격/갯수 정보를 저장하세요.
      String path = "c:\\a01_javaexp\\z01_fileExp\\a1\\";
      Writer fout=null;
      try {
    	 fout = new FileWriter(path+"show01.txt");
         Scanner sc = new Scanner(System.in);
         System.out.print("물건명 입력 : ");
         String name = sc.nextLine();
         System.out.print("가격 입력 : ");
         int price = sc.nextInt();
         System.out.print("갯수 입력 : ");
         int cnt = sc.nextInt();
         fout.write("물건명\t가격\t갯수");
         fout.append("\n"+name+"\t"+price+"\t"+cnt);
         fout.flush();
         System.out.println("입력이 완료 되었습니다.");
      }catch(IOException e) {
         e.printStackTrace();
      }finally{
         try {
            fout.close();
         }catch(IOException e) {
            e.printStackTrace();
         }
      }
      
      
   }
}
class Member{
	private String name;
	private int age;
	private String auth;
	private int point;
	public Member(String name, int age, String auth, int point) {
		this.name = name;
		this.age = age;
		this.auth = auth;
		this.point = point;
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
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}


class Personn{
   private String name;
   private int age;
   public Personn() {
      // TODO Auto-generated constructor stub
   }
   public Personn(String name, int age) {
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
   
}