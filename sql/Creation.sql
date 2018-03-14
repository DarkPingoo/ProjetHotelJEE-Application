--
-- Options par defaut
--
SET FOREIGN_KEY_CHECKS=0;
SET default_storage_engine=INNODB;
SET character_set_client = utf8;

--
-- Créer la base de donnée
--
CREATE DATABASE IF NOT EXISTS Hotel
DEFAULT CHARSET=utf8
COLLATE=utf8_unicode_ci;
USE Hotel;

--
-- Effacer les anciennes tables
--
DROP TABLE IF EXISTS RESERVATION;
DROP TABLE IF EXISTS CLIENT;
DROP TABLE IF EXISTS CHAMBRE;
SET FOREIGN_KEY_CHECKS=1;

--
-- Structure de la table 'client'
--
CREATE TABLE CLIENT (
 idClient SMALLINT NOT NULL AUTO_INCREMENT,
 nom VARCHAR(20) unique,
 prenom VARCHAR(20),
 numTelephone SMALLINT,
 PRIMARY KEY(idClient)
);

--
-- Structure de la table 'chambre'
--
CREATE TABLE CHAMBRE (
 idChambre SMALLINT NOT NULL AUTO_INCREMENT,
 typeChambre VARCHAR(30),
 nombrePlaceLit SMALLINT,
 prixJournalier SMALLINT,
 etage SMALLINT,
 PRIMARY KEY(idChambre)
);

--
-- Structure de la table 'reservation'
--
CREATE TABLE RESERVATION(
 idReservation INT NOT NULL AUTO_INCREMENT,
 idChambre SMALLINT,
 idClient SMALLINT,
 dateDebut DATE,
 dateFin DATE,
 nombrePlaces SMALLINT,
 booleenPaiementEffectue BOOLEAN,
 PRIMARY KEY(idReservation),
 FOREIGN KEY(idChambre) REFERENCES CHAMBRE(idChambre) ON DELETE SET NULL,
 FOREIGN KEY(idClient) REFERENCES CLIENT(idClient) ON DELETE SET NULL
);