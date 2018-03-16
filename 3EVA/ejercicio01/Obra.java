package ejercicio01;

public class Obra {

	/**
	 * Definición de atributos
	 */
	protected String titulo, autor;
	protected int numeroInventario, añoCreacion;
	
	/**
	 * Definición de constructores
	 */
	public Obra() {
	}

	public Obra(String titulo, String autor, int numeroInventario, int añoCreacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroInventario = numeroInventario;
		this.añoCreacion = añoCreacion;
	}

	/**
	 * Métodos get y set
	 */
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroInventario() {
		return numeroInventario;
	}

	public void setNumeroInventario(int numeroInventario) {
		this.numeroInventario = numeroInventario;
	}

	public int getAñoRealizacion() {
		return añoCreacion;
	}

	public void setAñoRealizacion(int añoRealizacion) {
		this.añoCreacion = añoRealizacion;
	}
	
	/**
	 * Método muestra que solo saca la informacion propia de la clase
	 */
	public String muestra() {
		return numeroInventario + "\t" + titulo + "\t" + añoCreacion + "\t" + autor + "\t";
	}

	/**
	 * Método equals
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Obra other = (Obra) o;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (añoCreacion != other.añoCreacion)
			return false;
		if (numeroInventario != other.numeroInventario)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	/**
	 * Método toString para sacar los datos de la clase
	 */
	@Override
	public String toString() {
		return numeroInventario + "\t" + titulo + "\t" + añoCreacion + "\t" + autor + "\t";
	}
}