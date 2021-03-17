<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

table {
  background-color: green;
  border-collapse: collapse;
  width: 50%;
}
th, td {
  padding: 10px;
  border-collapse: collapse;
  }
  th {
  background-color: black;
  color: beige;
  }
  a{
  text-decoration:none;
  }
</style>
</head>
<body>
<br />
<br />
<br />
<form action = "addFuelServlet" method="post">

</tr>
<c:forEach items ="${requestScope.allCars}" var="newCars">
<tr>

<table align="center">
<tr>
	<th colspan="2">Edit Fuel Information</th>
</tr>
<tr>
<td align="right"> Serial number: </td> 
<td></td>
</tr>
<tr>
<td align="right">Octane </td> 
<td></td>
</tr>
<tr>
<td align="right">LB </td> 
<td></td>
</tr>
<tr> 
<td></td>
<td><input type = "submit" value="Add fuel info"></td>
</tr>
</table>
</form> 
<br />
<br />
<center>
<a href = "viewAllFue;Servlet">View Fuel Info</a>
</center>
</body>
</html>