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
	<script type="text/javascript">
		function getSyn(page){
			var xhr = new XMLHttpRequest();
			xhr.open("get",page,false);
			xhr.send()
			return xhr.responseText;
		}   
		function callAjax(){
			var htmlCode = getSyn("z10_jobDBAll.jsp")
			console.log(htmlCode)
			var tbody= document.querySelector("tbody");
			tbody.innerHTML = htmlCode;
			
		}
	</script>    
</head>
<body>
    <div class="container mt-3">
    	<h2>직책정보 리스트</h2>
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
         	<button type="button" onclick="callAjax()" class="btn btn-primary">직책정보 로딩</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>직책아이디</th>
				    <th>직책명</th>
				    <th>최저급여</th>
				    <th>최고급여</th>
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