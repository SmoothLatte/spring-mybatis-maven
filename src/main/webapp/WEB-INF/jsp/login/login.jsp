<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<body>
	<h2>Add Book</h2>
	<form method="post"
		action="<%=request.getContextPath() %>/book/add">
		bookname:<input type="text" name="name" id="name"> author:<input
			type="text" name="author" id="author"> <input type="submit"
			value="Add">
	</form>
</body>
</html>

