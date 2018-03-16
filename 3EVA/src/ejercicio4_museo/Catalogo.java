package ejercicio4_museo;

import java.util.Vector;
/**
 * Clase catálogo. Almacena la información de varias obras.
 * @author Leonardo
 *@see Vector
 */
public class Catalogo {
	/**
	 * Almacena obras de arte
	 */
	private Vector<Obra>catalogo;
	/**
	 * Constructor vacío. Crea un nuevo vector.
	 */
	public Catalogo() {
		catalogo = new Vector<Obra>(10,1);
	}
	/**
	 * Método que añade una obra de arte al museo. Se comprobará que la obra no exista antes de añadirla e informará al usuario si se añadió o no.
	 * @param o Obra que se añadirá
	 * @return <ul>
	 * <li><strong>true:</strong> La obra que se quiere añadir no había sido añadida anteriormente.</li>
	 * <li><strong>false:</strong> La obra ya ha sido dado de alta</li>
	 * </ul>
	 * @throws IndexOutOfBoundsException
	 */
	public boolean anadeObra(Obra o) throws IndexOutOfBoundsException{
		for(int i=0;i<catalogo.size();i++) {
			if(o instanceof Pintura && catalogo.get(i) instanceof Pintura) {
				Pintura p = (Pintura) o;
				if(p.equals(catalogo.get(i)))
					return false;
			}else if(o instanceof Escultura && catalogo.get(i) instanceof Escultura) {
				Escultura e = (Escultura) o;
				if(e.equals(catalogo.get(i)))
					return false;
			}
		}
		catalogo.add(o);
		return true;
	}
	/**
	 * Método que elimina una obra de arte. Se indicará el número de inventario. La obra ha de existir en la colección.
	 * @param nInv Número de identificación de la obra.
	 * @return <ul>
	 * <li><strong>true:</strong> La obra ha sido eliminado.</li>
	 * <li><strong>false:</strong> La obra no existía cuando se intentó borrar</li>
	 * </ul>
	 */
	public boolean eliminaObra(long nInv) {
		for(int i=0; i<catalogo.size();i++) {
			if(catalogo.get(i).nInventario==nInv) {
				catalogo.removeElementAt(i);//Elimina el objeto en la posicion indicada y reduce el tamaño del vector
				return true;
			}
		}
		return false;
	}
	/**
	 * Método que busca una obra en la colección.
	 * @param nInv Número de identificación de la obra.
	 * @return Los datos de la obra a buscar, si existe en la colección.
	 */
	public String buscaObra(long nInv) {
		for(int i=0;i<catalogo.size();i++) {
			if(catalogo.get(i).nInventario==nInv)
				return catalogo.get(i).Muestra();
		}
		return "Obra no encontrada";
	}
	/**
	 * Método que devuelve la suma de las superficies de todas las obras de la que se pueda obtener superficie.<p>
	 * Se comprobará que cuales de las obras sean del tipo Pintura.
	 * @return Superficie combinada de todas las Pinturas.
	 */
	public double superficie() {
		double total =0;
		for(int i=0;i<catalogo.size();i++) {
			if(catalogo.get(i) instanceof Pintura) {
				Pintura p = (Pintura) catalogo.get(i);
				total+=p.getAlto()*p.getAncho();
			}
		}
		return total;
	}
	/**
	 * Método que devuelve la altura de la escultura más alta.<p>
	 * Se comprabará que las obras son de tipo Escultura.
	 * @return El tamaño de la estructura de mayor tamaño.
	 */
	public double masAlta() {
		double mayor=-1;
		for(int i =0; i<catalogo.size();i++) {
			if(catalogo.get(i) instanceof Escultura) {
				Escultura e = (Escultura) catalogo.get(i);
				if(e.getAltura()>mayor)
					mayor=e.getAltura();
			}
		}
		return mayor;
	}
}
