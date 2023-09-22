
public class HiloEsPrimo implements Runnable{
	
	private long num;
	
	public HiloEsPrimo(long num) {
		this.num = num;
	}

	@Override
	public void run() {
		
		boolean esPrimo = false;
		
		System.out.println("Arrancando hilo:" + Thread.currentThread().getName());
		System.out.println("Se va a comprobar si el número " + num + " es primo.");
	    long iniTime = System.currentTimeMillis();
	    


		for (int i=2; i<num ; i++ ) {
			
			float aux = (float)num/i;
			
			if (aux == (int)aux) {
				esPrimo = false;
				break;
			}
			
			else
				esPrimo = true;	
		}
		
	    
	    long finTime = System.currentTimeMillis();
		if (esPrimo) System.out.println("El numero " + num + " es primo");
		else System.out.println("El numero " + num + " no es primo");
		System.out.println("Numero procesado por el hilo: " +  Thread.currentThread().getName());
	    System.out.println("El tiempo de procesamiento es: " + (finTime - iniTime) + " milisegundos");
	    System.out.println("");
	

		
	}

}
