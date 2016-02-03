
package cltews;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sdist
 */
public class ClteWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int soyElClte;
        long deltaTAlInicioEnMillis;

        soyElClte = quienSoy();
        deltaTAlInicioEnMillis = lapsoAlInicioEnMillis();
        System.out.println("Clte: " + soyElClte + ", dormiré " + 
                deltaTAlInicioEnMillis + " milisegundos.");    
        
        try {
            Thread.currentThread().sleep(deltaTAlInicioEnMillis);
        } catch (InterruptedException ex) {
            Logger.getLogger(ClteWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int n = 1000;
        int a,b,c;
        for (int i = 0; i < n; i++) {
            a = (int)(1000.0 * (-1.0 + 2 * Math.random()));
            b = (int)(1000.0 * (-1.0 + 2 * Math.random()));
            c = suma(a,b);
            
            System.out.println("Clte: " + soyElClte + ", vez: " + i +
                    ", la suma de " + a + " y " + b + " es " + c);
        }
    }

    private static int suma(int a, int b) {
        miwebservice.cpr.MiWebService_Service service = new miwebservice.cpr.MiWebService_Service();
        miwebservice.cpr.MiWebService port = service.getMiWebServicePort();
        return port.suma(a, b);
    }

    private static int quienSoy() {
        serviciotiempos.ServicioTiempos_Service service = new serviciotiempos.ServicioTiempos_Service();
        serviciotiempos.ServicioTiempos port = service.getServicioTiemposPort();
        return port.quienSoy();
    }

    private static long lapsoAlInicioEnMillis() {
        serviciotiempos.ServicioTiempos_Service service = new serviciotiempos.ServicioTiempos_Service();
        serviciotiempos.ServicioTiempos port = service.getServicioTiemposPort();
        return port.lapsoAlInicioEnMillis();
    }
    
}
