package model;

import java.util.Objects;

/**
 *
 * @author Aaron-Bortnic
 */
public abstract class Persona {
    
        private Integer dni;
        private String nombre;

    public Persona() {
    }

    public Persona(Integer dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }    
        
    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "dni=" + dni + ", nombre=" + nombre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getDni());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Persona)) return false;
        Persona persona = (Persona) obj;
        return getNombre().equals(persona.getNombre()) && getDni().equals(persona.getDni());
    }
        
    
    
    
}
