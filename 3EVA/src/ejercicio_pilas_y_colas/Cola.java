package ejercicio_pilas_y_colas;

public class Cola extends ColeccionSimple {

	@Override
	public boolean anadir(Object o) {
		return super.getLista().offerLast(o);
	}

}
