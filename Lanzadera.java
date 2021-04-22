public class Lanzadera {

	public static void main(String[] args) {
		
		
		Fontanero fontanero = new Fontanero("Paco", "Gomez", 1200);
		Fontanero fontanero2 = new Fontanero("Emilio", "GP", 1500);
		
		Pintor pintor = new Pintor("Fer", "Perez", 3800);
		Pintor pintor2 = new Pintor("Jurgen", "Klov", 2680);

		Cliente cliente = new Cliente("Carla", "Sanchez", "Av CID 78 8º");
		Cliente cliente2 = new Cliente("Marina", "RJ", "C/VIllamayor 21 Bajo");

		Empresa empresa = new Empresa();
		
		empresa.agregarFontaneros(fontanero);
		empresa.agregarFontaneros(fontanero2);
		empresa.agregarPintor(pintor);
		empresa.agregarPintor(pintor2);
		empresa.agregarCliente(cliente);
		empresa.agregarCliente(cliente2);
		
		fontanero.mostrarAlta();
		empresa.mostrarFontaneros();
		
		fontanero.trabajar();
		fontanero.pagarSueldo();
		fontanero2.trabajar();
		fontanero2.pagarSueldo();
		
		pintor.mostrarAlta();
		empresa.mostrarPintor();
		
		pintor.trabajar();
		pintor.pagarSueldo();
		pintor2.trabajar();
		pintor2.pagarSueldo();
		
		cliente.mostrarAlta();
		empresa.mostrarCliente();
		
		cliente.trabajar();
		cliente.pagarSueldo();
		cliente2.trabajar();
		cliente2.pagarSueldo();

	}

}
