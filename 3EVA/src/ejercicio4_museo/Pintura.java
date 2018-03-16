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
	 * Constructor con siete par�metros. El autor es obligatorio
	 * @param titulo T�tulo del cuadro.
	 * @param nInventario N�mero de identificaci�n del cuadro.
	 * @param autor Artista que realiz� el cuadro.
	 * @param anio A�o en que se realiz� el cuadro.
	 * @param ancho Ancho del cuadro.
	 * @param alto Alto del cuadro.
	 * @param soporte Soporte en el que se realiz� la obra.
	 */
	public Pintura(String titulo, long nInventario, Artista autor, int anio, double ancho, double alto, String soporte) {
		super(titulo, nInventario, autor, anio);
		this.ancho=ancho;
		this.alto=alto;
		this.soporte=soporte;
	}
	/**
	 * Contructor con seis par�matros. Crea un cuadro <strong>sin</strong> saber autor.
	 * @param titulo T�tulo del cuadro.
	 * @param nInventario N�mero de identificaci�n del cuadro.
	 * @param anio A�o en que se realiz� el cuadro.
	 * @param ancho Ancho del cuadro.
	 * @param alto Alto del cuadro.
	 * @param soporte Soporte en el que se realiz� la obra.
	 */
	public Pintura(String titulo, long nInventario, int anio, double ancho, double alto, String soporte) {
		super(titulo, nInventario, anio);
		this.ancho=ancho;
		this.alto=alto;
		this.soporte=soporte;
	}
	/**
	 * M�todo getter del alto de la obra.
	 * @return El alto del cuadro.
	 */
	public double getAlto() {
		return alto;
	}
	/**
	 * M�todo getter del ancho de la obra.
	 * @return El ancho del cuadro.
	 */
	public double getAncho() {
		return ancho;
	}
	/**
	 * M�todo que imprime los datos de la obra.
	 * @return Todos los datos del cuadro.
	 */
	public String Muestra() {
		return super.Muestra()+"\n\nDimensiones: "+alto+"cm x"+ancho+"cm\nSoporte: "+soporte;
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
