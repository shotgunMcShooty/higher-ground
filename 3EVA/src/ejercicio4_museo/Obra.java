package ejercicio4_museo;

public class Obra {
	protected String titulo;
	protected long nInventario;
	protected Artista autor;
	protected int anio;
	
	
	public Obra(String titulo, long nInventario, int anio) {
		this.titulo = titulo;
		this.nInventario = nInventario;
		this.anio = anio;
	}


	public Obra(String titulo, long nInventario, Artista autor, int anio) {
		this.titulo = titulo;
		this.nInventario = nInventario;
		this.autor = autor;
		this.anio = anio;
	}
	
	public void setAutor(Artista autor) {
		this.autor=autor;
	}
	
	public String Muestra() {
		return "Título: "+titulo+"\nNumero de inventario: "+nInventario+"\nAño: "+anio+
				"\nAutor:\n"+autor;
	}
	
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
	
	public String toString() {
		return Muestra();
	}
}
