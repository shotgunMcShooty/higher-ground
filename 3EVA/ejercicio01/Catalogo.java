package ejercicio01;

import java.util.ArrayList;

public class Catalogo {

	/**
	 * Definición de atributos
	 */
	private ArrayList<Obra> obras;
	
	/**
	 * Definición de constructores
	 */
	public Catalogo() {
	}
	
	public Catalogo(ArrayList<Obra> obras) {
		this.obras = new ArrayList<>();
	}

	/**
	 * Métodos get y set
	 */
	public ArrayList<Obra> getObras() {
		return obras;
	}

	public void setObras(ArrayList<Obra> obras) {
		this.obras = obras;
	}
	
	/**
	 * @return resultado (devuelve la suma de las superficies de las pinturas)
	 */
	public double superficie() {
		double resultado = 0;
		for (int i = 0; i < obras.size(); i++) {
			if (obras.get(i) instanceof Pintura) {
				Pintura p = (Pintura) obras.get(i);
				resultado += p.getAlto() * p.getAncho();
			}
		}
		return resultado;
	}
	
	/**
	 * @return mayor (devuelve la escultura mas alta)
	 */
	public double masAlta() {
		double mayor = -1;
		for (int i = 0; i < obras.size(); i++) {
			if (obras.get(i) instanceof Escultura) {
				Escultura e = (Escultura) obras.get(i);
				if (e.getAltura() > mayor) {
					mayor = e.getAltura();
				}
			}
		}
		return mayor;
	}
	
	/**
	 * Añade al ArrayList la obra introducida
	 */
	public void  anyadeObra(Obra o) {
		obras.add(o);
	}
	
	/**
	 * Elimina del ArrayList la obra introducida
	 */
	public void eliminaObra(Obra o) {
		obras.remove(o);
	}
	
	/**
	 * Busca en el ArrayList la obra introducida
	 */
	public void buscarObra(int o) {
		obras.get(o);
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
		Catalogo other = (Catalogo) o;
		if (obras == null) {
			if (other.obras != null)
				return false;
		} else if (!obras.equals(other.obras))
			return false;
		return true;
	}

	/**
	 * Método toString para sacar los datos de la clase
	 */
	@Override
	public String toString() {
		String cadena = "";
		for (int i = 0; i < obras.size(); i++) {
			cadena += obras.get(i) + "\n";
		}
		return cadena + superficie() + masAlta();
	}
}