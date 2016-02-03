/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tstws;

/**
 *
 * @author sdist
 */
public class TstWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long t0,t1;
        long sumaDeltaT = 0;
        double promDeltaT;
        int Veces = 1000;
        int a,b,c;
        for (int vez = 0; vez < Veces; vez++) {
            a = (int)(-1000.00 + 2000.00 * Math.random());
            b = (int)(-1000.00 + 2000.00 * Math.random());
            t0 = System.nanoTime();
            c = suma(a,b);
            t1 = System.nanoTime();
            sumaDeltaT += t1-t0;
            System.out.println("Iter "+vez+" - La suma de "+a+" y "+b+" es "+c);
        }
        
        promDeltaT = ((double)sumaDeltaT) / Veces;
        System.out.println("DeltaT promedio " + promDeltaT);
    }

    private static int suma(int a, int b) {
        webservices.rggh.MiWebService_Service service = new webservices.rggh.MiWebService_Service();
        webservices.rggh.MiWebService port = service.getMiWebServicePort();
        return port.suma(a, b);
    }
    
    
}
