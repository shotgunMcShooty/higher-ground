package ejercicio_pilas_y_colas;

import java.util.Collection;
import java.util.LinkedList;

public abstract class ColeccionSimple {
	private LinkedList<Object> lista;
	
	public ColeccionSimple() {
		lista = new LinkedList<Object>();
	}
	
	public ColeccionSimple(Collection<Object> c) {
		lista = (LinkedList<Object>) c;
	}
	
	public LinkedList<Object> getLista() {
		return lista;
	}

	public boolean estaVacio() {
		if(lista == null) return true;
		for(int i = 0; i<lista.size();i++) {
			if(lista.get(i)!=null)
				return false;
		}
		return true;
	}
	
	public Object extraer() {
		return lista.pollFirst();
	}
	
	public Object primero() {
		return lista.peekFirst();
	}
	
	public abstract boolean anadir(Object o);
	
	public String toString() {
		String cadena="";
		for(int i=0;i<lista.size();i++) {
			cadena+=lista.get(i).toString();
		}
		return cadena;
	}
}
