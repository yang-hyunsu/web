<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<c:set var="path" 
	value="${pageContext.request.contextPath}"/>
<fmt:requestEncoding value="utf-8"/>
 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
   
    <script src = "https://code.jquery.com/jquery-3.7.0.js" type="text/javascript"></script>
    
    <script type="text/javascript">
    	// window.onload와 동일한 메서드
    	$(document).ready( function(){
    		
    		$("h2").text("jquery 로딩 성공")
    	});
    </script>      
    
    
</head>
<%--
# jsp에서 에러 처리
1. 웹개발 프로그래밍을 하면 에러가 발생할 수 있다.
	자바 프로그램에서는 이러한 에러가 발생되면 예외처리로 해당 에러에
	대한 내용의 원인을 출력해주고, 에러가 발생하더라도 프로세스가 
	멈추지 않게 한다.
2. 웹개발에서는 위 내용과 함께 jsp 화면에서 에러에 대하여 어떻게
	표현하고, 처리해주는 것까지 포함된다.
3. 에러처리의 방식
	1) 각 에러가 발생한 페이지별로 에러 처리 페이지 설정
	2) 웹서버 단위로 에러의 내용에 따라 에러 처리 페이지 설정.
		- web.xml에서 서버단위 에러 코드나 에러 객체를 선언하여
		대체되는 화면을 로딩하게 처리한다.
# 각 화면별 에러 처리 페이지 구현
1. 에러가 발생했을 때, 처리하는 페이지 설정
	<%@ page isErrorPage="true"%>
	위 옵션을 통해서 에러가 발생했을 때, 대체하는 페이지임을 명시하면
	exception 객체를 참조값에 의해 바로 사용할 수 있고,
	해당 객체의 메서드를 사용할 수 있다.
2. 에러가 발생할 가망성이 있는 페이지에 위 에러처리페이지 설정
	<%@ page errorPage = "위 만들어 둔 에러페이지 지정"%>
# 서버 단위로 에러 페이지 지정 구현
	

 --%>
<body>
    <div class="container mt-3">
    	<h2>사원정보 등록</h2>
	  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  		<div class="container-fluid">    	
	    	<form method="post"  class="d-flex align-items-center" >
	            <input type="text" class="form-control me-2" 
	      	     id="title" placeholder="직책명 입력" value="${param.title}" name="title"  aria-label="Search">
	            <input type="text" class="form-control me-2" 
	      	     id="min_sal1" placeholder="최소급여 시작"  
	      	     value="${empty param.min_sal1? 0: param.min_sal1}"  name="min_sal1"  aria-label="Search">
	      	    ~
	            <input type="text" class="form-control me-2" 
	      	     id="min_sal2" placeholder="최소급여 마지막" 
	      	      value="${empty param.min_sal2? 9999999: param.min_sal2}"  name="min_sal2"  aria-label="Search">
	      	     
	      	     
	         	<button type="submit" class="btn btn-primary" style="width:200px;">조회</button>
	     	</form>
	 	    </div>
	 	</nav>
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