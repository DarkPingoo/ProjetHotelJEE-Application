<%--
  Created by IntelliJ IDEA.
  User: trist
  Date: 15/03/2018
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${ requestScope.titre_page }</title>

    <%-- Inclusion des librairies --%>
    <!-- Bootstrap CSS | FontAwesome |Style.css -->
    <link rel="stylesheet" href="<c:url value="/css/bootstrap.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/fontawesome-all.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/style.css"/>">
</head>
<body>

<div class="row">
    <%-- Navbar : Liste des pages accessibles --%>
    <div class="col-sm-12">
        <nav class="navbar navbar-expand-sm navbar-light bg-light">
            <a class="navbar-brand">HotelPremium</a>

            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item<c:if test="${requestScope.servletPath == '/accueil'}"> active</c:if>">
                        <a class="nav-link" href="<c:url value="/accueil"/>">
                            <i class="fa fa-home fa-fw" aria-hidden="true"></i>&nbsp;Accueil
                        </a>
                    </li>
                    <li class="nav-item<c:if test="${requestScope.servletPath == '/reservation'}"> active</c:if>">
                        <a class="nav-link" href="<c:url value="/reservation"/>">
                            <i class="fa fa-book fa-fw" aria-hidden="true"></i>&nbsp;Effectuer une réservation
                        </a>
                    </li>
                    <li class="nav-item<c:if test="${requestScope.servletPath == '/affichageReservation'}"> active</c:if>">
                        <a class="nav-link" href="<c:url value="/affichageReservation"/>">
                            <i class="fa fa-search fa-fw" aria-hidden="true"></i>&nbsp;Suivre une réservation</a>
                    </li>
                </ul>
            </div>
        </nav>
    </div>
</div>

<div class="row">
    <%-- Contenu de la page --%>
    <div class="col-sm-12" style="margin: 20px;">
        <jsp:include page="/WEB-INF/pages/${ requestScope.page_to_include}" />
    </div>

</div>


<%-- Inclusion des scripts --%>
<!-- Bootstrap & JQuery -->
<script type="application/javascript" src="<c:url value="/js/bootstrap.js"/>"></script>
<script type="application/javascript" src="<c:url value="/js/jquery.js"/>"></script>
</body>
</html>