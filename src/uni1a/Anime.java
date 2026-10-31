package uni1a;
import java.util.ArrayList;
import java.util.List;
public class Anime extends ContenidoAudiovisual{
	private String estudioAnimacion;
	private int anioEstreno;
	private List<Temporada> temporadas = new ArrayList<>();
	
	public Anime(String titulo, int duracionEnMinutos,String genero,String estudioAnimacion,int anioEstreno) {
		super(titulo,duracionEnMinutos,genero);
		this.estudioAnimacion = estudioAnimacion;
		this.anioEstreno = anioEstreno;
	}
	
	public String getEstudioAnimacion() {
		return estudioAnimacion;
	}
	
	public int getAnioEstreno() {
		return anioEstreno;
	}
	
	public void agregarTemporada(int numero,String titulo,int episodios) {
		Temporada temporada = new Temporada (numero,titulo,episodios);
		temporadas.add(temporada);
	}
	
	public void mostrarTemporadas() {
		System.out.println("Temporadas de este anime: ");
		for (Temporada temporada : temporadas) { System.out.print(" - " + temporada); }
	} 
	
	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del anime:");
		System.out.println("ID: " + getId());
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Duracion: " + getDuracionEnMinutos() + " min");

		System.out.println("Genero: " + getGenero());
		System.out.println("Estudio: " + estudioAnimacion);
		System.out.println("Año de estreno: " + anioEstreno);
		System.out.println("Temporadas registradas: " + temporadas.size());

		System.out.println();

	}
}
