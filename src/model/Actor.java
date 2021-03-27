package model;

import java.util.Objects;

/**
 *
 * @author Aaron-Bortnic
 */
public class Actor extends Persona {
    
    private String apellido;

    public Actor() {
        super();
    }

    public Actor(String apellido, Integer dni, String nombre) {
        super(dni, nombre);
        this.apellido = apellido;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return super.toString() + ", apellido= " + apellido ;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Actor)) return false;
        if (!super.equals(obj)) return false;
        Actor actor = (Actor) obj;
        return getApellido().equals(actor.getApellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getApellido());
    }
    
}
