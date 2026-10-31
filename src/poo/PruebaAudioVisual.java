package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");
        // nuevas estancias
        contenidos[3] = new Anime ("Jujutsu Kaisen",24,"Accion / Shonen","MAPPA",2020);
        contenidos[4] = new VideoEducativo ("Explorando el Sistema Solar",30,"Educativo","Astronomia","Universitario");

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
        
        System.out.println();
        
        SerieDeTV serie = (SerieDeTV) contenidos[1];
        
        serie.agregarTemporada(1, "Primera temporada", 10);
        serie.agregarTemporada(2, "Segunda temporada", 12);
        
        serie.mostrarTemporadas();

        System.out.println();

        Documental documental = (Documental) contenidos[2];
        
        Investigador investigador = new Investigador ("Neil deGrasse Tyson","Astrofisica");
        
        documental.asignarInvestigador(investigador);
        documental.mostrarInvestigador();

        System.out.println();
     
        Anime anime = (Anime) contenidos[3];
        
        anime.agregarTemporada(1, "Primera temporada", 24);
        anime.agregarTemporada(2, "Segunda temporada", 23);
        anime.mostrarTemporadas();
        
        System.out.println();
        
        VideoEducativo video = (VideoEducativo) contenidos[4];
        Investigador asesor = new Investigador ("Neil deGrasse Tyson","Astrofisica");
        video.asignarInvestigador(asesor);
        video.mostrarInvestigador();
        
    }
}