<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
    <script src="https://code.jquery.com/jquery-3.7.0.js" type="text/javascript"></script>
    <script type="text/javascript">
    	// window.onload와 동일한 메서드
    	$(document).ready( function(){
    		// $("선택"). text : innerText와 동일..
    		$("h2").text("jquery 로딩 성공")
    		
    	});
    	// 10:05~
    </script>
    
    
    
</head>
<%--
# jstl
1. jsp standard tag library로 널리 사용되는 커스텀 태그를
	표준으로 만든 태그 라이브러리
2. jsp 프로그램을 사용하다보면 null, script(<%%>)코드의 복잡성,
   session scope처리 변수설정에 어려움이 있을 때가 많다.
   효과적인 프로그램을 위하여 위와 같은 기능과 반복문 조건문등 여러가지
   설정이 간편하게 처리되는 것이 필요로 한다.
3. 위와 같은 내용을 개선하여 jstl이라는 표준태그라이브러리를 활용하여
   보다 프로그램적으로 효과적으로 처리하는 부분이 필요하여 사용하게 되었다.
4. 주요 기능
    0) 환경 설정
    	WEB-INF\lib\jstl-1.2.jar
    	상단에 tag lib 선언..
    	<%@ taglib prefix="c" 
    		uri="http://java.sun.com/jsp/jstl/core"%>
    	<%@ taglib prefix="fmt" 
    		uri="http://java.sun.com/jsp/jstl/fmt"%>
    	
    
	1) scope와 함께 변수/객체 설정/변경/삭제
		<c:set var="변수명" value="값" 
			scope="page|request|session|application"/>
		<c:set var="변수명" value="${p01}"/>p01로 설정된 객체
		<c:set var="변수명" value="<%=new Person()%>"/>
	2) 조건문 처리
	   	<c:if test="${조건문}">
	   	</c:if>
		<c:choose>
		   <c:when test="${조건1}">
		   </c:when>
		   <c:when test="${조건2}">
		   </c:when>
		   <c:otherwise >
		   	   그외 조건 처리..
		   </c:otherwise>
		</c:choose>
	3) 반복문 처리
		<c:forEach var="변수" begin="시작값" end="끝" 
			step="증감단위">
		<c:forEach var="단위객체" items="배열/리스트">
		
		
			






 --%>
<body>
	<%-- 1. 기본변수 선언과 호출 --%>
	<


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