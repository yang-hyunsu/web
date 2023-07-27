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
    		search()  // 초기화면 로딩
    	});
    	function search(){
    		$.ajax({
    			url:"${path}/regData.do",
    			dataType:"json",
    			success:function(regList){
    				console.log(regList)
    				var add=""
    				// region_id=5&region_name
    				regList.forEach(function(reg){
    					add+="<tr>"
    					add+="<td>"+reg.region_id+"</td>"
    					add+="<td>"+reg.region_name+"</td>"
    					add+="</tr>"
    				})
    				$("#show").html(add)
    			}
    		})
    	}
    </script>      
    
    
</head>
<body>
    <div class="container mt-3">
    	<h2>지역정보 리스트</h2>
	  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  		<div class="container-fluid">    	
	    	<form method="post"  class="d-flex align-items-center" >
	            <input type="text" class="form-control me-2" 
	      	     id="region_name" placeholder="지역명 입력" 
	      	     name="region_name"  aria-label="Search">
	         	<button type="button" class="btn btn-primary" style="width:200px;">조회</button>
	     	</form>
	 	    </div>
	 	</nav>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>지역아이디</th>
				    <th>지역명</th>
		      	</tr>
		    </thead>
		    <tbody id="show">
			   	<tr  class="text-center">
			        <td>John</td>
			        <td>Doe</td>
			   	</tr>
		 	</tbody>
		</table>      	
    </div>
</body>
</html>