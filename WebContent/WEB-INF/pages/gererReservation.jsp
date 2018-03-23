<%--
  Created by IntelliJ IDEA.
  User: trist
  Date: 16/03/2018
  Time: 14:19
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="text-center">

    <%-- Formulaire de paiement de réservation --%>
    <div class="row justify-content-center">
        <div class="box-container">
            <div class="box box-warning">
                <div class="box-header with-border">
                    <i class="fa fa-credit-card fa-fw text-warning" aria-hidden="true"></i>&nbsp;
                    <b>Régler une réservation</b>

                </div>
                <div class="box-body text-justify" style="padding: 15px;">
                    <p>
                        Bienvenue sur le module de paiement du paiement d'une réservation.
                        Afin de régler le montant total de votre réservation, merci d'entrer son numéro ci-dessous.
                        Ensuite, complétez vos informations bancaires.
                    </p>

                    <%-- Formulaire de paiement --%>
                    <form method="POST" action="<c:url value="/etatReservation"/>">
                        <%-- Coordonnées bancaires --%>
                        <div class="row">

                            <%-- Numéro de carte --%>
                            <div class="col-sm-6">
                                <div class="form-group">
                                    <label for="idCard"><strong>Numéro de carte</strong></label>
                                    <div class="input-group">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text">
                                                 <i class="fa fa-credit-card fa-fw" aria-hidden="true"></i>&nbsp;
                                            </span>
                                        </div>
                                        <input type="text" class="form-control" id="idCard" name="idCard"
                                               placeholder="Numéro de carte" required=""
                                               data-inputmask="'mask': '9999 9999 9999 9999'">
                                    </div>
                                </div>
                            </div>

                            <%-- Date d'expiration --%>
                            <div class="col-sm-3">
                                <div class="form-group">
                                    <label for="expirationCard"><strong>Expiration</strong></label>
                                    <div class="input-group">
                                        <input type="text" class="form-control" id="expirationCard" name="expirationCard"
                                               placeholder="MM / YY" required=""
                                               data-inputmask="'mask': '99 / 99'">
                                    </div>
                                </div>
                            </div>

                            <%-- CCV --%>
                            <div class="col-sm-3">
                                <div class="form-group">
                                    <label for="ccvCard"><strong>CCV</strong></label>
                                    <div class="input-group">
                                        <input type="text" class="form-control" id="ccvCard" name="ccvCard"
                                               placeholder="CCV" required=""
                                               data-inputmask="'mask': '999'">
                                    </div>
                                </div>
                            </div>

                        </div>

                        <%-- Identifiant de réservation --%>
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="input-group">
                                    <input type="text" class="form-control" id="idReservation_paiement" name="idReservation"
                                           placeholder="Identifiant réservation" required=""
                                           data-inputmask="'mask': '9', 'repeat': '5', 'greedy' : 'false'">
                                    <div class="input-group-append">
                                        <button class="btn btn-warning" type="submit">
                                            <i class="fa fa-credit-card fa-fw" aria-hidden="true"></i>&nbsp;
                                            Payer la réservation
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                    <%-- ./Formulaire --%>

                </div>
            </div>
        </div>
    </div>


    <%-- Formulaire d'annulation de chambre --%>
    <div class="row justify-content-center" style="margin-top: 30px">
        <div class="box-container">
            <div class="box box-danger">
                <div class="box-header with-border">
                    <i class="fa fa-times fa-fw text-danger" aria-hidden="true"></i>&nbsp;
                    <b>Annuler une réservation </b>

                </div>
                <div class="box-body text-justify" style="padding: 15px;">
                    Bienvenue sur le module d'annulation de réservation. Afin d'annuler votre réservation,
                    merci d'entrer son numéro ci-dessous.
                    <br />Sachez que si vous annulez votre réservation
                    <strong class="text-danger">moins d'un mois</strong> avant la date de début, une somme
                    correspondant à <strong class="text-danger">5% du prix total</strong> sera retenue.
                    ¯\_(ツ)_/¯

                    <%-- Identifiant de réservation --%>
                    <form method="POST" action="<c:url value="/annulerReservation"/>">
                        <div class="input-group" style="margin-top: 20px">
                            <input type="text" class="form-control" id="idReservation" name="idReservation"
                                   placeholder="Identifiant réservation" required=""
                                   data-inputmask="'mask': '9', 'repeat': '5', 'greedy' : 'false'">
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
    </div>


</div>