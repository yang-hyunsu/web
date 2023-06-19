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
<body>
    <div class="container mt-3">
    	<h2>등록 내역</h2>
		  <table class="table">
		    <thead class="table-success">
		      <tr>
		        <th>사원번호</th>
		        <th>사원명</th>
		        <th>직책번호</th>
		        <th>관리자번호</th>
		        <th>입사일(문자열)</th>
		        <th>급여</th>
		        <th>보너스</th>
		        <th>부서번호</th>
		      </tr>
		    </thead>
		    <tbody>
		      <tr>
		        <td><%=request.getParameter("empno") %></td>
		        <td><%=request.getParameter("ename") %></td>
		        <td><%=request.getParameter("job") %></td>
		        <td><%=request.getParameter("mgr") %></td>
		        <td><%=request.getParameter("hiredateS") %></td>
		        <td><%=request.getParameter("sal") %></td>
		        <td><%=request.getParameter("comm") %></td>
		        <td><%=request.getParameter("deptno") %></td>
		      </tr>
		    </tbody>
		  </table>


     </div>
</body>
</html>