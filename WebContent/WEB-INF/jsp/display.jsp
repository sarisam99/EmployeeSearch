<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mindtree IOT</title>
<script src="script/jquery-1.10.1.min.js"></script>

</head>
<body>
<H1>Details Posted by the devices</H1>

<table id="deviceDetails" border="1">
<tr>
	<th>Posted at</th>
	<th>Device ID</th>
	<th>Gateway ID</th>
	<th>Action</th>
	<th>location</th>
	<th>uptime</th>
	<th>comment</th>
</tr>

<c:forEach items="${deviceInfos}" var="deviceInfo">
<tr>
	<td><fmt:formatDate value="${deviceInfo.deviceTimeStamp }" pattern="dd-MM-yyyy hh:mm a"/> </td>
	<td>${deviceInfo.deviceUID }</td>
	<td>${deviceInfo.gatewayUID }</td>
	<td>${deviceInfo.deviceAction }</td>
	<td>${deviceInfo.deviceLocation }</td>
	<td>${deviceInfo.deviceUpTime }</td>
	<td>${deviceInfo.deviceActionComment }</td>
</tr>
</c:forEach>
</table>
<script type="text/javascript"></script>

</body>
</html>