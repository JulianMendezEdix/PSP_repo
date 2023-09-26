
public class HiloEsPrimo implements Runnable{
	
	private long num;
	private boolean esPrimo = false;
	private long processTime;
	private String hiloQueProcesa; 
	
	public HiloEsPrimo(long num) {
		this.num = num;
	}

	
	@Override
	public void run() {
	    long iniTime = System.currentTimeMillis();
	    
			for (int i=2; i<num ; i++ ) {	
				
				long aux = num%i;			
				if (aux == 0) {
					esPrimo = false;
					break;
				}
				else
					esPrimo = true;	
			}		
			
		// El algortimo se puede mejorar gracias a gpt:
			/*This code snippet improves the prime-checking logic by eliminating the need to check divisibility for even numbers (except 2) and by checking divisibility only up to the square root of the number for efficiency.*/
			/*
			if (num <= 1) {
		        esPrimo = false; // 0 and 1 are not prime
		    } else if (num == 2) {
		        esPrimo = true; // 2 is prime
		    } else if (num % 2 == 0) {
		        esPrimo = false; // Even numbers (except 2) are not prime
		    } else {
		        esPrimo = true;
		        for (long i = 3; i * i <= num; i += 2) {
		            if (num % i == 0) {
		                esPrimo = false;
		                break;
		            }
		        }
		    }*/

	    long finTime = System.currentTimeMillis();	
	    hiloQueProcesa = Thread.currentThread().getName();
	    processTime =  (finTime - iniTime);
	}

	@Override
	public String toString() {
		return "HiloEsPrimo [num=" + num + ", hiloQueProcesa=" + hiloQueProcesa + ", processTime=" + processTime + "ms, esPrimo=" + esPrimo
				+ "]";
	}


	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public boolean isEsPrimo() {
		return esPrimo;
	}

	public void setEsPrimo(boolean esPrimo) {
		this.esPrimo = esPrimo;
	}

	public long getProcessTime() {
		return processTime;
	}

	public void setProcessTime(long processTime) {
		this.processTime = processTime;
	}

	public String getName() {
		return hiloQueProcesa;
	}

	public void setName(String name) {
		this.hiloQueProcesa = name;
	}

}
