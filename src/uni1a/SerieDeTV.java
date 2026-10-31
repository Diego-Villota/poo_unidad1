/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.ArrayList;
import java.util.List;
// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        System.out.println();
    }
    
    private List<Temporada> temporadas_1 = new ArrayList<>();
    
    public void agregarTemporada(int numero, String titulo, int episodios) {
    	Temporada temporada = new Temporada(numero,titulo,episodios);
    	temporadas_1.add(temporada);
    }
    
    public void mostrarTemporadas() {
    	System.out.println("Temporadas de la serie: ");
    	for (Temporada temporada : temporadas_1) {
    		System.out.println("- " + temporada);
    	}
    }
}