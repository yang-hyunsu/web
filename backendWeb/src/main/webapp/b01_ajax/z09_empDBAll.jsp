<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="backendWeb.z01_vo.Emp"
	import="backendWeb.a01_dao.A04_PreparedDao"%>
<%
A04_PreparedDao dao = new A04_PreparedDao();
for (Emp e : dao.getEmpList()) {
%>
<tr class="text-center">
	<td><%=e.getEmpno()%></td>
	<td><%=e.getEname()%></td>
	<td><%=e.getJob()%></td>
	<td><%=e.getMgr()%></td>
	<td><%=e.getHiredate()%></td>
	<td><%=e.getSal()%></td>
	<td><%=e.getComm()%></td>
	<td><%=e.getDeptno()%></td>
</tr>
<%
}
%>
