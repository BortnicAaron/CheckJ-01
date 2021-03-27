package model;
/**
 *
 * @author Aaron-Bortnic
 */
public interface IAcciones {
    
    public void agregar(Object obj) throws Exceptions;

    public void quitar(Integer id) throws  Exceptions;
    
    public Object buscar(Integer id);
}
