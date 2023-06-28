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
    code(키, 값, 상위키,정렬순위)
    1000  과일   0
    1001  사과   1000 1
    1002  바나나  1000 2
    1003  딸기   1000 3
    1004  오렌지  1000 4
    select *
    from code
    where 상위키 = 1000;
    order 정렬순위   
1. select(Combo box) 모듈 ajax로 list 및 등록 처리
	만들어 보기.
2. 처리순서
	1) DB 테이블 sql 구성
	2) Dao 생성
	3) 초기 list 화면 구성 : ajax처리(backend )
	4) 등록 click시 등록 화면 구성
	5) 클릭시, 상세화면 구성
		- 수정/삭제 처리..
	6) Combox Box 활용
		
# 진행 순서
0. 파일
	프런트(a13_ComBoAjax.jsp)
1. backend(z13_comboList.jsp)
	요청값 : title
	import 처리(dao,Gson,Code)
	Gson으로 json 데이터 로딩	
-------------------------------------		   
2. frontend(a13_ComBoAjax.jsp)    
    1) 화면구성
    	제목 [   ] [검색]
    2) 이벤트 처리
    3) 이벤트 핸들러 처리
    	- 검색 DOM
    	- ajax 처리
    	- 화면 리스트 처리..
 --%>
<script type="text/javascript">
	function schCode13(){
		if(event.keyCode==13){
			schCode();
		}
	}
	function schCode(){
		var titleOb = document.querySelector("#title")
		var xhr = new XMLHttpRequest()
		xhr.open("post","z13_comboList.jsp",true)
		xhr.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded")
		xhr.send("title="+titleOb.value)
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4&&xhr.status==200){
				var codeList = JSON.parse(xhr.responseText)
				var show=""
				codeList.forEach(function(code){
					show+="<tr class='text-center'>"
					show+="<td>"+code.no+"</td>"
					show+="<td>"+code.title+"</td>"
					show+="<td>"+code.refno+"</td>"
					show+="<td>"+code.ordno+"</td>"
					show+="</tr>"
				})
				var tBody = document.querySelector("tbody")
				tBody.innerHTML = show;
			}
		}
		
	}
</script>
<body>
    <div class="container mt-3">
    	<h2>Combox list</h2>
         	<div class="mb-3 mt-3">
            <label for="title">제목:</label>
            <input type="text" class="form-control" 
      	     id="title" onkeyup="schCode13()" placeholder="타이틀 입력" name="title">
         	</div>
         	<button onclick="schCode()" type="button" class="btn btn-primary">조회</button>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>번호</th>
				    <th>제목</th>
				    <th>상위번호</th>
				    <th>정렬</th>
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