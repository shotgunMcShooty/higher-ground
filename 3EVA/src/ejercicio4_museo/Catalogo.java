package ejercicio4_museo;

import java.util.Vector;
/**
 * Clase cat�logo. Almacena la informaci�n de varias obras.
 * @author Leonardo
 *@see Vector
 */
public class Catalogo {
	/**
	 * Almacena obras de arte
	 */
	private Vector<Obra>catalogo;
	/**
	 * Constructor vac�o. Crea un nuevo vector.
	 */
	public Catalogo() {
		catalogo = new Vector<Obra>(10,1);
	}
	/**
	 * M�todo que a�ade una obra de arte al museo. Se comprobar� que la obra no exista antes de a�adirla e informar� al usuario si se a�adi� o no.
	 * @param o Obra que se a�adir�
	 * @return <ul>
	 * <li><strong>true:</strong> La obra que se quiere a�adir no hab�a sido a�adida anteriormente.</li>
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
	 * M�todo que elimina una obra de arte. Se indicar� el n�mero de inventario. La obra ha de existir en la colecci�n.
	 * @param nInv N�mero de identificaci�n de la obra.
	 * @return <ul>
	 * <li><strong>true:</strong> La obra ha sido eliminado.</li>
	 * <li><strong>false:</strong> La obra no exist�a cuando se intent� borrar</li>
	 * </ul>
	 */
	public boolean eliminaObra(long nInv) {
		for(int i=0; i<catalogo.size();i++) {
			if(catalogo.get(i).nInventario==nInv) {
				catalogo.removeElementAt(i);//Elimina el objeto en la posicion indicada y reduce el tama�o del vector
				return true;
			}
		}
		return false;
	}
	/**
	 * M�todo que busca una obra en la colecci�n.
	 * @param nInv N�mero de identificaci�n de la obra.
	 * @return Los datos de la obra a buscar, si existe en la colecci�n.
	 */
	public String buscaObra(long nInv) {
		for(int i=0;i<catalogo.size();i++) {
			if(catalogo.get(i).nInventario==nInv)
				return catalogo.get(i).Muestra();
		}
		return "Obra no encontrada";
	}
	/**
	 * M�todo que devuelve la suma de las superficies de todas las obras de la que se pueda obtener superficie.<p>
	 * Se comprobar� que cuales de las obras sean del tipo Pintura.
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
	 * M�todo que devuelve la altura de la escultura m�s alta.<p>
	 * Se comprabar� que las obras son de tipo Escultura.
	 * @return El tama�o de la estructura de mayor tama�o.
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
