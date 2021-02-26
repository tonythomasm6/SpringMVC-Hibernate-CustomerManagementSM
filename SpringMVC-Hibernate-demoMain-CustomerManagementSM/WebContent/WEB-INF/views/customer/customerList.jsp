<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>
<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
		  <!--  ${pageContext.request.contextPath} returns the app name-->
</head>
<body>
<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
		<input type="Submit" Value="Add Customer" class="add-button"
		onclick="window.location.href='addCustomer';return false;"/> 
		
		
<table>
<tr>
<th>ID</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Age</th>
<th></th>
<th></th>
</tr>

<c:forEach var="customer" items="${customers}">

<c:url var="updateLink" value="/customer/updateCustomer">
	<c:param name="customerId" value="${customer.id }"/>
</c:url>
<tr>
<td>${customer.id}</td>
<td>${customer.firstName}</td>
<td>${customer.lastName}</td>
<td>${customer.email}</td>
<td>${customer.age}</td>
<td><a href="${updateLink }">Update</a></td>

<td>
<a href="${pageContext.request.contextPath}/customer/deleteCustomer?customerId=${customer.id}"
onclick="if(!(confirm('Are you sure you want to delete?'))) return false">
Delete</a></td>

</tr>
</c:forEach>


</table>

</div></div>
</body>
</html>