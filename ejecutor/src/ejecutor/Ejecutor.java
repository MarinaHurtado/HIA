
package ejecutor;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sdist
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numCltes = 10;
        for (int clte = 1; clte <= numCltes; clte++) {
            try {
                //Ejecutar procesos al mismo tiempo (varias ventanas)
                Runtime.getRuntime().exec("cmd /c start java -jar clteWS.jar");
                System.out.println("Iniciado el cliente " + clte);
            } catch (IOException ex) {
                Logger.getLogger(Ejecutor.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
        }
        
    }
    
}
