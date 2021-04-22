
public class Cliente extends Persona implements ITrabajador{
	
	private String direccion;

	public Cliente(String nombre, String apellidos, String direccion) {
		super(nombre, apellidos);
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void mostrar() {
		
		System.out.println();
		System.out.println("CLIENTE");
		super.mostrar();
		System.out.println("Direccion: " +this.direccion);
		
	}
	
	public void mostrarAlta() {
		System.out.println("------------------------------------------------------");
		System.out.println("Un nuevo Cliente en la empresa!");
	}

	@Override
	public void trabajar() {
		
		System.out.println();
		System.out.println("El cliente trabajará en el sector 7!");	
		
	}

	@Override
	public void pagarSueldo() {
		
		System.out.println();
		System.out.println("El cliente ha recibideo el pago de este mes " +Math.floor(Math.random()*1000+2000));
		//Genera un valor entre 0 y 1000 y le suma 2000
	}
}
