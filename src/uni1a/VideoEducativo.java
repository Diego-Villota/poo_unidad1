package uni1a;

public class VideoEducativo extends ContenidoAudiovisual {
	private String tema;
	private String nivelEducativo;
	private Investigador investigador;
	
	public VideoEducativo (String titulo,int duracionEnMinutos,String genero,String tema,String nivelEducativo) {
		super(titulo,duracionEnMinutos,genero);
		this.tema = tema;
		this.nivelEducativo = nivelEducativo;
	}
	
	public String getTema() { return tema; }
	public String getNivelEducativo() { return nivelEducativo; }
	
	public void asignarInvestigador (Investigador investigador) {
		this.investigador = investigador;
	}
	
	public void mostrarInvestigador() {
		if (investigador != null ) {
			System.out.println("Asesor cientifico: " + investigador);
		}else {
			System.out.println("Sin asesor cientifico");
		}
	}
	
	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del video educativo:");
		System.out.println("ID: " + getId());
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Duracion: " + getDuracionEnMinutos() + " min");

		System.out.println("Genero: " + getGenero());
		System.out.println("Tema: " + tema);
		System.out.println("Nivel educativo: " + nivelEducativo);

		System.out.println();

	}
}
