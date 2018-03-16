<%--
  Created by Eclipse.
  User: celine
  Date: 14/03/2018
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form method="get" action="Reservation">
	<input type="radio" name="sexe" value="Madame" /> Madame 
	<input type="radio"	name="sexe" value="Monsieur" /> Monsieur <br> <br>
	Entrer votre nom : <input type="text" name="nom" /><br> <br> 
	Entrer votre prénom : <input type="text" name="prenom" /><br> <br>
	Entrer votre numéro de téléphone : <input type="text" name="telephone" /><br><br> 
	Du <input type="date" name="dateArrivee" /> 
	au <input type="date" name="dateDepart" /><br><br>
	<select name = "chambre">
		<c:forEach items="${ chambreList }" var="chambre">
			<option><c:out value="${ chambre }" /></option>
		</c:forEach>
	</select>
	<br><br>
	<input type="submit" name="Envoyer" />
</form>
