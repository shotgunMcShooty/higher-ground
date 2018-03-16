package ejercicio01;

public class Escultura extends Obra {

	/**
	 * Definición de atributos
	 */
	private String materialCreacion;
	private int altura;
	
	/**
	 * Definición de constructores
	 */
	public Escultura() {
	}

	public Escultura(String titulo, String autor, int numeroInventario, int añoCreacion, String materialCreacion, int altura) {
		super(titulo, autor, numeroInventario, añoCreacion);
		this.materialCreacion = materialCreacion;
		this.altura = altura;
	}

	/**
	 * Métodos get y set
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
	 * Método muestra que solo saca la informacion propia de la clase
	 */
	public String muestra() {
		return materialCreacion + "\taltura\t" + altura;
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
	 * Método toString para sacar los datos de la clase
	 */
	@Override
	public String toString() {
		return "Escultura\n"
				+ super.toString() + materialCreacion + "\taltura\t" + altura + "\n"
				+ muestra();
	}
}