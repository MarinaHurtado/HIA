/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciotiempos;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author sdist
 */
@WebService(serviceName = "ServicioTiempos")
public class ServicioTiempos {

    private static int cuantosVan;
    private long aQueHoraEsElInicio;
    
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @param lapsoEnSegundos
     * @return 
     */
    @WebMethod(operationName = "blnReset")
    public boolean blnReset(@WebParam(name = "lapsoEnSegundos") int lapsoEnSegundos) {
        cuantosVan = 0;
        aQueHoraEsElInicio = System.currentTimeMillis() + 1000 * lapsoEnSegundos;
        return true;
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "quienSoy")
    public int quienSoy() {
        return ++cuantosVan;
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "lapsoAlInicioEnMillis")
    public long lapsoAlInicioEnMillis() {
        return aQueHoraEsElInicio - System.currentTimeMillis();
    }
    
    
    
}
