<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" 
  href="${pageContext.request.contextPath}/resources/css/style.css">
<link type="text/css" rel="stylesheet" 
  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">

</head>
<body>

<div id="wrappper">
<div id="header">
 <h2>CRM - Customer Relationship Manager</h2>
</div>
</div>

<div id="container">

<h3>Save Customer</h3>
<form:form action="addCustomer" modelAttribute="customer" method="POST">
<table>
<tr><td><form:input type="hidden" path="id"/></td></tr>

<tr><td><label>First Name</label></td>
<td><form:input type="text" path="firstName"/></td></tr>

<tr><td><label>Last Name</label></td>
<td><form:input type="text" path="lastName"/></td></tr>

<tr><td><label>Email</label></td>
<td><form:input type="text" path="email"/></td></tr>

<tr><td><label>age</label></td>
<td><form:input type="text" path="age"/></td></tr>

<tr><td>
<div class="clear;both;">
<p><a href="${pageContext.request.contextPath}/customer/list">Back</a></p>
</div>
</td>
<td><input type="Submit" Value="Save" class="Save"></td></tr>


</table>
	
	
</form:form>

</div>
</body>
</html>