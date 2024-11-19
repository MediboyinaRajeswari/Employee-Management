<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ page import="webEmp.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>displayEmployee</title>
</head>
<body>
<%
List<Employee> l=(List<Employee>) request.getAttribute("emplist");
%><center><table border="1"><tr><td>ID</td><td> Name</td><td>Band</td></tr>

<%
for(Employee e:l)
{
%>
<tr>
<td><%=e.getId()%></td><td><%=e.getName()%></td><td><%=e.getBand()%></td></tr>
<%} %>
</table>
<a href ="Home">Home</a></center>
</body>
</html>