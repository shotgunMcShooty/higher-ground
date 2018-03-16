package ejercicio01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Artista {

	/**
	 * Definición de atributos
	 */
	public String nombre, lugarNacimiento;
	public Date fechaNacimiento, fechaMuerte;
	
	/**
	 * Definición de constructores
	 */
	public Artista() {
	}

	public Artista(String nombre, String lugarNacimiento, Date fechaNacimiento, Date fechaMuerte) {
		this.nombre = nombre;
		this.lugarNacimiento = lugarNacimiento;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaMuerte = fechaMuerte;
	}

	/**
	 * Métodos get y set
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaMuerte() {
		return fechaMuerte;
	}

	public void setFechaMuerte(Date fechaMuerte) {
		this.fechaMuerte = fechaMuerte;
	}

	/**
	 * Método equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artista other = (Artista) obj;
		if (fechaMuerte == null) {
			if (other.fechaMuerte != null)
				return false;
		} else if (!fechaMuerte.equals(other.fechaMuerte))
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (lugarNacimiento == null) {
			if (other.lugarNacimiento != null)
				return false;
		} else if (!lugarNacimiento.equals(other.lugarNacimiento))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	/**
	 * Método toString para sacar los datos de la clase
	 */
	@Override
	public String toString() {
		SimpleDateFormat fecha = new SimpleDateFormat("dd/mm/yyyy");
		String fechaNacimiento = fecha.format(this.fechaNacimiento);
		String fechaMuerte = fecha.format(this.fechaMuerte);
		return nombre + "\t" + lugarNacimiento + fechaNacimiento + "\ta\t" + fechaMuerte;
	}

	
}