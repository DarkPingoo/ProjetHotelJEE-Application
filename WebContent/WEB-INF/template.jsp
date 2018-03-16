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
    <title>${ applicationScope.titre_page }</title>

    <%-- Inclusion des librairies --%>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css"/>">
</head>
<body>

<div class="row">
    <%-- Navbar : Liste des pages accessibles --%>
    <div class="col-sm-12">
        <nav class="navbar navbar-expand-sm navbar-light bg-light">
            <a class="navbar-brand">HotelPremium</a>

            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Features</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Pricing</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Disabled</a>
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