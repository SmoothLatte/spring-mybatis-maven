<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap.min.css"> 
<script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script> 
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<%-- <c:if test="${command.name == '李超'}">进入了if循环</c:if>
		<center><h2>书名：${command.name}, 作者：${command.author}</h2></center> --%>
		<table>
			<c:forEach var="book" items="${command}">
				<tr><td>${book.name}</td><td>${book.author}</td></tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>