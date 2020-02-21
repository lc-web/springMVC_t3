<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>航班信息查询</h1>
<form action="/springMVC_t2/c/flightInfo/list" method="post">
请输入航班号<input type="text" name="flightId">
<input type="submit" value="搜索航班">
</form>
</body>
</html>