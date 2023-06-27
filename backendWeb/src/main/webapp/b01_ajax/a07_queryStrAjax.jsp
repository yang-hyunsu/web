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
# ajax로 서버와 통신을 하면서 데이터를 가져오는 처리
1. ajax도 웹과 동일하게 query string으로 데이터를 요청값으로
	전송한다. get/post방식에 의해 전송
2. 서버에서는 요청된 값에 따라서 처리하여, 다시 데이터를 전송하고,
3. 전송해서 받을 데이터를 처리한다.
 --%>
<script type="text/javascript">
function getSyn(page){
	var xhr = new XMLHttpRequest();
	xhr.open("get",page,false);
	xhr.send()
	return xhr.responseText;
}
function callAjx(){
	var empnoVal = document.querySelector("#empno").value;
	var enameVal = document.querySelector("#ename").value;
	var page="z06_reqJson.jsp?empno="+empnoVal
			+"&ename="+enameVal
	var empObj = JSON.parse( getSyn(page) )
	var tdArr = document.querySelectorAll("tbody td")
	tdArr[0].innerText = empObj.empno
	tdArr[1].innerText = empObj.ename
	tdArr[2].innerText = empObj.sal
	tdArr[3].innerText = empObj.deptno
	
}
</script> 
<body>
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
         	<button type="button" onclick="callAjx()" class="btn btn-primary">등록</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>사원번호</th>
				    <th>사원명</th>
				    <th>급여</th>
				    <th>부서번호</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr  class="text-center">
			        <td>John</td>
			        <td>Doe</td>
			        <td>john@example.com</td>
			        <td>john@example.com</td>
			   	</tr>
		 	</tbody>
		</table>      	
    </div>
</body>
</html>