import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class HiloEsPrimo implements Runnable{
	
	private long num;
	private boolean esPrimo = false;
	private long processTime;
	private String hiloQueProcesa; 
	private String option;
	
	public HiloEsPrimo(long num, String option) {
		this.num = num;
		this.option = option;
	}

	
	@Override
	public void run() {
	    long iniTime = System.currentTimeMillis();
	    
			for (long i=2; i<num ; i++ ) {	
				
				long aux = num%i;	
				
				if (aux == 0) {
					esPrimo = false;
					break;
				}
				else
					esPrimo = true;	
			}		

	    long finTime = System.currentTimeMillis();	
	    hiloQueProcesa = Thread.currentThread().getName();
	    processTime =  (finTime - iniTime);
	    
	    System.out.println(toString());
	    
		switch (option) {
		case "y","Y":
			System.out.println("Gurdando resultados");
			File saveDir = new File("save");
			saveDir.mkdir();
			/*
			File save = new File ("save//save.txt");
			try {
				save.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			FileWriter file;
			try {
				file = new FileWriter("save//save.txt", true);
			} catch (IOException e) {
				System.out.println("No se puede abrir o crear el fichero");
				System.out.println(e.getMessage());
				return;
			}
			
			BufferedWriter buffer = new BufferedWriter(file);
			try {
				buffer.write(toString());
				buffer.newLine();
				buffer.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
	
		default:
			System.out.println("No desea guardar resultados");
		}

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
