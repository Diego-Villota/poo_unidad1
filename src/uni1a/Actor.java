package uni1a;

public class Actor {
	private	String nombre;
	private String nacionalidad;
	
	public Actor(String nombre, String nacionalidad) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	
	@Override
	public String toString() {
		return nombre + " (" + nacionalidad +  ")";
	}
}
