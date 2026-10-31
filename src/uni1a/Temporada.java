package uni1a;

public class Temporada {
	private int numero;
	private String titulo;
	private int cantidadEpisodios;
	
	public Temporada (int numero, String titulo, int cantidadEpisodios) {
		this.numero = numero;
		this.titulo = titulo;
		this.cantidadEpisodios = cantidadEpisodios;	
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getCantidadEpisodios() {
		return cantidadEpisodios;
	}
	
	@Override
	public String toString() {
		return "Temporada " + numero + ": " + titulo + " (" + cantidadEpisodios + " episodios)";
	}
}
