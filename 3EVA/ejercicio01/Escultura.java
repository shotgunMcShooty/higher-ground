package ejercicio01;

public class Escultura extends Obra {

	/**
	 * Definici�n de atributos
	 */
	private String materialCreacion;
	private int altura;
	
	/**
	 * Definici�n de constructores
	 */
	public Escultura() {
	}

	public Escultura(String titulo, String autor, int numeroInventario, int a�oCreacion, String materialCreacion, int altura) {
		super(titulo, autor, numeroInventario, a�oCreacion);
		this.materialCreacion = materialCreacion;
		this.altura = altura;
	}

	/**
	 * M�todos get y set
	 */
	public String getMaterialCreacion() {
		return materialCreacion;
	}

	public void setMaterialCreacion(String materialCreacion) {
		this.materialCreacion = materialCreacion;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	/**
	 * M�todo muestra que solo saca la informacion propia de la clase
	 */
	public String muestra() {
		return materialCreacion + "\taltura\t" + altura;
	}

	/**
	 * M�todo equals
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!super.equals(o))
			return false;
		if (getClass() != o.getClass())
			return false;
		Escultura other = (Escultura) o;
		if (altura != other.altura)
			return false;
		if (materialCreacion == null) {
			if (other.materialCreacion != null)
				return false;
		} else if (!materialCreacion.equals(other.materialCreacion))
			return false;
		return true;
	}

	/**
	 * M�todo toString para sacar los datos de la clase
	 */
	@Override
	public String toString() {
		return "Escultura\n"
				+ super.toString() + materialCreacion + "\taltura\t" + altura + "\n"
				+ muestra();
	}
}