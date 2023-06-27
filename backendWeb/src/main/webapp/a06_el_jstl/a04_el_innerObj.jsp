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
# EL에서 지원하는 내장 객체
1. el은 jsp의 여러 내장 객체를 지원한고 있다.
2. 사용법
	${내장객체.속성}
3. 기본 객체들
	1) scope관련 : pageScope, requestScope, sessionScope,
		applicationScope
		ex) pageContext.setAttribute("name","홍길동")
		${name} :위 4개중 하나의 범위 상관 없이 출력된다.
		${pageScope.name} :출력
		${requestScope.name} :출력 안됨.
		ex) session.setAttribute("fruit","사과")
		${fruit} :위 4개중 하나의 범위 상관 없이 출력된다.
		${pageScope.fruit} :출력 안됨
		${requestScope.fruit} :출력 안됨.		
		${sessionScope.fruit} :출력		
		
	2) pageConext : jsp의 page 기본 객체와 동일
	3) param : 요청 파라미터의 값을 <파라미터이름, 값>매핑을
		저장한 Map객체
		&name=홍길동 ==> ${param.name} 홍길동 가져온다.
	4) param.Values: 요청 파라미터의  <파라미터이름, 값배열>매핑을
		저장한 Map객체
		&price=3000&price=2000&price=1000
		${param.Values.price[0]}
		${param.Values.price[1]}
		${param.Values.price[2]}
	5) header : 요청 정의 <헤더이름,값>매핑을 저장한 Map객체
	6) headerValues : 요청 정보의 <헤더이름, 값 배열>매핑을
		저장한 Map객체
	7) cookie : 쿠키이름, Cookie 매핑을 저장한 Map객체
	8) initParam : 초기화 파라미터의 <이름,값>매핑을 저장한 Map객체
	?name=홍길동&price=3000&price=4000&price=5000		
 --%>
<body>
    <div class="container mt-3">
    	<h2>요청값 처리1</h2>
    	<h2>${param.name}</h2>
		<h2>요청값 처리2</h2>
    	<h2>${paramValues.price[0]}</h2>
    	<h2>${paramValues.price[1]}</h2>
    	<h2>${paramValues.price[2]}</h2>
    	<%-- 숫자형의 경우 자동 형변환되어 연산 처리되는 
    		것을 확인할 수 있다. --%>
    	<h2>${paramValues.price[0]+
    		  paramValues.price[1]+
    		  paramValues.price[2]
    		  }</h2>
   
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
				    <th>사원번호</th>
				    <th>사원명</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr  class="text-center">
			        <td>${param.empno }</td>
			        <td>${param.ename }</td>
			   	</tr>
		 	</tbody>
		</table> 
		<%--
		ex) 학생명 국어 영어 수학 점수를 form에 입력해서
		계산 클릭시, 아래에 점수와 총점과 평균을 el로 출력되게 하세요.
		
		 --%>
    	<form action="" method="post">
           	<div class="mb-3 mt-3">
            <label for="sname">학생명:</label>
            <input type="text" class="form-control" 
      	     id="sname" name="sname">
         	</div>  	
    	
         	<div class="mb-3 mt-3">
            <label>국어점수:</label>
            <input type="number" class="form-control" 
      	      	   name="point">
         	</div>
         	<div class="mb-3 mt-3">
            <label>영어점수:</label>
            <input type="number" class="form-control" 
      	      	   name="point">
         	</div>
         	<div class="mb-3 mt-3">
            <label>수학점수:</label>
            <input type="number" class="form-control" 
      	      	   name="point">
         	</div>
         	

         	<button type="submit" class="btn btn-primary">등록</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>학생명</th>
				    <th>국어</th>
				    <th>영어</th>
				    <th>수학</th>
				    <th>총점</th>
				    <th>평균</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr  class="text-center">
			        <td>${param.sname }</td>
			        <td>${paramValues.point[0] }</td>
			        <td>${paramValues.point[1] }</td>
			        <td>${paramValues.point[2] }</td>
			        <td>${	paramValues.point[0]+
			                paramValues.point[1]+
			        		paramValues.point[2] }</td>
			        <td>${
			        		(paramValues.point[0]+
			                paramValues.point[1]+
			        		paramValues.point[2])/3
			        
			        }</td>
			   	</tr>
		 	</tbody>
		</table> 		
		     	
    </div>
</body>
</html>