<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scores</title>
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
</head>
<body>

<div class="container" id="listOfArchersTableContainer">
  <div class="row" id="listOfArchersRow">
    <div class="col-lg-12">
		    <table  id='archersDataTable' class="ui celled table" style="width:100%">
		   <thead>
		    <tr>
		       <th>First Name</th>
		       <th>Last Name</th>
		       <!-- <th>Target Assignment<th>
		       <th>Running Score<th>
		       <th>End<th> --> 
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