<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include page 2</title>
</head>
<body>
<h2>외부파일 2</h2>

<%
	String var2="외부 파일 2";
%>
<ul>
	<li>page 영역 : <%=pageContext.getAttribute("pageAttr") %></li>
	<li>request 영역 : <%=request.getAttribute("regAttr") %></li>
</ul>

</body>
</html>