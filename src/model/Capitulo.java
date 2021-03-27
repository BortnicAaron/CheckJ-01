package model;

/**
 *
 * @author Aaron-Bortnic
 */
public class Capitulo {
    
    private Integer numeroCapitulo;
    private String titulo;
    private Float duracion;
    private Boolean visto;

    public Capitulo() {
    }

    public Capitulo(Integer numeroCapitulo, String titulo, Float duracion, Boolean visto) {
        this.numeroCapitulo = numeroCapitulo;
        this.titulo = titulo;
        this.duracion = duracion;
        this.visto = visto;
    }

    public Integer getNumeroCapitulo() {
        return numeroCapitulo;
    }

    public void setNumeroCapitulo(Integer numeroCapitulo) {
        this.numeroCapitulo = numeroCapitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Float getDuracion() {
        return duracion;
    }

    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }

    public Boolean getVisto() {
        return visto;
    }

    public void setVisto(Boolean visto) {
        this.visto = visto;
    }

    @Override
    public String toString() {
        return "Capitulo{" + "numeroCapitulo=" + numeroCapitulo + ", titulo=" + titulo + ", duracion=" + duracion + ", visto=" + visto + '}';
    }
    
    
}
