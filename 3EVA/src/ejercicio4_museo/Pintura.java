package ejercicio4_museo;
/**
 * Clase Pintura,<p>
 * crea objetos que son pinturas.
 * @version 15-03-18
 * @author Leonardo
 *
 */
public class Pintura extends Obra {
	/**
	 * Indica el medio sobre el que se ha realizado la pintura.
	 */
	private String soporte;
	/**
	 * Indica el alto del cuadro.
	 */
	private double alto;
	/**
	 * Indica el ancho del cuadro.
	 */
	private double ancho;
	/**
	 * Constructor con siete parámetros. El autor es obligatorio
	 * @param titulo Título del cuadro.
	 * @param nInventario Número de identificación del cuadro.
	 * @param autor Artista que realizó el cuadro.
	 * @param anio Año en que se realizó el cuadro.
	 * @param ancho Ancho del cuadro.
	 * @param alto Alto del cuadro.
	 * @param soporte Soporte en el que se realizó la obra.
	 */
	public Pintura(String titulo, long nInventario, Artista autor, int anio, double ancho, double alto, String soporte) {
		super(titulo, nInventario, autor, anio);
		this.ancho=ancho;
		this.alto=alto;
		this.soporte=soporte;
	}
	/**
	 * Contructor con seis parámatros. Crea un cuadro <strong>sin</strong> saber autor.
	 * @param titulo Título del cuadro.
	 * @param nInventario Número de identificación del cuadro.
	 * @param anio Año en que se realizó el cuadro.
	 * @param ancho Ancho del cuadro.
	 * @param alto Alto del cuadro.
	 * @param soporte Soporte en el que se realizó la obra.
	 */
	public Pintura(String titulo, long nInventario, int anio, double ancho, double alto, String soporte) {
		super(titulo, nInventario, anio);
		this.ancho=ancho;
		this.alto=alto;
		this.soporte=soporte;
	}
	/**
	 * Método getter del alto de la obra.
	 * @return El alto del cuadro.
	 */
	public double getAlto() {
		return alto;
	}
	/**
	 * Método getter del ancho de la obra.
	 * @return El ancho del cuadro.
	 */
	public double getAncho() {
		return ancho;
	}
	/**
	 * Método que imprime los datos de la obra.
	 * @return Todos los datos del cuadro.
	 */
	public String Muestra() {
		return super.Muestra()+"\n\nDimensiones: "+alto+"cm x"+ancho+"cm\nSoporte: "+soporte;
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
	 * 	<li><strong>false:</strong> El objeto no es del tipo Pintura, no indica ninguna posicion de memoria o tiene valores distintos.</li>
	 * 	</ul>
	 * @see Object
	 */
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
