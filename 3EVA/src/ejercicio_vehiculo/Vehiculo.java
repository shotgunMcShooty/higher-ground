package ejercicio_vehiculo;

public abstract class Vehiculo {
	protected String matricula;
	protected int velocidad = 0;
	
	public Vehiculo(String matricula) {
		this.matricula=matricula;
	}
	
	public abstract int acelerar(int kmh);
	
	public void setVelocidad(int velocidad) {
		this.velocidad=velocidad;
	}
	
	public String toString() {
		return "N�mero de matr�cula: "+matricula+"\nVelocidad: "+velocidad+" km/h";
	}
}
