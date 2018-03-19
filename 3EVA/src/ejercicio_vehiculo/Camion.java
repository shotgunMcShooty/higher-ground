package ejercicio_vehiculo;

public class Camion extends Vehiculo {
	private final String mensError1="El camión lleva remolque y va demasiado deprisa", mensError2 ="El camión ya tiene un remolque",
			mensError3="El camión no tenía remolque";
	private boolean hayRemolque;
	private Remolque remolque;
	public Camion(String matricula) {
		super(matricula);
		hayRemolque=false;
		remolque = null;
	}
	
	public boolean ponRemolque(Remolque remolque) throws RemolquException{
		if(hayRemolque)
			throw new RemolquException(mensError2);
		else {
			this.remolque=remolque;
			hayRemolque=true;
			return true;
		}
	}
	
	public boolean quitaRemolque() throws RemolquException{
		if(hayRemolque==false) 
			throw new RemolquException(mensError3);
		else {
			this.remolque=null;
			hayRemolque=false;
			return true;
		}
	}
	
	@Override
	public int acelerar(int kmh) throws DemasiadoRapidoException{
		if(this.velocidad+kmh>100 && hayRemolque)
			throw new DemasiadoRapidoException(mensError1);
		velocidad+=kmh;
		return velocidad;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nInformación del remolque:\n"+remolque.toString();
	}
}
