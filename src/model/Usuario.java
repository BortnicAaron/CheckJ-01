package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Aaron-Bortnic
 */
public class Usuario extends Persona {

    private List<Serie> series;

    public Usuario() {
        super();
    }

    public Usuario(Integer dni, String nombre) {
        super(dni, nombre);
        this.series = new ArrayList<>();
    }

    public Usuario(List<Serie> series, Integer dni, String nombre) {
        super(dni, nombre);
        this.series = series;
    }

    public void agregarSerie(Serie serie) throws Exceptions {
        for (Serie s : series) {
            if (s.equals(serie)) {
                throw new Exceptions("La serie que desea ingresar ya existe en su lista");
            }
        }
        series.add(serie);
    }

    public Integer cantidadCapitulosVistos() {
        Integer num = 0;
        for (Serie ser : series) {
            
            List<Temporada> temporadas = ser.getTemporadas();
            for (Temporada temporada : temporadas) {
                System.out.println(ser.getTitulo());
                num += temporada.capitulosVistos();
            }
        }
        return num;
    }

    public void verCapitulo(Serie serie) throws Exceptions {
        for (Serie ser : series) {
            if (ser.equals(serie)) {
                List<Temporada> temporadas = ser.getTemporadas();
                for (Temporada temporada : temporadas) {
                    temporada.setIniciada(true);
                    if (!temporada.getTerminada()) {
                        List<Capitulo> capitulos = temporada.getCapitulos();
                        for (Capitulo capitulo : capitulos) {
                            if (!capitulo.getVisto()) {
                                capitulo.setVisto(true);
                                if (capitulos.indexOf(capitulo) == capitulos.size() - 1) {
                                    temporada.setTerminada(true);
                                }
                                return;
                            }
                        }
                    }
                }
                throw new Exceptions("Serie completada, no se puede ver el siguiente capitulo");
            }
        }
        throw new Exceptions("No se encontro la serie que buscas");

    }

    public void listarContinuarViendo() throws Exceptions {
        Boolean bool = false;
        for (Serie ser : series) {
            bool = false;
            List<Temporada> temporadas = ser.getTemporadas();
            for (Temporada temporada : temporadas) {
                if (!temporada.getTerminada()) {
                    List<Capitulo> capitulos = temporada.getCapitulos();
                    for (Capitulo capitulo : capitulos) {
                        if (!capitulo.getVisto()) {
                            System.out.println("Serie: " + ser.getTitulo() + " - " + "Temporada: " + temporada.getNumero() + " - " + "Capítulo: " + capitulo.getNumeroCapitulo());
                            bool=true;
                            break;
                        }
                    }
                }
                if(bool){
                    break;
                }
            }
        }

    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> Series) {
        this.series = Series;
    }

    @Override
    public String toString() {
        return super.toString() + ", Usuario{" + "Series=" + series + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Usuario)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Usuario usuario = (Usuario) obj;
        return getSeries().equals(usuario.getSeries());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSeries());
    }

}
