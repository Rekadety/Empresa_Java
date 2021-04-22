
abstract public class Persona {

	private String nombre;
	private String apellidos;
	
	public abstract void mostrarAlta();
	
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void mostrar() {
		System.out.println();
		System.out.println("Nombre: " +this.nombre);
		System.out.println("Apellidos: " +this.apellidos);
		
	}
}
