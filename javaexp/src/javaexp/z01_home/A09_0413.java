package javaexp.z01_home;

public class A09_0413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
2023-04-13
[1단계:개념] 1. 링크시 상대위치 지정과 절대위치 지정 차이점을 기술하고, 
[1단계:개념] 2. 링크시 현재 파일을 기준으로 상위폴드와 하위폴드 이동 처리를 예제를 통해서 설명하세요.
[1단계:개념] 3. iframe의 속성을 예제를 통해서 설명하세요.
[1단계:확인] 4. 좋아하는 맛집 홈페이지를 맛집의 종류에 따라 링크되게 처리해보세요.
[1단계:개념] 5. target 속성값의 종류를 기술하세요.
[1단계:개념] 6. input select textarea의 차이점을 기술하세요.
[1단계:확인] 7. 기본 input 객체를 활용하여 아래와 같이 출력(form과 name 속성포함)하세요.
                   사람등록
		이름	[   ]
		나이	[   ]
		사는곳	[   ]
		    [등록]
[1단계:확인] 8. type으로 check와 radio의 차이점을 예제를 기술하세요
[1단계:확인] 9. 출근시간대(6:00,7:00,8:00,9:00와 퇴근시간대(17:00,18:00,19:00,20:00)를 단일 선택할 수 있게 처리하세요
[1단계:개념] 10. form하위에 form요소객체가 서버에 데이터를 전송하는 규칙을 기술하세요.
[1단계:개념] 11. select form태그에서 option에서 value의 설정이유에 대하여 기술하세요.
[1단계:확인] 12. 주로 사용하는 지역과 우편번호를 검색해서 select로 지역을 선택했을 때, 서버에 우편번호가 전송되게 처리하세요.
<!--  
      2023-04-13
[1단계:개념] 1. 링크시 상대위치 지정과 절대위치 지정 차이점을 기술하고,  
 
         상대적위치는 현재 폴드에 특정한 파일이 있을 때, 
          이동하여 해당화면을 확인할 수 있다.
          현재파일과 폴드를 기준으로 ../ 상위 폴드
          ./폴드명, 포들  하위 폴드        
         절대적위치는 웹서버 경로의 절대적 경로로 해당 자원의 페이지를 호출한다.
          - 웹서버가 기동해서 default 경로인 webapp 하위 경로 기준으로
          	/프로젝트명/ 접근 기준으로 이동 처리
          	/프로젝트명/하위폴드/이동할페이지..


[1단계:개념] 2. 링크시 현재 파일을 기준으로 상위폴드와 하위폴드 이동 처리를 예제를 통해서 설명하세요.
-->           
       <h2>상위폴드 이동처리</h2>
       <a href="../index2.html">상위폴드이동 </a>
       <h2>하위폴드 이동처리</h2>
       <a href="ex123/ex123.html">하위폴드이동</a>
       <h2>하위폴드 이동처리2</h2>
       <a href="./ex123/ex123.html">하위폴드이동</a>
       
<!--              
[1단계:개념] 3. iframe의 속성을 예제를 통해서 설명하세요. -->
         <h1>인라인프레임</h1>
         <iframe src="a01_basic.html" width="100" height="100"></iframe>
         <iframe srcdoc="<html><body><h3>srcodc속성</h3></body></html>" width="200" height="200"></iframe>
<!--           
         src: 포함되는 페이지를 속성값으로 설정
         srcdoc: html태그를 통해서 화면에 출력할 때 사용
         name: 각 프레임에 이름설정 
         
[1단계:확인] 4. 좋아하는 맛집 홈페이지를 맛집의 종류에 따라 링크되게 처리해보세요.  -->
           <h1>맛집 홈페이지</h1>
           <a href="http://sinjeon.co.kr/" target="mainFrame">분식집</a>
           <a href="http://www.kyochon.com/main/" target="mainFrame">치킨집</a>
           <a href="https://www.paris.co.kr/" target="mainFrame">빵집</a> 
           <a href="https://momstouch.co.kr/" target="mainFrame">햄버거가게</a>
           <iframe name="mainFrame" width="100%" height="200pt">
           </iframe>
<!--             
[1단계:개념] 5. target 속성값의 종류를 기술하세요.
           1. _blank: 기존 브라우저를 그대로 두고 다시 새로운 브라우저창을 로딩..
           2. _self: 현재 브라우저를 대체해서 새로운 화면을 로딩..
           3. _parent: 이 페이지를 호출하는 바로 위 부모 페이지를 변경 처리
           4. _top: 계층 구조상 최상위 페이지를 변경처리
           
           
[1단계:개념] 6. input select textarea의 차이점을 기술하세요.
           
           조회/입력기능: input, textarea(다중행의 문자열을 입력시)
           선택기능: select
           
[1단계:확인] 7. 기본 input 객체를 활용하여 아래와 같이 출력(form과 name 속성포함)하세요.
                   사람등록
      이름   [   ]
      나이   [   ]
      사는곳   [   ]
          [등록]
-->   
// myname=홍길동&age=25&area=서울
<form>
      <h3>사람등록</h3>
          이름:<input type="text" name="myname"/><br>
          나이:<input type="text" name="age"/><br>
          사는곳:<input type="text" name="area"/><br>
          <input type="submit" value="등록"/><br>
          form안에 submit type 버튼을 통해서 서버에 전송된다.
</form>
<!--[1단계:확인] 8. type으로 check와 radio의 차이점을 예제를 기술하세요-->
    radio는 선택된 단일 데이터만 전송 age=20~30
    <h4>나의 연령대</h4>
     <input type="radio" name="age" value="1~10"/>1~10
     <input type="radio" name="age" value="10~20"/>10~20
     <input type="radio" name="age" value="20~30"/>20~30
     <input type="radio" name="age" value="30~40"/>30~40
     <input type="radio" name="age" value="40~50"/>40~50 <br>
   checkbox hoby=음악듣기&hoby=책읽기 선택된 여러개를 전송
    <h4>나의 취미</h4>
     <input type="checkbox" name="hoby" value="음악듣기"/>음악듣기
     <input type="checkbox" name="hoby" value="책읽기"/>책읽기
     <input type="checkbox" name="hoby" value="골프"/>골프
     <input type="checkbox" name="hoby" value="수영"/>수영
     <input type="checkbox" name="hoby" value="영화감상"/>염화감상<br>
     
<!--[1단계:확인] 9. 출근시간대(6:00,7:00,8:00,9:00와 퇴근시간대(17:00,18:00,19:00,20:00)를 단일 선택할 수 있게 처리하세요-->
   <h4>출근시간대</h4>
     <input type="radio" name="time" value="6:00"/>6:00
     <input type="radio" name="time" value="7:00"/>7:00
     <input type="radio" name="time" value="8:00"/>8:00
     <input type="radio" name="time" value="9:00"/>9:00<br>
     
     <h4>퇴근시간대</h4>
     <input type="radio" name="time1" value="17:00"/>17:00
     <input type="radio" name="time2" value="18:00"/>18:00
     <input type="radio" name="time3" value="19:00"/>19:00
     <input type="radio" name="time4" value="20:00"/>20:00<br>
     
<!--[1단계:개념] 10. form하위에 form요소객체가 서버에 데이터를 전송하는 규칙을 기술하세요.
      <h1>물건구매</h1>
    <form action="서버의자원-java/jsp">
       구매할 물건명:<input type="text" name="pname"/><br>
       가격:<input type="number" name="price" value="0"/><br>
       갯수:<input type="number" name="cnt" value="0"/><br>
       <input type="submit" value="구매"/><br>
       <input type="reset" value="다시입력"/><br>
       
    </form>
     
     
     type이 submit버튼을 클릭시, form사이에 있는 요소객체를 
     name의 속성에 있는 값, 입력한 데이터 기준으로 key=value&key=value 형식으로 서버에 전송이 된다.
     pname=바나나&price=3000&cnt=2
     -->
     
     
<!--[1단계:개념] 11. select form태그에서 option에서 value의 설정이유에 대하여 기술하세요.
       option에 value속성이 있으면 항목별로 value의 값이 
       넘어 가고, value속성이 없으면 lable의 값이 value로 자동설정이 되어 전송된다.
-->   
<!--[1단계:확인] 12. 주로 사용하는 지역과 우편번호를 검색해서 select로 지역을 선택했을 때, 서버에 우편번호가 전송되게 처리하세요.-->
      <form>
      우편번호 검색:
      <select name="local">
            <option value="07293">서울</option>
            <option value="17098">경기</option>
            <option value="47873">부산</option>
            <option value="63566">제주도</option>
      </select>
      <input type="submit">
      </form>
   </body>
</html>
*/
	}

}
