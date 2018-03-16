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
        <div class="col-sm-4">
            <div class="box box-success">
                <div class="box-header with-border">
                    <b>Suivre une réservation</b>
                </div>
                <div class="box-body text-justify">
                    Bienvenue sur la page de suivi de réservation. Cette page permet d'accéder à une réservation
                    que vous avez passer chez nous, afin de la visualiser, l'imprimer ou bien l'annuler.
                    Afin d'accéder à votre réservation, merci de bien vouloir renseigner <b class="text-primary">
                    l'identifiant de réservation</b> qui vous a été fourni.

                    <div class="input-group" style="margin-top: 20px">
                        <input type="text" class="form-control" id="idReservation" name="idReservation"
                               placeholder="Identifiant réservation" required="">
                        <div class="input-group-append">
                            <button class="btn btn-primary" type="button">
                                <i class="fa fa-search fa-fw" aria-hidden="true"></i>&nbsp;Rechercher
                            </button>
                        </div>
                    </div>

                </div>
            </div>
        </div>


        <%-- Résultat --%>
        <div class="col-sm-8">
            ¯\_(ツ)_/¯
            <br />Aucun résultat
        </div>
    </div>
    <div class="row">
        <div class="col-sm-2">&nbsp;</div>
        <div class="col-sm-8">

        </div>
    </div>
</div>