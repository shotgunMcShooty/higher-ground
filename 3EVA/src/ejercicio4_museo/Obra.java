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
	 * N�mero de identificaci�n de la obra.
	 */
	protected long nInventario;
	/**
	 * Artista que cre� la obra.
	 * @see ejercicio4_museo#Artista
	 */
	protected Artista autor;
	/**
	 * A�o en el que se realiz� la obra.
	 */
	protected int anio;
	
	/**
	 * Constructor con tres par�metros. Crea una pieza de museo.<p>
	 * <strong>No</strong> se pide el autor.
	 * @param titulo T�tulo de la obra.
	 * @param nInventario N�mero de identificaci�n de la obra.
	 * @param anio A�o de realizaci�n de la obra.
	 */
	public Obra(String titulo, long nInventario, int anio) {
		this.titulo = titulo;
		this.nInventario = nInventario;
		this.anio = anio;
	}

	/**
	 * Constructor con cuatro par�metros. Crea una pieza de museo.<p>
	 * Es necesario indicar el autor.
	 * @param titulo T�tulo de la obra.
	 * @param nInventario N�mero de identificaci�n de la obra.
	 * @param autor Artista que realiz� la obra.
	 * @param anio A�o de realizaci�n de la obra.
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
	 * M�todo que imprime los datos de la obra.
	 * @return Todos los datos de la obra.
	 */
	public String Muestra() {
		return "T�tulo: "+titulo+"\nNumero de inventario: "+nInventario+"\nA�o: "+anio+
				"\nAutor:\n"+autor;
	}
	/**
	 * M�todo equals. Compara que dos objetos sean iguales.
	 * @param o Objeto que recibe, puede ser de cualquier tipo.
	 * @return <ul>
	 * 				<li><strong>true:</strong> Los atributos del objeto que se recibe tienen los mismos valores que los del objeto con el se compara.</li>
	 * 				<li><strong>false:</strong> El objeto no es del tipo Obra, no indica ninguna posicion de memoria o tiene valores distintos.</li>
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
	 * M�todo que llama a muestra()
	 * @return La cadena de texto generada en el m�todo muestra()
	 */
	public String toString() {
		return Muestra();
	}
}
