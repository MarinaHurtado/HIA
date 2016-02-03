
package dispatcher;

/**
 *
 * @author sdist
 */
public class Dispatcher {

    public static String[] shift(String args[]){
        //Obtenemos los args correctos para enviar al master
        String res[] = new String[0];
        if (args.length > 1)
            res = new String[args.length-1];         
        for (int i = 1; i < args.length; i++) {
            res[i-1] = args[i];
        }
        
        return res;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String procesos[] = {"Master","Clte","Ejecutor"};
        String proceso = "Clte";
        
        if (args.length != 0)
            proceso = args[0];
        
        // Dispatcher
        // Le pasamos al master lo necesario al master
        if (procesos[0].compareToIgnoreCase(proceso) == 0)
            master.Master.main(shift(args)); 
        else if (procesos[1].compareToIgnoreCase(proceso) == 0)
            cltews.ClteWS.main(shift(args));
        else if (procesos[2].compareToIgnoreCase(proceso) == 0)
            ejecutor.Ejecutor.main(shift(args));
        else 
            System.out.println("No existe la opción "+proceso);
    }
    
}
