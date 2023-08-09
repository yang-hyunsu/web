<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<fmt:requestEncoding value="utf-8" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Good day!!</title>
<link rel="stylesheet" href="${path}/a00_com/bootstrap.min.css">
<link rel="stylesheet" href="${path}/a00_com/jquery-ui.css">
<style type="text/css">
	.input-group-text{width:100%;background-color:linen;
		color:black;font-weight:bolder;}
	.input-group-prepend{width:20%;}
	#chatArea{
		width:80%;height:200px;overflow-y:auto;text-align:left;
		border:1px solid green;
	}
</style>
<script src="${path}/a00_com/jquery.min.js"></script>
<script src="${path}/a00_com/popper.min.js"></script>
<script src="${path}/a00_com/bootstrap.min.js"></script>
<script src="${path}/a00_com/jquery-ui.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script
	src="https://developers.google.com/web/ilt/pwa/working-with-the-fetch-api"
	type="text/javascript"></script>

<script type="text/javascript">
	$(document).ready(function() {

	});
</script>
</head>
<body>
	<div class="jumbotron text-center" style="padding: 35px 5px 10px 5px;">
		<h2>웹 소켙을 통한 채팅</h2>
	</div>
	<div class="container">
		<div class="input-group mb-3">	
			<div class="input-group-prepend ">
				<span class="input-group-text  justify-content-center">아이디</span>
			</div>
			<input type="text" id="id" class="form-control" 
				placeholder="접속할 아이디 입력"/>
			<input id="enterBtn" value="채팅방입장"  type="button" class="btn btn-info" />
			<input id="exitBtn" value="채팅방나가기"  type="button" class="btn btn-success" />
		</div>	
		<div class="input-group mb-3">	
			<div class="input-group-prepend ">
				<span class="input-group-text  justify-content-center">메시지</span>
			</div>
			<div id="chatArea" class="input-group-append">
				<div id="chatMessageArea"></div>
			</div>
		</div>	
					
		<div class="input-group mb-3">	
			<div class="input-group-prepend ">
				<span class="input-group-text  justify-content-center">메시지</span>
			</div>
			<input type="text" id="msg" class="form-control" 
				placeholder="전송할 메시지 입력"/>
			<input id="sndBtn" value="메시지전송"  type="button" class="btn btn-info" />
		</div>
			
		
	
	</div>

</body>
</html>