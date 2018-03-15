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
	
	public String toString() {
		return Muestra();
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(o == this) return true;
		if(o instanceof Escultura) {
			Escultura otro = (Escultura) o;
			if(super.equals(otro) && otro.altura==this.altura && otro.material.equals(this.material))
				return true;
			else
				return false;
		}else
			return false;
	}
}
