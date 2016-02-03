
package miwebservice.cpr;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "miWebService", targetNamespace = "http://cpr.miwebservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MiWebService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://cpr.miwebservice/", className = "miwebservice.cpr.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://cpr.miwebservice/", className = "miwebservice.cpr.HelloResponse")
    @Action(input = "http://cpr.miwebservice/miWebService/helloRequest", output = "http://cpr.miwebservice/miWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "suma", targetNamespace = "http://cpr.miwebservice/", className = "miwebservice.cpr.Suma")
    @ResponseWrapper(localName = "sumaResponse", targetNamespace = "http://cpr.miwebservice/", className = "miwebservice.cpr.SumaResponse")
    @Action(input = "http://cpr.miwebservice/miWebService/sumaRequest", output = "http://cpr.miwebservice/miWebService/sumaResponse")
    public int suma(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

}