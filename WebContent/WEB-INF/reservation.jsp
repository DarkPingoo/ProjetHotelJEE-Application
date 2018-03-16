<%--
  Created by Eclipse.
  User: celine
  Date: 14/03/2018
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css"/>">
</head>
<body>
<form method = "get" action = "Reservation">
	<input type ="radio" name ="sexe" value = "Mademoiselle"/> Mademoiselle
	<input type ="radio" name ="sexe" value = "Madame"/> Madame
	<input type ="radio" name ="sexe" value = "Monsieur"/> Monsieur <br><br>
	Entrer votre nom : <input type ="text" name ="nom" /><br><br>
	Entrer votre prénom : <input type ="text" name = "prenom"/><br><br>
	Entrer votre numéro de téléphone : <input type ="text" name = "telephone"/><br><br>
	Du <input type = "date" name = "dateArrivee"/> au <input type = "date" name = "dateArrivee"/>
	
	

</body>

	<script type="application/javascript" src="<c:url value="/js/bootstrap.js"/>"></script>
	<script type="application/javascript" src="<c:url value="/js/jquery.js"/>"></script>
</html>