
package eseo.hotel.clientws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour chambre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="chambre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="etage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idChambre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbLits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="typeChambre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chambre", propOrder = {
    "etage",
    "idChambre",
    "nbLits",
    "prix",
    "typeChambre"
})
public class Chambre {

    protected int etage;
    protected int idChambre;
    protected int nbLits;
    protected int prix;
    protected String typeChambre;

    /**
     * Obtient la valeur de la propriété etage.
     * 
     */
    public int getEtage() {
        return etage;
    }

    /**
     * Définit la valeur de la propriété etage.
     * 
     */
    public void setEtage(int value) {
        this.etage = value;
    }

    /**
     * Obtient la valeur de la propriété idChambre.
     * 
     */
    public int getIdChambre() {
        return idChambre;
    }

    /**
     * Définit la valeur de la propriété idChambre.
     * 
     */
    public void setIdChambre(int value) {
        this.idChambre = value;
    }

    /**
     * Obtient la valeur de la propriété nbLits.
     * 
     */
    public int getNbLits() {
        return nbLits;
    }

    /**
     * Définit la valeur de la propriété nbLits.
     * 
     */
    public void setNbLits(int value) {
        this.nbLits = value;
    }

    /**
     * Obtient la valeur de la propriété prix.
     * 
     */
    public int getPrix() {
        return prix;
    }

    /**
     * Définit la valeur de la propriété prix.
     * 
     */
    public void setPrix(int value) {
        this.prix = value;
    }

    /**
     * Obtient la valeur de la propriété typeChambre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeChambre() {
        return typeChambre;
    }

    /**
     * Définit la valeur de la propriété typeChambre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeChambre(String value) {
        this.typeChambre = value;
    }

}
