package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aaron-Bortnic
 */
public class Temporada {
    
    private static int global = 0;
    private Integer id;
    private Integer numero;
    private Integer ano;
    private Boolean iniciada;
    private Boolean terminada;
    private List<Capitulo> capitulos;   

    public Temporada() {
        this.id = global++;
    }

    /*public Temporada(Integer numero, Integer ano, Boolean iniciada, Boolean terminada) {
        this.id = global++;
        this.numero = numero;
        this.ano = ano;
        this.iniciada = iniciada;
        this.terminada = terminada;
        this.capitulos = new ArrayList<>();
    }*/
    
    public Temporada(Integer numero, Integer ano, Boolean iniciada, Boolean terminada, List<Capitulo> capitulos) {
        this.id = global++;
        this.numero = numero;
        this.ano = ano;
        this.iniciada = iniciada;
        this.terminada = terminada;
        this.capitulos = capitulos;
    }
    
    public void agregarCapitulo(Capitulo capitulo) {
        Boolean bool = true;
        if(capitulos.contains(capitulo)){
            bool = false;
        }
        for (Capitulo capituloR : capitulos) {
            if(capituloR.equals(capitulo)){
                bool = false;
            }
        }
        if(bool){
            capitulos.add(capitulo);
        }
    }
    
    public Integer capitulosVistos(){
        Integer num = 0;
        for (Capitulo capitulo : capitulos) {
            if(capitulo.getVisto()) num++;
        }
        return num;
    }
    

    public Integer getId() {
        return id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Boolean getIniciada() {
        return iniciada;
    }

    public void setIniciada(Boolean iniciada) {
        this.iniciada = iniciada;
    }

    public Boolean getTerminada() {
        return terminada;
    }

    public void setTerminada(Boolean terminada) {
        this.terminada = terminada;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(List<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    @Override
    public String toString() {
        return "\n{" + "id=" + id + ", numero=" + numero + ", iniciada=" + iniciada + ", terminada=" + terminada + ", capitulos=" + capitulos + '}';
    }
    
    
}
