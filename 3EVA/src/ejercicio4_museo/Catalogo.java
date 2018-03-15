package ejercicio4_museo;

import java.util.Vector;

public class Catalogo {
	private Vector<Obra>catalogo;
	
	public Catalogo() {
		catalogo = new Vector<Obra>(10,1);
	}
	
	public void anadeObra(Obra o) {
		catalogo.add(o);
	}
	
	public boolean eliminaObra(long nInv) {
		for(int i=0; i<catalogo.size();i++) {
			if(catalogo.get(i).nInventario==nInv) {
				catalogo.removeElementAt(i);//Elimina el objeto en la posicion indicada y reduce el tamaño del vector
				return true;
			}
		}
		return false;
	}
	
	public String buscaObra(long nInv) {
		for(int i=0;i<catalogo.size();i++) {
			if(catalogo.get(i).nInventario==nInv)
				return catalogo.get(i).Muestra();
		}
		return "Obra no encontrada";
	}
	
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
