import java.io.File;
import java.util.Scanner;

public class MainHilo {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		long num1, num2, num3, num4;
		String option;
		
		System.out.println("Introduce num1: ");
		num1 = leer.nextLong();
		
		System.out.println("Introduce num2: ");
		num2 = leer.nextLong();
		
		System.out.println("Introduce num3: ");
		num3 = leer.nextLong();
		
		System.out.println("Introduce num4: ");
		num4 = leer.nextLong();
		
		System.out.println("Quiere guardar los resultados de cada hilo en un fichero?");

		option = leer.next();
		

		HiloEsPrimo hilo1 = new HiloEsPrimo(num1, option);
		Thread t1 = new Thread (hilo1, "hilo1");
		
		HiloEsPrimo hilo2 = new HiloEsPrimo(num2, option);
		Thread t2 = new Thread (hilo2, "hilo2");
		
		HiloEsPrimo hilo3 = new HiloEsPrimo(num3, option);
		Thread t3 = new Thread (hilo3, "hilo3");
		
		HiloEsPrimo hilo4 = new HiloEsPrimo(num4, option);
		Thread t4 = new Thread (hilo4, "hilo4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		leer.close();
	}

}
