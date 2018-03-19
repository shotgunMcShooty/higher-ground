package ejercicio4_museo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase Artista, sirve para crear Artistas de cuadros y modificar sus datos.
 * @author Leonardo
 * @version 15-03-2018
 * @see Date
 *
 */
public class Artista {
	/**
	 * Atributo nombre del artista.
	 */
	private String nombre;
	/**
	 * Atributo lugar de nacimiento del artista.
	 */
	private String lugarNac;
	/**
	 * Atributo fecha de nacimiento del artista.
	 */
	private Date nacimiento;
	/**
	 * Atributo fecha de defuncion del artista.
	 */
	private Date muerte;
	/**
	 * Constructor por defecto.
	 */
	public Artista() {
	}
	/**
	 * Contructor con 4 parámetros.
	 * Crea un artista con todos los datos.
	 * @param nombre Nombre del artista.
	 * @param lugarNac Lugar de nacimiento del artista.
	 * @param nacimiento Fecha de nacimiento.
	 * @param muerte Fecha de defunción.
	 */
	public Artista(String nombre, String lugarNac, Date nacimiento, Date muerte) {
		this.nombre = nombre;
		this.lugarNac = lugarNac;
		this.nacimiento = nacimiento;
		this.muerte = muerte;
	}
	
	//Metodos setters y getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugarNac() {
		return lugarNac;
	}

	public void setLugarNac(String lugarNac) {
		this.lugarNac = lugarNac;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public Date getMuerte() {
		return muerte;
	}

	public void setMuerte(Date muerte) {
		this.muerte = muerte;
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
		if(o instanceof Artista) {
			Artista otro = (Artista) o;
			if(otro.lugarNac.equals(this.lugarNac) && otro.muerte.equals(this.muerte) && otro.nacimiento.equals(this.nacimiento) && otro.nombre.equals(this.nombre))
				return true;
			else
				return false;
		}else
			return false;
	}
	/**
	 * Método que llama a toString
	 * @return La cadena de String generado en el método toString()
	 */
	public String Muestra() {
		return toString();
	}
	
	/**
	 * Método que imprime todos los datos del artista
	 * @return Los datos del artista
	 * @see SimpleDateFormat
	 */
	public String toString() {
		SimpleDateFormat fecha = new SimpleDateFormat("dd/mm/yyyy");
		String nacimiento = fecha.format(this.nacimiento);
		String muerte = fecha.format(this.muerte);
		return "Nombre: "+nombre+"\nLugar de nacimiento: "+lugarNac+"\nNacimiento: "+nacimiento+
				"\nFallecimiento: "+muerte;
	}
}
