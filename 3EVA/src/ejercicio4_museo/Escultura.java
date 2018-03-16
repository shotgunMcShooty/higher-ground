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
	 * Tamaño de la escultura
	 */
	private double altura;
	
	/**
	 * Constructor de cinco parámetros. Crea una escultura <strong>sin</strong> especificar un autor.
	 * @param titulo Título de la obra.
	 * @param nInventario Número de identificación de la escultura.
	 * @param anio Año de realización de la escultura.
	 * @param material Material del que está hecho la escultura.
	 * @param altura Altura de la escultura.
	 */
	public Escultura(String titulo, long nInventario, int anio, String material, double altura) {
		super(titulo, nInventario, anio);
		this.material = material;
		this.altura = altura;
	}
	/**
	 * Constructor con cuatro parámetros. Crea una pieza de museo.<p>
	 * Es necesario indicar el autor.
	 * @param titulo Título de la obra.
	 * @param nInventario Número de identificación de la escultura.
	 * @param autor Artista que realizó la escultura.
	 * @param anio Año de realización de la escultura.
	 * @param material Material del que está hecho la escultura.
	 * @param altura Altura de la escultura.
	 * @see ejercicio4_museo#Artista
	 */
	public Escultura(String titulo, long nInventario, Artista autor, int anio, String material, double altura) {
		super(titulo, nInventario, autor, anio);
		this.material=material;
		this.altura=altura;
	}
	/**
	 * Método getter de la altura de la obra.
	 * @return La altura de la escultura.
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * Método que imprime los datos de la escultura.
	 * @return Todos los datos de la escultura.
	 */
	public String Muestra() {
		return super.Muestra()+"\n\nAltura: "+altura+"cm\nMaterial: "+material;
	}
	/**
	 * Método que llama a muestra()
	 * @return La cadena de texto generada en el método muestra()
	 */
	public String toString() {
		return Muestra();
	}
	/**
	 * Método equals. Compara que dos objetos sean iguales.
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
