<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="backendWeb.z01_vo.Member"
    import="backendWeb.a01_dao.A05_MemberDao"
    %>
<%
	A05_MemberDao dao = new A05_MemberDao();
 
	Member m = dao.login("himan", "7777");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인한 정보</h2>
	<h3>아이디:<%=m.getId() %></h3>
	<h3>이름:<%=m.getName() %></h3>
	<h3>권한:<%=m.getAuth() %></h3>
<%--
# dao를 불러와서 처리되는 내용
1. 전체 조회
2. 특정 단일 데이터 상세 확인(등록/수정/삭제)
3. combo형태의 데이터 처리(*)
	select
	checkbox
	radio 


	

 --%>

</body>
</html>