import java.util.Scanner;

public class MainHilo {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		long num1, num2, num3, num4;
		
		System.out.println("Introduce num1: ");
		num1 = leer.nextLong();
		
		System.out.println("Introduce num2: ");
		num2 = leer.nextLong();
		
		System.out.println("Introduce num3: ");
		num3 = leer.nextLong();
		
		System.out.println("Introduce num4: ");
		num4 = leer.nextLong();
		
		HiloEsPrimo Hilo1 = new HiloEsPrimo(num1);
		Thread t1 = new Thread (Hilo1, "Hilo1");
		
		HiloEsPrimo Hilo2 = new HiloEsPrimo(num2);
		Thread t2 = new Thread (Hilo2, "Hilo2");
		
		HiloEsPrimo Hilo3 = new HiloEsPrimo(num3);
		Thread t3 = new Thread (Hilo3, "Hilo3");
		
		HiloEsPrimo Hilo4 = new HiloEsPrimo(num4);
		Thread t4 = new Thread (Hilo4, "Hilo4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		System.out.println("Hilo principal parado");
		
		
	}

}
