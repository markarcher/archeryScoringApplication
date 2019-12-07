<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="/archeryScoringApplication/css/styles.css"> 
 
	<script type="text/javascript">
		
		function displayTable(){
			document.getElementById("archerTable").style.display = 'block';
			
		}
	</script>
<title>Add Archer</title>
</head>
<body>
<!-- <a href = "Archers">Add Archers </a><br>
<a href = "ListAllArchers">List All Archers</a> -->
<div id="header">
<h1>ARCHER DETAILS</h1>
</div>
<a href="Home">Home</a>
<br>

<form action="AddArcher" method = "get">
	<div id= "section">
	
		<p id = "archerRegistration"> 
			Last Name <input type = "text" name = "lastName">
		 	First Name <input type = "text" name = "firstName">
		 	Club <input type = "text" name = "club">
			eMail <input type = "text" name = "email">
	
		<input type = "submit" name = "submit" value = "submit" ></p>
	</div>
</form>
<p>${recentlyAdded}</p>
<p> ${archerRecentlyAdded.getLname()} ${archerRecentlyAdded.getFname()}</p>




</body>
</html>