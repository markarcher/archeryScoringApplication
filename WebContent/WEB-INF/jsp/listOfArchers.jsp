<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ListOfArchers</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 <!-- *********************************************************************** -->
  <!--Import jQuery before export.js-->
   <!--  <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script> -->
   <script type="text/javascript"  src=" https://code.jquery.com/jquery-3.3.1.js"></script>

    <!--Data Table-->
    <script type="text/javascript"  src=" https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript"  src=" https://cdn.datatables.net/buttons/1.2.4/js/dataTables.buttons.min.js"></script>

    <!--Export table buttons-->
    <script type="text/javascript"  src="https://cdnjs.cloudflare.com/ajax/libs/jszip/2.5.0/jszip.min.js"></script>
    <script type="text/javascript" src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.24/build/pdfmake.min.js" ></script>
    <script type="text/javascript"  src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.24/build/vfs_fonts.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/buttons/1.2.4/js/buttons.html5.min.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/buttons/1.2.1/js/buttons.print.min.js"></script>

<!--Export table button CSS-->

<link rel="stylesheet" href="https://cdn.datatables.net/1.10.13/css/jquery.dataTables.min.css">
<link rel="stylesheet" href="https://cdn.datatables.net/buttons/1.2.4/css/buttons.dataTables.min.css">
 <!-- for semantic ui  -->
 <script type="text/javascript" src="https://cdn.datatables.net/1.10.19/js/dataTables.semanticui.min.js"></script>
 <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.1/semantic.min.js"></script>
<link rel="stylesheet" href=" https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.1/semantic.min.css">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.semanticui.min.css">

<style type="text/css">
    <%@include file="css/dataTablesCss.css" %>
</style>
<style type="text/css">
	<%@include file="css/navBarCss.css"%>
</style>
</head>
<body>
<%-- 	 <div id = "tableSection"> j
	<Table BORDER="1" CELLSPACING="1" CELLPADDING="1" width="30%" id = "archerTable" >
		<tr><th>Archer Name</th><th>Club</th><th>eMail</th></tr>
			<c:forEach var="item" items="${archerList}"> 
 		<col width="100">
  		<col width="50">
 		<tr>
			<td>${item.getLname()}</td>
			<td>${item.getClub()}</td>
			<td>${item.getEmailAddress()}</td>
			
		</tr>
			</c:forEach>
 	</Table>
</div>  --%>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Archery Scoring App</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Home">Home</a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Target Assignment
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="ListOfArchers" name="seniorRecurve" id="seniorRecurve" value="TargetAssigment">Senior Recurve</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
      <li><a href="#">Page 2</a></li>
      <li><a href="#">Page 3</a></li>
    </ul>
  </div>
</nav>

<div class="container" id="listOfArchersTableContainer">
  <div class="row" id="listOfArchersRow">
    <div class="col-lg-12">
		    <table  id='archersDataTable' class="ui celled table" style="width:100%">
		   <thead>
		    <tr>
		       <th>First Name</th>
		       <th>Last Name</th>
		       <th>Club</th>
		    </tr>
		   </thead>
		   <tbody>  
		    <c:forEach items="${archerList}" var="archer">
			    <tr>
			    	<td>${archer.getFname()}</td>
			    	<td>${archer.getLname()}</td>
			    	<td>${archer.getClub()}</td>
			    </tr>
			</c:forEach>  
		   </tbody>
		   </table>
	  </div> 
    </div>
  </div>
</body>
<script type="text/javascript">
    <%@include file="js/my-demo-table-script.js" %>
</script>

</html>