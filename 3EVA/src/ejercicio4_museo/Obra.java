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
		return "T�tulo: "+titulo+"\nNumero de inventario: "+nInventario+"\nA�o: "+anio+
				"\nAutor:\n"+autor;
	}
}
