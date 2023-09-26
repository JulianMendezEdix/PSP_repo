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
		
		HiloEsPrimo hilo1 = new HiloEsPrimo(num1);
		Thread t1 = new Thread (hilo1, "hilo1");
		
		HiloEsPrimo hilo2 = new HiloEsPrimo(num2);
		Thread t2 = new Thread (hilo2, "hilo2");
		
		HiloEsPrimo hilo3 = new HiloEsPrimo(num3);
		Thread t3 = new Thread (hilo3, "hilo3");
		
		HiloEsPrimo hilo4 = new HiloEsPrimo(num4);
		Thread t4 = new Thread (hilo4, "hilo4");

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(hilo1);
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(hilo2);
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(hilo3);
		t4.start();
		try {
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(hilo4);

		leer.close();
	}

}
