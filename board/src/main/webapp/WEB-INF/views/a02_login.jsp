<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="utf-8"/>     
<!DOCTYPE html>
<%--


 --%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${path}/a00_com/bootstrap.min.css" >
<link rel="stylesheet" href="${path}/a00_com/jquery-ui.css" >

  <style>
    body {
      min-height: 100vh;

      background: -webkit-gradient(linear, left bottom, right top, from(#92b5db), to(#1d466c));
      background: -webkit-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
      background: -moz-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
      background: -o-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
      background: linear-gradient(to top right, #92b5db 0%, #1d466c 100%);
    }

    .input-form {
      max-width: 680px;

      margin-top: 80px;
      padding: 32px;

      background: #fff;
      -webkit-border-radius: 10px;
      -moz-border-radius: 10px;
      border-radius: 10px;
      -webkit-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);
      -moz-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);
      box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15)
    }
  </style>
<script src="${path}/a00_com/jquery.min.js"></script>
<script src="${path}/a00_com/popper.min.js"></script>
<script src="${path}/a00_com/bootstrap.min.js"></script>
<script src="${path}/a00_com/jquery-ui.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://developers.google.com/web/ilt/pwa/working-with-the-fetch-api" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function(){
		<%-- 
		
		--%>
		var loginErrorMessage = "${loginErrorMessage}"
		if(loginErrorMessage!=""){
			alert(loginErrorMessage)
		}
		
	});
</script>
</head>

<body>
<div class="input-form-backgroud row">
    <div class="input-form col-md-12 mx-auto">
        <h4 class="mb-3">로그인</h4>
        <form method="post" action="/member/login/login" class="validation-form" novalidate>
            <div class="mb-3">
                <label for="username">아이디</label>
                <input name="username" type="text" class="form-control" id="username" placeholder="아이디 입력" required>
                <div class="invalid-feedback">
                    아이디를 입력해주세요.
                </div>
            </div>
            <div class="mb-3">
                <label for="password">패스워드</label>
                <input name="password" type="password" class="form-control" id="password" placeholder="패스워드 입력" required>
                <div class="invalid-feedback">
                    패스워드를 입력해주세요.
                </div>
            </div>    
            <div class="mb-3 form-check">
                <input type="checkbox" name="remember-me" id="rememberMe" class="form-check-input">
                <label class="form-check-label" for="rememberMe">자동로그인</label>
            </div>                  
            <div class="mb-4"></div>
            <button id="loginBtn" class="btn btn-primary btn-lg btn-block" type="submit">로그인</button>
        </form>
    </div>
</div>       	
 
</body>      