package ejercicio4_museo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Artista {
	private String nombre, lugarNac;
	private Date nacimiento, muerte;
	
	public Artista() {
	}

	public Artista(String nombre, String lugarNac, Date nacimiento, Date muerte) {
		super();
		this.nombre = nombre;
		this.lugarNac = lugarNac;
		this.nacimiento = nacimiento;
		this.muerte = muerte;
	}

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
	
	public String toString() {
		SimpleDateFormat fecha = new SimpleDateFormat("dd/mm/yyyy");
		String nacimiento = fecha.format(this.nacimiento);
		String muerte = fecha.format(this.muerte);
		return "Nombre: "+nombre+"\nLugar de nacimiento: "+lugarNac+"\nNacimiento: "+nacimiento+
				"Fallecimiento: "+muerte;
	}
}
