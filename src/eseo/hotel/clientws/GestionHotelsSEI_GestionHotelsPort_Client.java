
package eseo.hotel.clientws;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2018-03-21T13:05:59.927+01:00
 * Generated source version: 2.6.5
 * 
 */
public final class GestionHotelsSEI_GestionHotelsPort_Client {

    private static final QName SERVICE_NAME = new QName("http://sw.eseo/", "GestionHotelsService");

    private GestionHotelsSEI_GestionHotelsPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = GestionHotelsService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        GestionHotelsService ss = new GestionHotelsService(wsdlURL, SERVICE_NAME);
        GestionHotelsSEI port = ss.getGestionHotelsPort();  
        
        {
        System.out.println("Invoking payerChambre...");
        int _payerChambre_arg0 = 0;
        java.lang.String _payerChambre__return = port.payerChambre(_payerChambre_arg0);
        System.out.println("payerChambre.result=" + _payerChambre__return);


        }
        {
        System.out.println("Invoking annulerChambre...");
        int _annulerChambre_arg0 = 0;
        boolean _annulerChambre__return = port.annulerChambre(_annulerChambre_arg0);
        System.out.println("annulerChambre.result=" + _annulerChambre__return);


        }
        {
        System.out.println("Invoking reserverChambre...");
        eseo.hotel.clientws.ReservationChambre _reserverChambre_arg0 = null;
        int _reserverChambre__return = port.reserverChambre(_reserverChambre_arg0);
        System.out.println("reserverChambre.result=" + _reserverChambre__return);


        }
        {
        System.out.println("Invoking trouverChambre...");
        java.lang.String _trouverChambre_arg0 = "";
        java.util.List<eseo.hotel.clientws.Chambre> _trouverChambre__return = port.trouverChambre(_trouverChambre_arg0);
        System.out.println("trouverChambre.result=" + _trouverChambre__return);


        }

        System.exit(0);
    }

}