package ejercicio4_museo;
/**
 * Clase Obra,<p>
 * es una clase abstracta que sirve de plantilla para sus clases hijas.
 * @author Leonardo
 *@see ejercicio4_museo#Artista
 *@see ejercicio4_museo#Pintura
 *@see ejercicio4_museo#Escultura
 */
public abstract class Obra {
	/**
	 * Atributo Nombre de la obra.
	 */
	protected String titulo;
	/**
	 * Número de identificación de la obra.
	 */
	protected long nInventario;
	/**
	 * Artista que creó la obra.
	 * @see ejercicio4_museo#Artista
	 */
	protected Artista autor;
	/**
	 * Año en el que se realizó la obra.
	 */
	protected int anio;
	
	/**
	 * Constructor con tres parámetros. Crea una pieza de museo.<p>
	 * <strong>No</strong> se pide el autor.
	 * @param titulo Título de la obra.
	 * @param nInventario Número de identificación de la obra.
	 * @param anio Año de realización de la obra.
	 */
	public Obra(String titulo, long nInventario, int anio) {
		this.titulo = titulo;
		this.nInventario = nInventario;
		this.anio = anio;
	}

	/**
	 * Constructor con cuatro parámetros. Crea una pieza de museo.<p>
	 * Es necesario indicar el autor.
	 * @param titulo Título de la obra.
	 * @param nInventario Número de identificación de la obra.
	 * @param autor Artista que realizó la obra.
	 * @param anio Año de realización de la obra.
	 * @see ejercicio4_museo#Artista
	 */
	public Obra(String titulo, long nInventario, Artista autor, int anio) {
		this.titulo = titulo;
		this.nInventario = nInventario;
		this.autor = autor;
		this.anio = anio;
	}
	/**
	 * Permite vincular (o reemplazar) un autor a una obra ya creada.
	 * @param autor Nuevo autor de la obra.
	 */
	public void setAutor(Artista autor) {
		this.autor=autor;
	}
	/**
	 * Método que imprime los datos de la obra
	 * @return Todos los datos de la obra.
	 */
	public String Muestra() {
		return "Título: "+titulo+"\nNumero de inventario: "+nInventario+"\nAño: "+anio+
				"\nAutor:\n"+autor;
	}
	/**
	 * Método equals. Compara que dos objetos sean iguales.
	 * @param o Objeto que recibe, puede ser de cualquier tipo.
	 * @return <ul>
	 * 				<li><strong>true:</strong> Los atributos del objeto que se recibe tienen los mismos valores que los del objeto con el se compara.</li>
	 * 				<li><strong>false:</strong> El objeto no es del tipo Artista, no indica ninguna posicion de memoria o tiene valores distintos.</li>
	 * 			</ul>
	 * @see Object
	 */
	public boolean equals(Object o) {
		if(o == null) return false;
		if(o == this ) return true;
		if(o instanceof Obra) {
			Obra otro = (Obra) o;
			if(otro.anio==this.anio && otro.nInventario==this.nInventario && otro.titulo.equals(this.titulo) && otro.autor.equals(this.autor))
				return true;
			else
				return false;
		}else
			return false;
	}
	/**
	 * Método que llama a muestra()
	 * @return La cadena de texto generada en el método muestra()
	 */
	public String toString() {
		return Muestra();
	}
}
