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
			<input type="radio" name="sexe" value="Madame" required="" <c:if test="${requestScope.sexe eq 'Madame'}">checked="checked"</c:if>/> Madame
			<input type="radio"	name="sexe" value="Monsieur" required="" <c:if test="${requestScope.sexe eq 'Monsieur'}">checked="checked"</c:if>/> Monsieur <br> <br>

			<label>Entrer votre identifiant </label><br>
			<div class="input-group mb-2 mr-sm-2">
				<div class="input-group-prepend">
					<div class="input-group-text"><i class="fa fa-user fa-fw" aria-hidden="true"></i></div>
				</div>
				<input type="text" name="idHotel" placeholder="Identifiant" class="form-control"
					   data-inputmask="'mask': '9', 'repeat': '5', 'greedy' : 'false'" required=""
					   value="${ requestScope.idHotel }"/><br>
			</div><br>
			<label>Entrer votre nom </label><br>
			<input type="text" name="nom" placeholder="Nom" class="form-control" required="" value="${ requestScope.nom }"/><br>
			<label>Entrer votre prénom </label><br>
			<input type="text" name="prenom" placeholder="Prénom" class="form-control" required="" value="${ requestScope.prenom }"/><br>
			<label>Entrer votre numéro de téléphone </label><br>
			<div class="input-group mb-2 mr-sm-2">
				<div class="input-group-prepend">
					<div class="input-group-text"><i class="fa fa-phone fa-fw" aria-hidden="true"></i></div>
				</div>
				<input type="text" name="telephone" placeholder="Numéro de téléphone" class="form-control"
					   data-inputmask="'mask': '99 99 99 99 99'" value="${ requestScope.telephone }"/><br>
			</div><br>


			Du <input type="date" name="dateArrivee" required="" value="${ requestScope.dateArrivee }"/>
			au <input type="date" name="dateDepart" required="" value="${ requestScope.dateDepart }"/><br><br>

			<label>Type de chambre </label><br>
			<select name = "chambre">
				<c:forEach items="${ chambreList }" var="chambre">
					<option><c:out value="${ chambre }" /></option>
				</c:forEach>
			</select>
			<br><br>
			<label>Nombre de personnes </label><br>
			<input type="text" name="nbPers" class="form-control" required=""
				   data-inputmask="'mask': '9', 'repeat': '5', 'greedy' : 'false'" value="${ requestScope.nbPers }"/><br>

			<div class="col-sm-12 no-padding">
				<label>Souhaitez-vous réserver une place de parking ? </label>
				<input type="radio" name="parking" value="oui" required="" <c:if test="${requestScope.parking eq 'oui'}">checked="checked"</c:if>/> Oui
				<input type="radio" name="parking" value="non" required="" <c:if test="${requestScope.parking eq 'non'}">checked="checked"</c:if>/> Non
			</div>

			<div class = "col-sm-12 text-right">
				<button type="submit" name = "Envoyer" class="btn btn-light">Envoyer</button>
			</div>
		</form>
		<%--Fin de formulaire --%>


	</div>
</div>



