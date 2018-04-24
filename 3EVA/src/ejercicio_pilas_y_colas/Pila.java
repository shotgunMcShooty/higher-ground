package ejercicio_pilas_y_colas;

public class Pila extends ColeccionSimple {
	
	@Override
	public boolean anadir(Object o) {
		return super.getLista().offerFirst(o);
	}

}
