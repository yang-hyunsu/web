<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
	a05_record.jsp?name=홍길동&kor=90&eng=80&math=70
	a05_record.jsp에서 이름, 국어, 영어, 수학 출력하고,
		총점:@@, 평균:@@ 처리 ..
	 --%>
	<h2>학생의 국어,영어,수학</h2>
	<form action="a05_record.jsp">
		이름:<input type="text" name="name"/><br>
		국어:<input type="text" name="kor"/><br>
		영어:<input type="text" name="eng" /><br>
		수학:<input type="text" name="math" /><br>
		<input type="submit"/>
	</form>
</body>
</html>