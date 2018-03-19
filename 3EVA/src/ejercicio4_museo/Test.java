package ejercicio4_museo;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		//Pruebas basicas
		Artista a1 = new Artista("Paco", "Rumania", new Date(), new Date());
		Artista a2 = new Artista("Pepe","Valencia",new Date(),new Date());
		Obra o1 = new Pintura("Agua de vater", 1,2015,5,7,"Madera");
		Obra o4 = new Pintura("Agua de pipa", 4,2000,4,8,"Madera");
		Obra o2 = new Escultura("Tio de pie", 2, a2, 1995, "Mármol", 12);
		Obra o3 = new Escultura("Tio sentado", 3, a1, 1965, "Mármol", 5);
		Catalogo c = new Catalogo();
		c.anadeObra(o1);
		c.anadeObra(o2);
		c.anadeObra(o3);
		c.anadeObra(o4);
		System.out.println(c.superficie());
		System.out.println(c.masAlta());
		System.out.println(c.buscaObra(4));
	}

}
