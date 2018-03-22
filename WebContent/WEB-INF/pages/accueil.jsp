<%--
  Created by IntelliJ IDEA.
  User: trist & celine
  Date: 16/03/2018
  Time: 15:15
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1 class="text-center">Bienvenue à Hôtel Premium</h1><br>
<div class="container">
	<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
    	<div class="card bg-dark">
		  <div class="card-body">
		    <h5 class="card-title">La Suite Royale</h5>
		    <p class="card-text">Description</p>
		  </div>
		  <img class="d-block w-100 images_size card-img-bottom" src="img/SuiteRoyale.jpg" alt="First slide Card image cap">
		</div>
    </div>
    <div class="carousel-item">
	    <div class="card bg-dark">
		  <div class="card-body">
		    <h5 class="card-title">La Chambre d'Affaire</h5>
		    <p class="card-text">Description</p>
		  </div>
		  <img class="d-block w-100 images_size card-img-bottom" src="img/ChambreDAffaire.jpg" alt="Second slide Card image cap">
		</div>
    </div>
    <div class="carousel-item">
    	<div class="card bg-dark">
		  <div class="card-body">
		    <h5 class="card-title">La Chambre Familiale</h5>
		    <p class="card-text">Description</p>
		  </div>
		  <img class="d-block w-100 images_size card-img-bottom" src="img/ChambreFamiliale.jpg" alt="Third slide Card image cap">
		</div>
    </div>
    <div class="carousel-item">
    <div class="card bg-dark">
		  <div class="card-body">
		    <h5 class="card-title">Le taudis</h5>
		    <p class="card-text">Description</p>
		  </div>
		  <img class="d-block w-100 images_size card-img-bottom" src="img/Taudis.jpg" alt="Fourth slide Card image cap">
		</div>
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
</div>
