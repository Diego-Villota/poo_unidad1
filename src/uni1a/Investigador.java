package uni1a;

public class Investigador {
	private String nombre;
	private String especializacion;
	
	public Investigador(String nombre, String especializacion) {
		this.nombre = nombre;
		this.especializacion = especializacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getEspecializacion() {
		return especializacion;
	}
	
	@Override
	public String toString() {
		return nombre + " - " + especializacion;
	}
}
