
package eseo.hotel.clientws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eseo.hotel.clientws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnnulerChambre_QNAME = new QName("http://sw.eseo/", "annulerChambre");
    private final static QName _PayerChambreResponse_QNAME = new QName("http://sw.eseo/", "payerChambreResponse");
    private final static QName _ReserverChambre_QNAME = new QName("http://sw.eseo/", "reserverChambre");
    private final static QName _TrouverChambre_QNAME = new QName("http://sw.eseo/", "trouverChambre");
    private final static QName _ReserverChambreResponse_QNAME = new QName("http://sw.eseo/", "reserverChambreResponse");
    private final static QName _TrouverChambreResponse_QNAME = new QName("http://sw.eseo/", "trouverChambreResponse");
    private final static QName _PayerChambre_QNAME = new QName("http://sw.eseo/", "payerChambre");
    private final static QName _AnnulerChambreResponse_QNAME = new QName("http://sw.eseo/", "annulerChambreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eseo.hotel.clientws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PayerChambre }
     * 
     */
    public PayerChambre createPayerChambre() {
        return new PayerChambre();
    }

    /**
     * Create an instance of {@link AnnulerChambreResponse }
     * 
     */
    public AnnulerChambreResponse createAnnulerChambreResponse() {
        return new AnnulerChambreResponse();
    }

    /**
     * Create an instance of {@link AnnulerChambre }
     * 
     */
    public AnnulerChambre createAnnulerChambre() {
        return new AnnulerChambre();
    }

    /**
     * Create an instance of {@link PayerChambreResponse }
     * 
     */
    public PayerChambreResponse createPayerChambreResponse() {
        return new PayerChambreResponse();
    }

    /**
     * Create an instance of {@link ReserverChambre }
     * 
     */
    public ReserverChambre createReserverChambre() {
        return new ReserverChambre();
    }

    /**
     * Create an instance of {@link TrouverChambre }
     * 
     */
    public TrouverChambre createTrouverChambre() {
        return new TrouverChambre();
    }

    /**
     * Create an instance of {@link ReserverChambreResponse }
     * 
     */
    public ReserverChambreResponse createReserverChambreResponse() {
        return new ReserverChambreResponse();
    }

    /**
     * Create an instance of {@link TrouverChambreResponse }
     * 
     */
    public TrouverChambreResponse createTrouverChambreResponse() {
        return new TrouverChambreResponse();
    }

    /**
     * Create an instance of {@link ReservationChambre }
     * 
     */
    public ReservationChambre createReservationChambre() {
        return new ReservationChambre();
    }

    /**
     * Create an instance of {@link Chambre }
     * 
     */
    public Chambre createChambre() {
        return new Chambre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerChambre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.eseo/", name = "annulerChambre")
    public JAXBElement<AnnulerChambre> createAnnulerChambre(AnnulerChambre value) {
        return new JAXBElement<AnnulerChambre>(_AnnulerChambre_QNAME, AnnulerChambre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerChambreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.eseo/", name = "payerChambreResponse")
    public JAXBElement<PayerChambreResponse> createPayerChambreResponse(PayerChambreResponse value) {
        return new JAXBElement<PayerChambreResponse>(_PayerChambreResponse_QNAME, PayerChambreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverChambre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.eseo/", name = "reserverChambre")
    public JAXBElement<ReserverChambre> createReserverChambre(ReserverChambre value) {
        return new JAXBElement<ReserverChambre>(_ReserverChambre_QNAME, ReserverChambre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverChambre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.eseo/", name = "trouverChambre")
    public JAXBElement<TrouverChambre> createTrouverChambre(TrouverChambre value) {
        return new JAXBElement<TrouverChambre>(_TrouverChambre_QNAME, TrouverChambre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverChambreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.eseo/", name = "reserverChambreResponse")
    public JAXBElement<ReserverChambreResponse> createReserverChambreResponse(ReserverChambreResponse value) {
        return new JAXBElement<ReserverChambreResponse>(_ReserverChambreResponse_QNAME, ReserverChambreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverChambreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.eseo/", name = "trouverChambreResponse")
    public JAXBElement<TrouverChambreResponse> createTrouverChambreResponse(TrouverChambreResponse value) {
        return new JAXBElement<TrouverChambreResponse>(_TrouverChambreResponse_QNAME, TrouverChambreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerChambre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.eseo/", name = "payerChambre")
    public JAXBElement<PayerChambre> createPayerChambre(PayerChambre value) {
        return new JAXBElement<PayerChambre>(_PayerChambre_QNAME, PayerChambre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerChambreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.eseo/", name = "annulerChambreResponse")
    public JAXBElement<AnnulerChambreResponse> createAnnulerChambreResponse(AnnulerChambreResponse value) {
        return new JAXBElement<AnnulerChambreResponse>(_AnnulerChambreResponse_QNAME, AnnulerChambreResponse.class, null, value);
    }

}
