package master;

/**
 *
 * @author sdist
 */
public class Master {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int lapso = 15;
        long dentroDeCuantosMillis;
        if (args.length > 0)
            lapso = Integer.parseInt(args[0]);
        blnReset(lapso);
        
        dentroDeCuantosMillis = lapsoAlInicioEnMillis();
        System.out.println("El inicio es dentro de " + 
                dentroDeCuantosMillis + " milisegundos");
    }

    private static boolean blnReset(int lapsoEnSegundos) {
        serviciotiempos.ServicioTiempos_Service service = new serviciotiempos.ServicioTiempos_Service();
        serviciotiempos.ServicioTiempos port = service.getServicioTiemposPort();
        return port.blnReset(lapsoEnSegundos);
    }

    private static long lapsoAlInicioEnMillis() {
        serviciotiempos.ServicioTiempos_Service service = new serviciotiempos.ServicioTiempos_Service();
        serviciotiempos.ServicioTiempos port = service.getServicioTiemposPort();
        return port.lapsoAlInicioEnMillis();
    }
    
}
