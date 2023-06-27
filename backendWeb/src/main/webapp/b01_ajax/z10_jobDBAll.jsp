<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="backendWeb.z01_vo.Job"
	import="backendWeb.a01_dao.A04_PreparedDao"

	%>
<%
A04_PreparedDao dao = new A04_PreparedDao();
%>
<%for(Job job:dao.getJobs()){ %>
<tr class="text-center">
	<td><%=job.getJob_id() %></td>
	<td><%=job.getJob_title() %></td>
	<td><%=job.getMin_salary()%></td>
	<td><%=job.getMax_salary()%></td>
</tr>
<%} %>
</html>