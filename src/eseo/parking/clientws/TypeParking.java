
package eseo.parking.clientws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeParking.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeParking">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VoitureFamille"/>
 *     &lt;enumeration value="VoitureHandicapee"/>
 *     &lt;enumeration value="Voiture"/>
 *     &lt;enumeration value="Velo"/>
 *     &lt;enumeration value="Moto"/>
 *     &lt;enumeration value="Undefini"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeParking")
@XmlEnum
public enum TypeParking {

    @XmlEnumValue("VoitureFamille")
    VOITURE_FAMILLE("VoitureFamille"),
    @XmlEnumValue("VoitureHandicapee")
    VOITURE_HANDICAPEE("VoitureHandicapee"),
    @XmlEnumValue("Voiture")
    VOITURE("Voiture"),
    @XmlEnumValue("Velo")
    VELO("Velo"),
    @XmlEnumValue("Moto")
    MOTO("Moto"),
    @XmlEnumValue("Undefini")
    UNDEFINI("Undefini");
    private final String value;

    TypeParking(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeParking fromValue(String v) {
        for (TypeParking c: TypeParking.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
