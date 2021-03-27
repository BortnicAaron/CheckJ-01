package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Aaron-Bortnic
 */
public class Serie implements IAcciones{
    
    private static int global = 0;
    private Integer id;
    private String titulo;
    private String genero;
    private Integer ano;
    private String sinopsis;
    private List<Temporada> temporadas;
    private List<Personaje> personajes;

    public Serie() {
        this.id = global++;
    }

    /*public Serie(String titulo, String genero, Integer ano, String sinopsis) {
        this.id = global++;
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.sinopsis = sinopsis;
        this.temporadas = new ArrayList<>();
        this.personajes = new ArrayList<>();
    } */
    
    public Serie(String titulo, String genero, Integer ano, String sinopsis, List<Temporada> temporadas, List<Personaje> personajes) {
        this.id = global++;
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.sinopsis = sinopsis;
        this.temporadas = temporadas;
        this.personajes = personajes;
    }
    
    @Override
    public void agregar(Object obj) throws Exceptions{
        if (obj instanceof Temporada){
            if (temporadas.contains(obj)){
                throw new Exceptions("Temporada repetida");
            }
            temporadas.add((Temporada) obj);
        }
        if (obj instanceof Personaje){
            if (personajes.contains(obj)){
                throw new Exceptions("Personaje repetido");
            }
            for (Personaje personaje : personajes) {
                if(personaje.equals(obj)){
                    throw new Exceptions("Personaje repetido");
                }
            }
            personajes.add((Personaje) obj);
        }
    }
    
    @Override
    public void quitar(Integer id) throws Exceptions{
        Boolean bool = true;
        if(id < 1000){
            for (Temporada temporada : temporadas) {
                if( Objects.equals(id, temporada.getId())){
                    temporadas.remove(temporada);
                    bool = false;
                    break;
                }
            }
        }else{
            for (Personaje personaje : personajes) {
                if( Objects.equals(id, personaje.getId())){
                    personajes.remove(personaje);
                    bool = false;
                    break;
                }
            }            
        }
        if(bool){
            throw new Exceptions("No existe ni la temporada o personaje que desea eliminar");
        }
        
    }

    @Override
    public Object buscar(Integer id) {
        if(id < 1000){
            for (Temporada temporada : temporadas) {
                if( Objects.equals(id, temporada.getId())){
                    return temporada;
                }
            }
        }else{
            for (Personaje personaje : personajes) {
                if( Objects.equals(id, personaje.getId())){
                    return personaje;
                }
            }            
        }
        return null;
    }

    

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    @Override
    public String toString() {
        return "Serie{" + "id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", año=" + ano + ", sinopsis=" + sinopsis + "\nTemporadas: " + temporadas + "\nPersonajes: " + personajes + '}';
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitulo());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Serie)) return false;
        Serie serie = (Serie) obj;
        return getTitulo().equals(serie.getTitulo()) 
                && getGenero().equals(serie.getGenero())
                && getAno().equals(serie.getAno())
                && getSinopsis().equals(serie.getSinopsis())
                && getTemporadas().equals(serie.getTemporadas())
                && getPersonajes().equals(serie.getPersonajes());
    }


    
    
    
}
