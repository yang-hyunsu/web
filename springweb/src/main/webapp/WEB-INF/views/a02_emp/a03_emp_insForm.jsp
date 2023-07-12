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
    <style type="text/css">
    	.btn{width:200px;}
    </style>    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
   
    <script src = "https://code.jquery.com/jquery-3.7.0.js" type="text/javascript"></script>
    
    <script type="text/javascript">
    	// window.onload와 동일한 메서드
    	$(document).ready( function(){
    		
    		//$("h2").text("jquery 로딩 성공")
    	});
    </script>      
    
    
</head>
<body>
    <div class="container mt-3">
    	<h2>사원정보 등록</h2>
		<form method="post">
		  <div class="mb-3 mt-3">
		    <label for="email" class="form-label">Email:</label>
		    <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
		  </div>
		  <div class="mb-3">
		    <label for="pwd" class="form-label">Password:</label>
		    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
		  </div>
		  <div class="form-check mb-3">
		    <label class="form-check-label">
		      <input class="form-check-input" type="checkbox" name="remember"> Remember me
		    </label>
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
    </div>
</body>
</html>