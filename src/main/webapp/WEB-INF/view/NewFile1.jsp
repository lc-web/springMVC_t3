<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>查询结果</h1>

<a>${user.flightId }次航班结果</a>
<table border="1" width="500">
		<thead>
			<tr>
				<th>航空公司</th>
				<th>出发机场</th>
				<th>到达机场</th>
				<th>出发时间</th>
				<th>到达时间</th>
				<th>机型</th>
			</tr>
		</thead>
		<tbody>
			
				<tr>
					<td>${user.company }</td>
					<td>${user.leaveAirport }</td>
					<td>${user.arriveAirport}</td>
					<td>${user.leaveTime}</td>
					<td>${user.arriveTime}</td>
					<td>${user.airplane}</td>
				</tr>
			</tbody>
			</table>
</body>
</html>