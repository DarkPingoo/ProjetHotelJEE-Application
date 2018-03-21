<%--
  Created by IntelliJ IDEA.
  User: trist
  Date: 16/03/2018
  Time: 14:19
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="text-center">
    <div class="row">
        <%-- Formulaire de recherche --%>
        <div class="col-sm-1"></div>
        <div class="col-sm-10">
            <div class="box box-danger">
                <div class="box-header with-border">
                    <i class="fa fa-times fa-fw text-danger" aria-hidden="true"></i>&nbsp;
                    <b>Annuler une réservation </b>

                </div>
                <div class="box-body text-justify" style="padding: 15px;">
                    Bienvenue sur la page d'annulation de réservation. Afin d'annuler votre réservation,
                    merci d'entrer son numéro ci-dessous.
                    <br />Sachez que si vous annulez votre réservation
                    <strong class="text-danger">moins d'un mois</strong> avant la date de début, une somme
                    correspondant à <strong class="text-danger">5% du prix total</strong> sera retenue.
                    ¯\_(ツ)_/¯

                    <form method="POST" action="<c:url value="/annulerReservation"/>">
                        <div class="input-group" style="margin-top: 20px">
                            <input type="text" class="form-control" id="idReservation" name="idReservation"
                                   placeholder="Identifiant réservation" required="" pattern="\d*">
                            <div class="input-group-append">
                                <button class="btn btn-danger" type="submit">
                                    <i class="fa fa-times fa-fw" aria-hidden="true"></i>&nbsp;
                                    Annuler la réservation
                                </button>
                            </div>
                        </div>
                    </form>

                </div>
            </div>
        </div>
        <div class="col-sm-1"></div>
    </div>
</div>