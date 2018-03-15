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
	
	public double getAlto() {
		return alto;
	}

	public double getAncho() {
		return ancho;
	}

	public String Muestra() {
		return super.Muestra()+"\n\nDimensiones: "+alto+"cm x"+ancho+"cm\nSoporte: "+soporte;
	}
	
	public String toString() {
		return Muestra();
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(o == this) return true;
		if(o instanceof Pintura) {
			Pintura otro = (Pintura) o;
			if(super.equals(otro) && otro.alto==this.alto && otro.ancho==this.ancho && otro.soporte.equals(soporte))
				return true;
			else 
				return false;
		}else
			return false;
	}
}
