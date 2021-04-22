import java.util.ArrayList;

public class Empresa {

	private ArrayList<Fontanero> fontaneros;
	private ArrayList<Pintor> pintores;
	private ArrayList<Cliente> clientes;
	
	public Empresa() {
		this.fontaneros = new ArrayList<Fontanero> ();
		this.pintores = new ArrayList<Pintor> ();
		this.clientes = new ArrayList<Cliente> ();
	}

	public ArrayList<Fontanero> getFontaneros() {
		return fontaneros;
	}

	public void setFontaneros(ArrayList<Fontanero> fontaneros) {
		this.fontaneros = fontaneros;
	}

	public ArrayList<Pintor> getPintores() {
		return pintores;
	}

	public void setPintores(ArrayList<Pintor> pintores) {
		this.pintores = pintores;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public void agregarFontaneros(Fontanero f) {
		this.fontaneros.add(f);
	}
	
	public void agregarPintor(Pintor p) {
		this.pintores.add(p);
	}
	
	public void agregarCliente(Cliente c) {
		this.clientes.add(c);
	}
	
	public void mostrarFontaneros() {
		System.out.println();
		System.out.println("--LISTA DE FONTANEROS--");
		System.out.println();
		
		for (Fontanero fontanero : this.fontaneros) {
			fontanero.mostrar();
		}
	}
	public void mostrarPintor() {
		System.out.println();
		System.out.println("--LISTA DE PINTORES--");
		System.out.println();
		
		for (Pintor pintor : this.pintores) {
			pintor.mostrar();
		}
	}
	public void mostrarCliente() {
		System.out.println();
		System.out.println("--LISTA DE CLIENTES--");
		System.out.println();
		
		for (Cliente cliente : this.clientes) {
			cliente.mostrar();
		}
	}
}
