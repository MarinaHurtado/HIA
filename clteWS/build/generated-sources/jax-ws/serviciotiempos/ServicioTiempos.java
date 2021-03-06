
package serviciotiempos;

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
@WebService(name = "ServicioTiempos", targetNamespace = "http://serviciotiempos/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioTiempos {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "quienSoy", targetNamespace = "http://serviciotiempos/", className = "serviciotiempos.QuienSoy")
    @ResponseWrapper(localName = "quienSoyResponse", targetNamespace = "http://serviciotiempos/", className = "serviciotiempos.QuienSoyResponse")
    @Action(input = "http://serviciotiempos/ServicioTiempos/quienSoyRequest", output = "http://serviciotiempos/ServicioTiempos/quienSoyResponse")
    public int quienSoy();

    /**
     * 
     * @param lapsoEnSegundos
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "blnReset", targetNamespace = "http://serviciotiempos/", className = "serviciotiempos.BlnReset")
    @ResponseWrapper(localName = "blnResetResponse", targetNamespace = "http://serviciotiempos/", className = "serviciotiempos.BlnResetResponse")
    @Action(input = "http://serviciotiempos/ServicioTiempos/blnResetRequest", output = "http://serviciotiempos/ServicioTiempos/blnResetResponse")
    public boolean blnReset(
        @WebParam(name = "lapsoEnSegundos", targetNamespace = "")
        int lapsoEnSegundos);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://serviciotiempos/", className = "serviciotiempos.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://serviciotiempos/", className = "serviciotiempos.HelloResponse")
    @Action(input = "http://serviciotiempos/ServicioTiempos/helloRequest", output = "http://serviciotiempos/ServicioTiempos/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "lapsoAlInicioEnMillis", targetNamespace = "http://serviciotiempos/", className = "serviciotiempos.LapsoAlInicioEnMillis")
    @ResponseWrapper(localName = "lapsoAlInicioEnMillisResponse", targetNamespace = "http://serviciotiempos/", className = "serviciotiempos.LapsoAlInicioEnMillisResponse")
    @Action(input = "http://serviciotiempos/ServicioTiempos/lapsoAlInicioEnMillisRequest", output = "http://serviciotiempos/ServicioTiempos/lapsoAlInicioEnMillisResponse")
    public long lapsoAlInicioEnMillis();

}
