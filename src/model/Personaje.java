package model;
/**
 *
 * @author Aaron-Bortnic
 */
public class Personaje {
    
    private static int global = 1000;
    private Integer id;
    private Actor actor;
    private String nombrePersonaje;

    public Personaje() {
        this.id = global++;
    }

    public Personaje(Actor actor, String nombrePersonaje) {
        this.id = global++;
        this.actor = actor;
        this.nombrePersonaje = nombrePersonaje;
    }
    

    public Integer getId() {
        return id;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    @Override
    public String toString() {
        return "\n" + "{" + "id=" + id + ", " + actor + ", nombrePersonaje=" + nombrePersonaje + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Personaje)) return false;
        Personaje personaje = (Personaje) obj;
        return getId().equals(personaje.getId()) 
                && getActor().equals(personaje.getActor())
                && getNombrePersonaje().equals(personaje.getNombrePersonaje());
    }
    
    
    
}
