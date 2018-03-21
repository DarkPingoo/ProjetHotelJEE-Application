<%--
  Created by IntelliJ IDEA.
  User: trist & celine
  Date: 16/03/2018
  Time: 15:15
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Bienvenue sur la page d'accueil !</h1>

<h2>On vous propose</h2>
<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" src="/img/SuiteRoyale.jpg" alt="Suite Royale">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="/img/ChambreDAffaire.jpg" alt="Chambre d'Affaire">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="/img/ChambreFamiliale.jpg" alt="Chambre Familiale">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="/img/Taudis.jpg" alt="Taudis">
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