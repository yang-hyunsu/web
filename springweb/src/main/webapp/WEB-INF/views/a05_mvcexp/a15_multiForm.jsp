<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="utf-8"/>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Good day!!</title>

<link rel="stylesheet" href="${path}/a00_com/bootstrap.min.css" >
<link rel="stylesheet" href="${path}/a00_com/jquery-ui.css" >
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
<script src="https://developers.google.com/web/ilt/pwa/working-with-the-fetch-api" type="text/javascript"></script>

<script type="text/javascript">
	$(document).ready(function(){

	});
</script>
</head>
<body>
<div class="jumbotron text-center" style="padding: 35px 5px 10px 5px;">
	<h2 >다중 처리(1:다)</h2>
	
</div>
<div class="container">
	<form method="post" action="${path}/insertForm.do">
		<div class="input-group mb-3"  id="addDiv01">	
			<div class="input-group-prepend">
				<span class="input-group-text  justify-content-center">
					예약자</span>
			</div>
			<!-- 	//name, address
	// 	name, price, cnt -->
			<input type="text" name="pname" class="form-control" />
		</div>	
		<div class="input-group mb-3" >	
			<div class="input-group-prepend ">
				<span class="input-group-text  justify-content-center">
					주소</span>
			</div>
			<input  name="address" value="" 
				type="text" class="form-control" />
		</div>			
		<div id="addDiv">	

		</div>						
		<div style="text-align:right;">
			<input type="submit" class="btn btn-success" 
				value="예약정보등록" id="sendBtn"/>	
			<input type="button" class="btn btn-success" 
				value="추가" id="addBtn"/>						
		</div>	
	</form>	
	<script type="text/javascript">
	    var no=0;
	    $("#addDiv").append(addRoom(no))
		$("#addBtn").click(function(){
			//alert("추가..")
			$("#addDiv").append(addRoom(no++))
		})
		function addRoom(no){
			var addHTML='<div class="input-group mb-3>'
			addHTML+='<div class="input-group-prepend ">'
			addHTML+='<span class="input-group-text  justify-content-center">방정보'+(no+1)+'</span>'
			addHTML+='</div>'
			addHTML+='<input type="text" name="name" class="form-control" placeholder="방명" />'
			addHTML+='<input type="text" name="price" class="form-control"  placeholder="방가격" />'
			addHTML+='<input type="text" name="cnt" class="form-control"   placeholder="객수" /></div>'
			no++
			console.log(addHTML)
			return addHTML
		}
		
		/*
		 name="receiver01"  ==> 추가 하면 동일이름이 계속 추가되는 것..
		 class Mail{
			 private String[] receiver;
			 private List<String> receiver;
			 
		 }
		 
		 public String addMethod(@RequestParam("receiver01") String rev[])
		*/
	
	</script>
</div>    
</body>
</html>