/**
 * Class Pelicula
 */
package uni1a;
import java.util.ArrayList;
import java.util.List;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println();
    }
    
    private List<Actor> actores = new ArrayList<>();
    
    public void agregarActor(Actor actor) {
    	if (actor != null) { actores.add(actor); }
    }
    
    public void mostrarActores() {
    	System.out.println("Reparto de la peliculo: ");
    	for (Actor actor : actores ) { System.out.println("- "	+ actor); }
    }
}