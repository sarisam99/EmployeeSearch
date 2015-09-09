<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Internet Of Thing</title>
<script src="js/jquery.1.9.1.min.js"></script>
<link href="<c:url value='/css/table.css'/>" rel="stylesheet"
	type="text/css" />
<link href="<c:url value='/css/style.css'/>" rel="stylesheet"
	type="text/css" />
</head>

<body>
	<div id="shadow">
		<div id="wrapper">
			<table align="center" width="95%;">
				<tr>
					<td style="background: #FFFFFF;"><img alt="Mindtree Logo"
						src="<c:url value='/images/Mindtree_Logo.png'/>"> <img
						alt="" src="<c:url value='/images/crisisManagement.png' />"
						style="float: right;"></td>
				</tr>
				<tr>


					<td colspan="2">

						<div class="header">
							<img alt="Mindtree Logo" src="<c:url value='/images/bar.png'/>"
								style="height: 35px; width: 100%;">

						</div>
					</td>
				</tr>

				<tr>

					<!-- main content goes here -->
					<td class="title_bar">
						<div style="background-color: white; height: 33px;">
							<b>Internet Of Thing For Device Management</b>
						</div>

						<div id="mainSection"
							style="background-color:; margin-top: 31px; height: 583px;">
							<table class="CSSTableGenerator">
								<tr>


									<th>Device ID</th>
									<th>Device TimeStamp</th>
									<th>Temperature</th>
									<th>Gateway ID</th>
									<th>Action</th>
									<th>location</th>
									<th>uptime</th>
									<th>comment</th>

							</tr>
								<c:forEach items="${deviceInfos}" var="deviceInfo">
									<tr>
										<%-- <td><fmt:formatDate
												value="${deviceInfo.deviceTimeStamp }"
												pattern="dd-MM-yyyy hh:mm a" /></td> --%>

										<td>${deviceInfo.deviceUID }</td>
										<td>${deviceInfo.deviceTimeStamp }</td>
										<td>${deviceInfo.temperature }</td>
										<td>${deviceInfo.gatewayUID }</td>
										<td>${deviceInfo.deviceAction }</td>
										<td>${deviceInfo.deviceLocation }</td>
										<td>${deviceInfo.deviceUpTime }</td>
										<td>${deviceInfo.deviceActionComment }</td>
									</tr>

								</c:forEach>
								<tr>
									<td>
										<div
											style="background-color: #333333; height: 42px; margin-top: 10px; text-align: center;">
											<p class="footerText">Copyright 2013 © Mindtree Ltd. All
												Rights Reserved.</p>
										</div>
									</td>
								</tr>
							</table>
						</div>
					</td>
				</tr>
				<!-- <tr>
					<td colspan="2" class="footer">
						<p class="footerText">Copyright 2013 © Mindtree Ltd. All
							Rights Reserved.</p>
					</td>
				</tr> -->

			</table>
		</div>


	</div>
</body>
</html>