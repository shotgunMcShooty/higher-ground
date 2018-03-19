package ejercicio_vehiculo;

public class Coche extends Vehiculo {
	private int numPuertas;
	public Coche(String matricula, int numPuertas) {
		super(matricula);
		this.numPuertas=numPuertas;
	}
	
	public int getNumPuertas() {
		return numPuertas;
	}
	
	@Override
	public int acelerar(int kmh) {
		this.velocidad+=kmh;
		return velocidad;
	}
	
	public String toString() {
		return super.toString()+"\nNumero de puertas: "+getNumPuertas();
	}
}
