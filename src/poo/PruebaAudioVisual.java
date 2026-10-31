package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
        
        Pelicula pelicula = (Pelicula) contenidos[0];
        
        Actor actor1 = new Actor("Leonardo DiCaprio","Estadounidense");
        Actor actor2 = new Actor("Matthew McConaughey","Estadounidense");
        
        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor2);
        pelicula.mostrarActores();
        
        SerieDeTV serie = (SerieDeTV) contenidos[1];
        
        serie.agregarTemporada(1, "Primera temporada", 10);
        serie.agregarTemporada(2, "Segunda temporada", 12);
        
        serie.mostrarTemporadas();
        
        Documental documental = (Documental) contenidos[2];
        
        Investigador investigador = new Investigador ("Neil deGrasse Tyson","Astrofisica");
        
        documental.asignarInvestigador(investigador);
        documental.mostrarInvestigador();
        
    }
}