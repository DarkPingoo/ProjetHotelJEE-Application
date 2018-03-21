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
    <title><c:out value="${requestScope.titre_page}" /></title>

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
        <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
            <a class="navbar-brand text-warning">HotelPremium</a>

            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item<c:if test="${requestScope.servletPath == '/accueil'}"> active</c:if>">
                        <a class="nav-link" href="<c:url value="/accueil"/>">
                            <i class="fa fa-home fa-fw" aria-hidden="true"></i>&nbsp;Accueil
                        </a>
                    </li>
                    <li class="nav-item<c:if test="${requestScope.servletPath == '/reservation'}"> active</c:if>">
                        <a class="nav-link" href="<c:url value="/reservation"/>">
                            <i class="fa fa-star fa-fw" aria-hidden="true"></i>&nbsp;Effectuer une réservation
                        </a>
                    </li>
                    <li class="nav-item<c:if test="${requestScope.servletPath == '/gererReservation'}"> active</c:if>">
                        <a class="nav-link" href="<c:url value="/gererReservation"/>">
                            <i class="fa fa-book fa-fw" aria-hidden="true"></i>&nbsp;Gérer une réservation</a>
                    </li>
                </ul>
            </div>
        </nav>
    </div>
</div>

<div class="row" style="margin: 20px;">
    <%-- Callback : message de retour --%>
    <c:if test="${ not empty requestScope.callbackMessage }">
        <div class="col-sm-1"></div>
        <div class="col-sm-10">
            <div class="alert alert-${ requestScope.callbackType } alert-dismissible fade show" role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <stong>
                    <i class="fa fa-${ requestScope.callbackIcon } fa-fw text-${ requestScope.callbackType }" aria-hidden="true"></i>&nbsp;
                </stong>
                ${ requestScope.callbackMessage }
            </div>
        </div>
        <div class="col-sm-1"></div>
    </c:if>

    <%-- Contenu de la page --%>
    <div class="col-sm-12" style="margin-top: 20px;">
        <jsp:include page="/WEB-INF/pages/${ requestScope.page_to_include}" />
    </div>

</div>


<%-- Inclusion des scripts --%>
<!-- Bootstrap & JQuery -->
<script type="application/javascript" src="<c:url value="/js/jquery.js"/>"></script>
<script type="application/javascript" src="<c:url value="/js/bootstrap.js"/>"></script>
<script type="application/javascript" src="<c:url value="/js/script.js"/>"></script>
</body>
</html>