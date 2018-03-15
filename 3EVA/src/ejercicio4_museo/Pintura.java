package ejercicio4_museo;

public class Pintura extends Obra {
	private String soporte;
	private double alto, ancho;
	
	public Pintura(String titulo, long nInventario, Artista autor, int anio, double ancho, double alto, String soporte) {
		super(titulo, nInventario, autor, anio);
		this.ancho=ancho;
		this.alto=alto;
		this.soporte=soporte;
	}
	
	public Pintura(String titulo, long nInventario, int anio, double ancho, double alto, String soporte) {
		super(titulo, nInventario, anio);
		this.ancho=ancho;
		this.alto=alto;
		this.soporte=soporte;
	}
	
	public String toString() {
		return super.toString()+"\n\nDimensiones: "+alto+"cm x"+ancho+"cm\nSoporte: "+soporte;
	}
}