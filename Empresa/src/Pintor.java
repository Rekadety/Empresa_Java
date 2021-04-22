
public class Pintor extends Persona implements ITrabajador{
	
	private int sueldo;

	public Pintor(String nombre, String apellidos, int sueldo) {
		super(nombre, apellidos);
		this.sueldo = sueldo;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public void mostrar() {
		
		System.out.println();
		System.out.println("PINTOR");
		super.mostrar();
		System.out.println("Sueldo: " +this.sueldo);
		
	}

	public void mostrarAlta() {
		System.out.println("------------------------------------------------------");
		System.out.println("Un nuevo Pintor en la empresa!");
	}

	@Override
	public void trabajar() {
		
		System.out.println();
		System.out.println("El pintor está pintando un nuevo cuadro es: " +this.getNombre());	
		
	}

	@Override
	public void pagarSueldo() {
		
		System.out.println();
		System.out.println("El pinto ha recibido el pago de este mes: " +this.getSueldo());
	}
}
