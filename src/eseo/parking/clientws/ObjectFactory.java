
package eseo.parking.clientws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eseo.parking.clientws package. 
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

    private final static QName _TrouverParkingResponse_QNAME = new QName("http://servlet.parkingbooking.eseo.fr/", "trouverParkingResponse");
    private final static QName _AnnulerReservationParkingResponse_QNAME = new QName("http://servlet.parkingbooking.eseo.fr/", "annulerReservationParkingResponse");
    private final static QName _ReserverParkingResponse_QNAME = new QName("http://servlet.parkingbooking.eseo.fr/", "reserverParkingResponse");
    private final static QName _PayerParking_QNAME = new QName("http://servlet.parkingbooking.eseo.fr/", "payerParking");
    private final static QName _TrouverParking_QNAME = new QName("http://servlet.parkingbooking.eseo.fr/", "trouverParking");
    private final static QName _ReserverParking_QNAME = new QName("http://servlet.parkingbooking.eseo.fr/", "reserverParking");
    private final static QName _PayerParkingResponse_QNAME = new QName("http://servlet.parkingbooking.eseo.fr/", "payerParkingResponse");
    private final static QName _AnnulerReservationParking_QNAME = new QName("http://servlet.parkingbooking.eseo.fr/", "annulerReservationParking");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eseo.parking.clientws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReserverParking }
     * 
     */
    public ReserverParking createReserverParking() {
        return new ReserverParking();
    }

    /**
     * Create an instance of {@link AnnulerReservationParking }
     * 
     */
    public AnnulerReservationParking createAnnulerReservationParking() {
        return new AnnulerReservationParking();
    }

    /**
     * Create an instance of {@link PayerParkingResponse }
     * 
     */
    public PayerParkingResponse createPayerParkingResponse() {
        return new PayerParkingResponse();
    }

    /**
     * Create an instance of {@link AnnulerReservationParkingResponse }
     * 
     */
    public AnnulerReservationParkingResponse createAnnulerReservationParkingResponse() {
        return new AnnulerReservationParkingResponse();
    }

    /**
     * Create an instance of {@link ReserverParkingResponse }
     * 
     */
    public ReserverParkingResponse createReserverParkingResponse() {
        return new ReserverParkingResponse();
    }

    /**
     * Create an instance of {@link TrouverParkingResponse }
     * 
     */
    public TrouverParkingResponse createTrouverParkingResponse() {
        return new TrouverParkingResponse();
    }

    /**
     * Create an instance of {@link TrouverParking }
     * 
     */
    public TrouverParking createTrouverParking() {
        return new TrouverParking();
    }

    /**
     * Create an instance of {@link PayerParking }
     * 
     */
    public PayerParking createPayerParking() {
        return new PayerParking();
    }

    /**
     * Create an instance of {@link Parking }
     * 
     */
    public Parking createParking() {
        return new Parking();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverParkingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servlet.parkingbooking.eseo.fr/", name = "trouverParkingResponse")
    public JAXBElement<TrouverParkingResponse> createTrouverParkingResponse(TrouverParkingResponse value) {
        return new JAXBElement<TrouverParkingResponse>(_TrouverParkingResponse_QNAME, TrouverParkingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerReservationParkingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servlet.parkingbooking.eseo.fr/", name = "annulerReservationParkingResponse")
    public JAXBElement<AnnulerReservationParkingResponse> createAnnulerReservationParkingResponse(AnnulerReservationParkingResponse value) {
        return new JAXBElement<AnnulerReservationParkingResponse>(_AnnulerReservationParkingResponse_QNAME, AnnulerReservationParkingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverParkingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servlet.parkingbooking.eseo.fr/", name = "reserverParkingResponse")
    public JAXBElement<ReserverParkingResponse> createReserverParkingResponse(ReserverParkingResponse value) {
        return new JAXBElement<ReserverParkingResponse>(_ReserverParkingResponse_QNAME, ReserverParkingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerParking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servlet.parkingbooking.eseo.fr/", name = "payerParking")
    public JAXBElement<PayerParking> createPayerParking(PayerParking value) {
        return new JAXBElement<PayerParking>(_PayerParking_QNAME, PayerParking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverParking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servlet.parkingbooking.eseo.fr/", name = "trouverParking")
    public JAXBElement<TrouverParking> createTrouverParking(TrouverParking value) {
        return new JAXBElement<TrouverParking>(_TrouverParking_QNAME, TrouverParking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverParking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servlet.parkingbooking.eseo.fr/", name = "reserverParking")
    public JAXBElement<ReserverParking> createReserverParking(ReserverParking value) {
        return new JAXBElement<ReserverParking>(_ReserverParking_QNAME, ReserverParking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerParkingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servlet.parkingbooking.eseo.fr/", name = "payerParkingResponse")
    public JAXBElement<PayerParkingResponse> createPayerParkingResponse(PayerParkingResponse value) {
        return new JAXBElement<PayerParkingResponse>(_PayerParkingResponse_QNAME, PayerParkingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerReservationParking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servlet.parkingbooking.eseo.fr/", name = "annulerReservationParking")
    public JAXBElement<AnnulerReservationParking> createAnnulerReservationParking(AnnulerReservationParking value) {
        return new JAXBElement<AnnulerReservationParking>(_AnnulerReservationParking_QNAME, AnnulerReservationParking.class, null, value);
    }

}
