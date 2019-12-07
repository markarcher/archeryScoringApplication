<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="/archeryScoringApplication/css/styles.css"> 
	<script type="text/javascript">
		
		function display(){
			document.getElementById("archerRegistration").style.display = 'block';
			
		}
		
		function displayArcher(){
			document.getElementById("addArcher").style.display = 'block';
			
		}
	</script>
<title>Home</title>
</head>
<body>
<!-- <a href = "Archers">Add Archers </a><br>
<a href = "ListAllArchers">List All Archers</a> -->
<div id="header">
<h1>ARCHER DETAILS</h1>
</div>
<!-- <button onclick = "display()">Add Archer</button> -->
<!-- <a href = "Home">Add Archers </a> 
 <a href = "ListOfArchers">List Of Archers </a>  -->
 <div class="wrapper">
	  <div class="menu">
	 	 <ul>
		  <li><a href="InputArcher">Add Archers</a></li>
		  <li><a href="ListOfArchers">List Of Archers</a></li>
		  <li><a href="InputScores">Scores</a></li>
		  <li><a href="#">Menu 3</a></li>
		</ul>
	  </div>	
 
<br> 
	 <div class ="footer">
	  <p>Contact information: <a href="mailto:markpjavier@yahoo.com">
	  markpjavier@yahoo.com</a>.</p>
	</div>
</div>
</body>
</html>