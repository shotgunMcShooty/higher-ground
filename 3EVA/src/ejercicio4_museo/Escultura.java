package ejercicio4_museo;

public class Escultura extends Obra {
	private String material;
	private double altura;
	
	public Escultura(String titulo, long nInventario, int anio, String material, double altura) {
		super(titulo, nInventario, anio);
		this.material = material;
		this.altura = altura;
	}

	public Escultura(String titulo, long nInventario, Artista autor, int anio, String material, double altura) {
		super(titulo, nInventario, autor, anio);
		this.material=material;
		this.altura=altura;
	}
	
	public double getAltura() {
		return altura;
	}

	public String Muestra() {
		return super.Muestra()+"\n\nAltura: "+altura+"cm\nMaterial: "+material;
	}
}
