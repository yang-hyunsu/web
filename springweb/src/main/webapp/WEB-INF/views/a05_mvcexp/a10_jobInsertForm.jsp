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
<div class="jumbotron text-center">
 	<h2 >직책 등록</h2>
</div>	
<div class="container">
	<form method="post">
	<div class="input-group mb-3">	
		<div class="input-group-prepend ">
			<span class="input-group-text  justify-content-center">직책아이디</span>
		</div>
		<input type="number" name="job_id" class="form-control" placeholder="번호입력"/>	
	</div>	
	<div class="input-group mb-3">	
		<div class="input-group-prepend ">
			<span class="input-group-text  justify-content-center">직책명</span>
		</div>
		<input type="text" name="job_title" class="form-control" value="" />	
	</div>	
	<div class="input-group mb-3">	
		<div class="input-group-prepend ">
			<span class="input-group-text  justify-content-center">최소급여</span>
		</div>
		<input type="number" name="min_salary" class="form-control" placeholder="숫자입력"/>	
	</div>	
	<div class="input-group mb-3">	
		<div class="input-group-prepend ">
			<span class="input-group-text  justify-content-center">최대급여</span>
		</div>
		<input type="number" name="max_salary" class="form-control" placeholder="숫자입력" />	
	</div>	
				
	<div style="text-align:right;">
		<input type="button" class="btn btn-success" value="등록" id="regBtn"/>
		<input type="button" class="btn btn-primary" value="조회리스트" id="mainBtn"/>		
	</div>	
	</form>		
</div>
<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">직책 등록</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
		<form  id="regFrm"   class="form"  method="post">
	     <div class="row">
	      <div class="col">
	        <input type="text" class="form-control" 
	        	placeholder="직책아이디 입력" name="job_id">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control"
	        	 placeholder="직책명 입력" name="job_title">
	      </div>
	     </div>
	    </form> 
      </div>
      <div class="modal-footer">
        <button type="button" id="clsBtn" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" id="jobRegBtn" class="btn btn-success">직책등록</button>
      </div>
    </div>
  </div>
</div>    
</body>
</html>