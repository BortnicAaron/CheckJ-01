package model;
/**
 *
 * @author Aaron-Bortnic
 */
public class Exceptions extends Exception {
    
    private String mensaje;
    
    public Exceptions(String mensaje) {
        super(String.format(mensaje));
        this.mensaje = mensaje;
        System.out.println(mensaje);
    }
}
