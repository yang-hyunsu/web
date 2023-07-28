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
	<link rel="stylesheet" href="${path}/a00_com/bootstrap.min.css" >
	<link rel="stylesheet" href="${path}/a00_com/jquery-ui.css" >
	<style>
		td{text-align:center;}
	</style>
	<script src="${path}/a00_com/jquery.min.js"></script>
	<script src="${path}/a00_com/popper.min.js"></script>
	<script src="${path}/a00_com/bootstrap.min.js"></script>
	<script src="${path}/a00_com/jquery-ui.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
	<script src="https://developers.google.com/web/ilt/pwa/working-with-the-fetch-api" type="text/javascript"></script>

    <script type="text/javascript">
    	// window.onload와 동일한 메서드
    	$(document).ready( function(){
    		$("#detailBtn").hide()
    		search()
    		
    		//$("h2").text("jquery 로딩 성공")
    		$("#job_id, #job_title").keyup(function(){
    			search()

    		})
    		$("#schBtn").click(function(){
    			search()
    		})
    		$("#regBtn").click(function(){
    			$("#modalTitle").text("직책 등록")
    		})
    		
    		$("#jobRegBtn").click(function(){
    			if(confirm("직책정보를 등록하겠습니까?")){
    				//alert($("#frm").serialize())
    				// jobInsAjax2.do?job_id=ASS4&job_title=개발자4&min_salary=3500&max_salary=12000
    				$.ajax({
    					url:"${path}/jobInsAjax2.do",
    					type:"post",
    					data:$("#frm").serialize(),
    					dataType:"text",
    					success:function(data){
    						// 등록후 반영된 내용을 리스트하게
    						search();
    						// 폼에 있는 등록시 입력된 내용을 초기화할 때,
    						// 처리하는 form하위 요소객체 초기화
    						$("#frm")[0].reset();
    						if(!confirm(data.replace("\"", "")+"\n계속 등록하시겠습니까?")){
    							// 창을 닫게 처리 : 이벤트 강제 처리
    							$("#clsBtn").click();
    						}
    					},
    					error:function(err){
    						console.log(err)
    					}
    				})		
    						
    						
    			}
    		})
    		
    	});
    	function search(){
			//alert( $("form").serialize() )
			$.ajax({
				type:"post",
				url:"${path}/jobListData2.do",
				data:$("#schFrm").serialize(),
				dataType:"json",
				success:function(jobs){
					//console.log(jobs)
					//job_id   job_title  min_salary max_salary
					var add = ""
					jobs.forEach(function(job){
						console.log(job)
						add+="<tr  class='text-center' onclick='detail(\""+job.job_id+"\")' >"
						add+="<td>"+job.job_id+"</td>"
						add+="<td>"+job.job_title+"</td>"
						add+="<td>"+job.min_salary.toLocaleString()+"</td>"
						add+="<td>"+job.max_salary.toLocaleString()+"</td>"
						add+="</tr>"
					})
					console.log(add)
					$("#show").html(add);
				},
				error:function(err){
					console.log(err)
				}
			})    		
    		
    	}
    	function detail(job_id){
    		//alert(job_id)
    		$("#detailBtn").click()
    		$("#modalTitle").text("직책 상세정보("+job_id+")")
    	}
    	
    </script>      
    
    
</head>
<body>
<!-- 
	 	직책아이디  직책명      최소급여     최대급여

job_id job_title

jobListData2.do
 -->
    <div class="container mt-3">
    	<h2>직책 관리 리스트</h2>
    	
     	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  		<div class="container-fluid">    	
	    	<form method="post" id="schFrm"  class="d-flex align-items-center" >
	            <input type="text" class="form-control me-2" 
	      	     placeholder="직책아이디 입력" id="job_id" name="job_id"  aria-label="Search">
	            <input type="text" class="form-control me-2" 
	      	     placeholder="직책명 입력" id="job_title" name="job_title"  aria-label="Search">
	      	     
	         	<button id="schBtn" type="button" class="btn btn-primary" style="width:200px;">조회</button>
	         	<button id="regBtn" type="button" 
	         		class="btn btn-success" 
	         		data-toggle="modal" data-target="#exampleModalCenter"
	         		>등록</button>
	         	<button id="detailBtn" type="button" 
	         		class="btn btn-success" 
	         		data-toggle="modal" data-target="#exampleModalCenter"
	         		></button>
	         	<!-- 
	         	$("#detailBtn").hide()
	         	
	           	function detail(job_id){
    				alert(job_id)
    				$("#detailBtn").click()
    			}
	         	
	         	
	         	 -->	
	         		
	         	
	     	</form>
	 	    </div>
	 	</nav>
	 	<!-- 

	 	 -->
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>직책아이디</th>
				    <th>직책명</th>
				    <th>최소급여</th>
				    <th>최대급여</th>
		      	</tr>
		    </thead>
		    <tbody id="show">
			   	<tr  class="text-center" >
			        <td></td>
			        <td></td>
			        <td></td>
			        <td></td>
			   	</tr>
		 	</tbody>
		</table>      	
    </div>
<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="modalTitle">직책 등록</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
      	<!-- 
      	job_id=ASS4&job_title=개발자4&min_salary=3500&max_salary=12000
      	 -->
		<form  id="frm"   class="form"  method="post">
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
	     <div class="row">
	      <div class="col">
	        <input type="number" class="form-control" 
	        	placeholder="최소급여 입력" name="min_salary">
	      </div>
	      <div class="col">
	        <input type="number" class="form-control"
	        	 placeholder="최대급여 입력" name="max_salary">
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