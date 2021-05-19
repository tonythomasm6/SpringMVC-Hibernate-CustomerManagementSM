<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>
<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	<div id="container">
	
		<div id="content">
		<input type="Submit" Value="OPEN CRM" class="add-button"
		onclick="window.location.href='customer/list';return false;"/> 
<!-- <a href="customer/list">OPEN CRM</a> -->
</div>
</div>
</body>
</html>