package ejercicio_pilas_y_colas;

public class Test {
	
	public static void rellenar(ColeccionSimple c) {
		for(int i=0;i<10;i++) {
			c.anadir(i+1);
		}
	}
	
	public static String imprimirYVaciar(ColeccionSimple c) {
		String cadena="";
		while(!c.estaVacio()) {
			cadena+=c.extraer()+"\n";
		}
		return cadena;
	}
	
	public static void main(String[] args) {
		Pila p = new Pila();
		rellenar(p);
		//System.out.println(imprimirYVaciar(p));
		Cola c = new Cola();
		rellenar(c);
		c.anadir("Goooooorudo");
		c.anadir(2.3);
		System.out.println(imprimirYVaciar(c));
	}
}
