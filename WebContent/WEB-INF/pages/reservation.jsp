<%--
  Created by Eclipse.
  User: celine
  Date: 14/03/2018
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

  <div class="row justify-content-center">
    <div class="col-5">
<form method="get" action="reservation">
	<input type="radio" name="sexe" value="Madame" /> Madame 
	<input type="radio"	name="sexe" value="Monsieur" /> Monsieur <br> <br>
	
		<label>Enter votre nom </label><br>
		<input type="text" name="nom" /><br>
		<label>Enter votre prénom </label><br>
		<input type="text" name="prenom" /><br>
		<label>Enter votre numéro de téléphone </label><br>
		<input type="text" name="telephone" /><br>
	
	Du <input type="date" name="dateArrivee" /> 
	au <input type="date" name="dateDepart" /><br><br>
	
	<label>Type de chambre </label><br>
	<select name = "chambre">
		<c:forEach items="${ chambreList }" var="chambre">
			<option><c:out value="${ chambre }" /></option>
		</c:forEach>
	</select>
	<br><br>
	<button type="submit" name = "Envoyer" class="btn btn-primary">Envoyer</button>
	</form>
	</div>
	</div>



