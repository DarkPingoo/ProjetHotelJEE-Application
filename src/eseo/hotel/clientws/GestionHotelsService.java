package eseo.hotel.clientws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2018-03-21T13:06:00.048+01:00
 * Generated source version: 2.6.5
 * 
 */
@WebServiceClient(name = "GestionHotelsService", 
                  wsdlLocation = "file:/C:/Users/trist/IdeaProjects/ProjetHotelJEE-Application/src/eseo/hotel/clientws/gestionhotels.wsdl",
                  targetNamespace = "http://sw.eseo/") 
public class GestionHotelsService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://sw.eseo/", "GestionHotelsService");
    public final static QName GestionHotelsPort = new QName("http://sw.eseo/", "GestionHotelsPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/trist/IdeaProjects/ProjetHotelJEE-Application/src/eseo/hotel/clientws/gestionhotels.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GestionHotelsService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/trist/IdeaProjects/ProjetHotelJEE-Application/src/eseo/hotel/clientws/gestionhotels.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GestionHotelsService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GestionHotelsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GestionHotelsService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GestionHotelsService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GestionHotelsService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GestionHotelsService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns GestionHotelsSEI
     */
    @WebEndpoint(name = "GestionHotelsPort")
    public GestionHotelsSEI getGestionHotelsPort() {
        return super.getPort(GestionHotelsPort, GestionHotelsSEI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GestionHotelsSEI
     */
    @WebEndpoint(name = "GestionHotelsPort")
    public GestionHotelsSEI getGestionHotelsPort(WebServiceFeature... features) {
        return super.getPort(GestionHotelsPort, GestionHotelsSEI.class, features);
    }

}
