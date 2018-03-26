<%--
  Created by Eclipse.
  User: celine
  Date: 14/03/2018
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

  <div class="row justify-content-center ">
  
    <div class="box-container reservation bg-dark">
    <h2 class = "text-center">Formulaire de réservation</h2><br>
    
    <%--Formulaire reservation de chambre --%>
<form method="post" action="reservation">
	<input type="radio" name="sexe" value="Madame" /> Madame 
	<input type="radio"	name="sexe" value="Monsieur" /> Monsieur <br> <br>
	
		<label>Entrer votre identifiant </label><br>
		<div class="input-group mb-2 mr-sm-2">
    		<div class="input-group-prepend">
      		<div class="input-group-text"><i class="fa fa-user fa-fw" aria-hidden="true"></i></div>
		    </div>
		    <input type="text" name="idHotel" placeholder="Identifiant" class="form-control" 
		    data-inputmask="'mask': '9', 'repeat': '5', 'greedy' : 'false'" required=""/><br>
		  </div><br>
		<label>Entrer votre nom </label><br>
		<input type="text" name="nom" placeholder="Nom" class="form-control"/><br>
		<label>Entrer votre prénom </label><br>
		<input type="text" name="prenom" placeholder="Prénom" class="form-control"/><br>
		<label>Entrer votre numéro de téléphone </label><br>
		<div class="input-group mb-2 mr-sm-2">
    		<div class="input-group-prepend">
      		<div class="input-group-text"><i class="fa fa-phone fa-fw" aria-hidden="true"></i></div>
    </div>
    <input type="text" name="telephone" placeholder="Numéro de téléphone" class="form-control"
    data-inputmask="'mask': '02 02 02 02 02'"/><br>
  </div><br>
		
	
	Du <input type="date" name="dateArrivee" required/> 
	au <input type="date" name="dateDepart" required/><br><br>
	
	<label>Type de chambre </label><br>
	<select name = "chambre">
		<c:forEach items="${ chambreList }" var="chambre">
			<option><c:out value="${ chambre }" /></option>
		</c:forEach>
	</select>
	<br><br>
	<label>Nombre de personnes </label><br>
		<input type="text" name="nbPers" class="form-control" required=""
		data-inputmask="'mask': '9', 'repeat': '5', 'greedy' : 'false'"/><br>
	
	<div class = "col-sm-12 text-right">
	<button type="submit" name = "Envoyer" class="btn btn-light">Envoyer</button>
	</div>
	</form>
	<%--Fin de formulaire --%>
	
	
	</div>
	</div>



