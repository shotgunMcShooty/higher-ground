package ejercicio4_museo;
/**
 * Clse Pintura,<p>
 * crea objetos que son esculturas.
 * @author Leonardo
 * @version 15-03-18
 *@see ejercicio4_museo#Obra
 */
public class Escultura extends Obra {
	/**
	 * Indica el tipo de material de la escultura
	 */
	private String material;
	/**
	 * Tama�o de la escultura
	 */
	private double altura;
	
	/**
	 * Constructor de cinco par�metros. Crea una escultura <strong>sin</strong> especificar un autor.
	 * @param titulo T�tulo de la obra.
	 * @param nInventario N�mero de identificaci�n de la escultura.
	 * @param anio A�o de realizaci�n de la escultura.
	 * @param material Material del que est� hecho la escultura.
	 * @param altura Altura de la escultura.
	 */
	public Escultura(String titulo, long nInventario, int anio, String material, double altura) {
		super(titulo, nInventario, anio);
		this.material = material;
		this.altura = altura;
	}
	/**
	 * Constructor con cuatro par�metros. Crea una pieza de museo.<p>
	 * Es necesario indicar el autor.
	 * @param titulo T�tulo de la obra.
	 * @param nInventario N�mero de identificaci�n de la escultura.
	 * @param autor Artista que realiz� la escultura.
	 * @param anio A�o de realizaci�n de la escultura.
	 * @param material Material del que est� hecho la escultura.
	 * @param altura Altura de la escultura.
	 * @see ejercicio4_museo#Artista
	 */
	public Escultura(String titulo, long nInventario, Artista autor, int anio, String material, double altura) {
		super(titulo, nInventario, autor, anio);
		this.material=material;
		this.altura=altura;
	}
	/**
	 * M�todo getter de la altura de la obra.
	 * @return La altura de la escultura.
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * M�todo que imprime los datos de la escultura.
	 * @return Todos los datos de la escultura.
	 */
	public String Muestra() {
		return super.Muestra()+"\n\nAltura: "+altura+"cm\nMaterial: "+material;
	}
	/**
	 * M�todo que llama a muestra()
	 * @return La cadena de texto generada en el m�todo muestra()
	 */
	public String toString() {
		return Muestra();
	}
	/**
	 * M�todo equals. Compara que dos objetos sean iguales.
	 * @param o Objeto que recibe, puede ser de cualquier tipo.
	 * @return <ul>
	 * 	<li><strong>true:</strong> Los atributos del objeto que se recibe tienen los mismos valores que los del objeto con el se compara.</li>
	 * 	<li><strong>false:</strong> El objeto no es del tipo Escultura, no indica ninguna posicion de memoria o tiene valores distintos.</li>
	 * 	</ul>
	 * @see Object
	 */
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
