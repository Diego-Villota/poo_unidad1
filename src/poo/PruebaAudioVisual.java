package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        //System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");
        // nuevas estancias a partir de las nuevas clases
        contenidos[3] = new Anime ("Jujutsu Kaisen",24,"Accion / Shonen","MAPPA",2020);
        contenidos[4] = new VideoEducativo ("Explorando el Sistema Solar",30,"Educativo","Astronomia","Universitario");
        
        Pelicula pelicula = (Pelicula) contenidos[0];
        
        Actor actor1 = new Actor("Leonardo DiCaprio","Estadounidense");
        Actor actor2 = new Actor("Matthew McConaughey","Estadounidense");
        
        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor2);        
        
        SerieDeTV serie = (SerieDeTV) contenidos[1];
        
        serie.agregarTemporada(1, "Primera temporada", 10);
        serie.agregarTemporada(2, "Segunda temporada", 10);       
        serie.agregarTemporada(3, "Tercera temporada", 10);
        serie.agregarTemporada(4, "Cuarta temporada", 10);
        serie.agregarTemporada(5, "Quinta temporada", 10);
        serie.agregarTemporada(6, "Sexta temporada", 10);
        serie.agregarTemporada(7, "Septima temporada", 7);
        serie.agregarTemporada(8, "Octava temporada", 6);

        Documental documental = (Documental) contenidos[2];
        
        Investigador investigador = new Investigador ("Neil deGrasse Tyson","Astrofisica");
        
        documental.asignarInvestigador(investigador);
     
        Anime anime = (Anime) contenidos[3];
        
        anime.agregarTemporada(1, "Primera temporada", 24);
        anime.agregarTemporada(2, "Segunda temporada", 23);
        anime.agregarTemporada(3, "Tercera temporada", 12);
        
                
        VideoEducativo video = (VideoEducativo) contenidos[4];
        Investigador asesor = new Investigador ("Neil deGrasse Tyson","Astrofisica");
        video.asignarInvestigador(asesor);

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
        
        // MOSTRAR INFO ADICIONAL
        
        pelicula.mostrarActores();
        System.out.println();

        serie.mostrarTemporadas();
        System.out.println();

        documental.mostrarInvestigador();
        System.out.println();

        
        anime.mostrarTemporadas();
        System.out.println();

        video.mostrarInvestigador();
        
    }
}