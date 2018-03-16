package ejercicio01;

public class Pintura extends Obra {

	/**
	 * Definición de atributos
	 */
	private int alto, ancho;
	private String tipoSoporte;
	
	/**
	 * Definición de constructores
	 */
	public Pintura() {
	}

	public Pintura(String titulo, String autor, int numeroInventario, int añoCreacion, int alto, int ancho, String tipoSoporte) {
		super(titulo, autor, numeroInventario, añoCreacion);
		this.alto = alto;
		this.ancho = ancho;
		this.tipoSoporte = tipoSoporte;
	}

	/**
	 * Métodos get y set
	 */
	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public String getTipoSoporte() {
		return tipoSoporte;
	}

	public void setTipoSoporte(String tipoSoporte) {
		this.tipoSoporte = tipoSoporte;
	}
	
	/**
	 * Método muestra que solo saca la informacion propia de la clase
	 */
	public String muestra() {
		return "altura\t" + alto + "\tanchura\t" + ancho + "\ttipoSoporte\t" + tipoSoporte;
	}

	/**
	 * Método equals
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!super.equals(o))
			return false;
		if (getClass() != o.getClass())
			return false;
		Pintura other = (Pintura) o;
		if (alto != other.alto)
			return false;
		if (ancho != other.ancho)
			return false;
		if (tipoSoporte == null) {
			if (other.tipoSoporte != null)
				return false;
		} else if (!tipoSoporte.equals(other.tipoSoporte))
			return false;
		return true;
	}

	/**
	 * Método toString para sacar los datos de la clase
	 */
	@Override
	public String toString() {
		return "Pintura\n" 
				+ super.toString() + "altura\t" + alto + "\tanchura\t" + ancho + "\ttipoSoporte\t" + tipoSoporte + "\n"
				+ muestra();
	}
}