package check.pkg01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Actor;
import model.Capitulo;
import model.Exceptions;
import model.Personaje;
import model.Serie;
import model.Temporada;
import model.Usuario;

/**
 *
 * @author Aaron-Bortnic
 */
public class Check01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exceptions {
        System.out.println("SERIES");

        //-----------------------------------------------------------
        //capitulos
        Capitulo capitulo1 = new Capitulo(1, "Piloto", 50f, true);
        Capitulo capitulo2 = new Capitulo(2, "capit2", 50f, true);
        Capitulo capitulo3 = new Capitulo(3, "capit3", 50f, false);
        Capitulo capitulo4 = new Capitulo(4, "capit4", 50f, true);
        Capitulo capitulo5 = new Capitulo(5, "capit5", 50f, false);
        List<Capitulo> capitulosS1Tem1 = new ArrayList<>(Arrays.asList(capitulo1, capitulo2, capitulo3, capitulo4, capitulo5));
        Capitulo capitulo1f = new Capitulo(1, "Piloto", 50f, false);
        Capitulo capitulo2f = new Capitulo(2, "capit2", 50f, false);
        Capitulo capitulo3f = new Capitulo(3, "capit3", 50f, false);
        Capitulo capitulo4f = new Capitulo(4, "capit4", 50f, false);
        Capitulo capitulo5f = new Capitulo(5, "capit5", 50f, false);
        List<Capitulo> capitulosS1Tem2 = new ArrayList<>(Arrays.asList(capitulo1f, capitulo2f, capitulo3f, capitulo4f, capitulo5f));
        //****
        Capitulo capitulo1S2 = new Capitulo(1, "Piloto", 50f, true);
        Capitulo capitulo2S2 = new Capitulo(2, "capit2", 50f, true);
        Capitulo capitulo3S2 = new Capitulo(3, "capit3", 50f, false);
        Capitulo capitulo4S2 = new Capitulo(4, "capit4", 50f, true);
        Capitulo capitulo5S2 = new Capitulo(5, "capit5", 50f, false);
        List<Capitulo> capitulosS2Tem1 = new ArrayList<>(Arrays.asList(capitulo1S2, capitulo2S2, capitulo3S2, capitulo4S2, capitulo5S2));
        Capitulo capitulo1fS2 = new Capitulo(1, "Piloto", 50f, true);
        Capitulo capitulo2fS2 = new Capitulo(2, "capit2", 50f, false);
        Capitulo capitulo3fS2 = new Capitulo(3, "capit3", 50f, false);
        Capitulo capitulo4fS2 = new Capitulo(4, "capit4", 50f, false);
        Capitulo capituloAgregado = new Capitulo(5, "capit5", 50f, false);
        List<Capitulo> capitulosS2Tem2 = new ArrayList<>(Arrays.asList(capitulo1fS2, capitulo2fS2, capitulo3fS2, capitulo4fS2));
        //-----------------------------------------------------------
        //temporadas 
        Temporada temporadaS1T1 = new Temporada(1, 2008, true, false, capitulosS1Tem1);
        Temporada temporadaS1T2 = new Temporada(2, 2008, false, false, capitulosS1Tem2);
        List<Temporada> temporadas1 = new ArrayList<>(Arrays.asList(temporadaS1T1));
        //****
        Temporada temporadaS2T1 = new Temporada(1, 2008, true, false, capitulosS2Tem1);
        Temporada temporadaS2T2 = new Temporada(2, 2008, false, false, capitulosS2Tem2);
        /**
         * EN ESTA PARTE AGREGO UN CAPITULO A LA TEMPORADA 
         */
        temporadaS2T2.agregarCapitulo(capituloAgregado);
        List<Temporada> temporadas2 = new ArrayList<>(Arrays.asList(temporadaS2T1, temporadaS2T2));
        //-----------------------------------------------------------
        //Actores y Personajes
        Actor actor1 = new Actor("Cranston", 4253658, "Bryan");
        Actor actor2 = new Actor("Aaron", 4253698, "Paul");
        Actor actor3 = new Actor("Anna", 4253648, "Gunn");
        Personaje personaje1 = new Personaje(actor1, "Walter White");
        Personaje personaje2 = new Personaje(actor2, "Jesse Pinkman");
        Personaje personaje3 = new Personaje(actor3, "Skyler White");
        List<Personaje> personajes = new ArrayList<>(Arrays.asList(personaje1, personaje2));
        //-----------------------------------------------------------
        // Series
        Serie serie1 = new Serie("Breaking Bad", "Crimen", 2008, "Walter White un profesor de química de secundaria agobiado por problemas económicos para sostener a su familia y con un cáncer terminal, toma una decisión para ganar dinero y transforma un viejo vehículo en un laboratorio de metanfetaminas rodante.", temporadas1, personajes);
        Serie serie2 = new Serie("Game of Thrones ", "Drama", 2011, "Es la descripción de dos familias poderosas, reyes y reinas, caballeros y renegados, hombres falsos y honestos, haciendo parte…", temporadas2, personajes);
        /**
         * EN ESTA PARTE AGREGO A UN PERSONAJE Y LA TEMPORADA 2 DE LA SERIE1
         */
        serie1.agregar(personaje3);
        serie1.agregar(temporadaS1T2);
        /**
         * EN ESTA PARTE QUITO LA TEMPORADA 1 Y A UN PERSONAJE PRINCIPAL DE LA
         * SERIE1 A TRAVES DE SU ID
         */
        serie1.quitar(0);
        serie1.quitar(1000);
        //-----------------------------------------------------------
        // Usuarios
        Usuario usuario1 = new Usuario(42536899, "Aaron");
        /**
         * EN ESTA PARTE agrego la serie al listado validando que no exista previamente
         */
        usuario1.agregarSerie(serie1);
        usuario1.agregarSerie(serie2);
        //-----------------------------------------------------------
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("cantidadCapitulosVistos: " + usuario1.cantidadCapitulosVistos());
        usuario1.listarContinuarViendo();
        
        
    }

}
