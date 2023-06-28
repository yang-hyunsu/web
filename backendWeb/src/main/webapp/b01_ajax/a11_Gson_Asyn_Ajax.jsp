<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
</head>
<%--
# ajax front단 비동기옵션 처리와 Gson lib활용하여 json데이터 가져오기
1. front단 비동기 처리
		xhr.onreadyStatechange=function(){
			xhr.readyState : 서버와 통신을 단계별로 코드값을 가져온다.
				0: 객체를 만든다
				1,2: 서버에서 데이터를 받을 준디
				3:서버에서 데이터를 일부 받음
				4:서버에서 데이터를 모두 받은
			xhr.status : http응답 코드 200~299(정상적으로 받음)
				일반적으로 200으로 설정 안에서 정상적으로 다
				데이터가 있을 때, 처리한다.
				
			xhr.responseText를 이 핸들러 메서드 안에서
			비동기적으로 받은 데이터를 처리한다.	
		}
2. back단 Gson lib활용하기
	1) 화면을 dao의 객체 tr/td로 만들는데,
	2) json데이터로 만들어서 전송하는 경우가 일반적이다.
		Person				==> {"name":"홍길동",
		                          "age":25,"loc":"서울"}
			name/age/loc
	3) Gson lib은 이것을 자동으로 처리해주는 패키지 class이다.
	
# 처리 순서
1. 사용할 파일
	1) a11_Gson_Asyn_Ajax.jsp (프런트처리)	
	2) z11_memberCheck.jsp (백앤드처리)	
2. (백앤드처리) z11_memberCheck.jsp?id=himan
	1) 요청값 처리
		String id = request.getParameter("id");
	2) Dao,Vo, gson import
		com.google.gson.Gson
	3) Member m = dao.checkMember(id)
	4) if(m!=null)
		 <%=gson.toJson(m)%>
	   else
	   	  {"id":""}
3. (프런트처리)
	1) 화면 구현 
		id:[   ] [등록여부확인]==>클릭시 이벤트 핸들러
	2) 이벤트핸들러 함수
		function asynAjx(page){
			xhr.open("get",page,true)
			xhr.onreadystatechange=function(){
				if(xhr.status==200&&xhr.readyState==4){
					return xhr.responseText;
				}
			}
		}
		function checkMember(){
			var idVal = document.querySelector("#id")
			var memObj = JSON.parse(asynAjx(page+"?id="+idVal))
			if(memObj.id != ""){
				alert(memObj.id+"는 등록된 아이디입니다")
			}else{
				alert(idVal+"는 등록가능합니다.")
			}
		}		   	  	 			

 --%>


<body>
    <div class="container mt-3">
    	<h2>사원정보 등록</h2>
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
            <label for="empno">사원번호:</label>
            <input type="number" class="form-control" 
      	     id="empno" placeholder="사원번호 입력" name="empno">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="ename">사원명:</label>
            <input type="text" class="form-control" 
      	     id="ename" placeholder="사원명 입력" name="ename">
         	</div>
         	<button type="submit" class="btn btn-primary">등록</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>Firstname</th>
				    <th>Lastname</th>
				    <th>Email</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr  class="text-center">
			        <td>John</td>
			        <td>Doe</td>
			        <td>john@example.com</td>
			   	</tr>
		 	</tbody>
		</table>      	
    </div>
</body>
</html>