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