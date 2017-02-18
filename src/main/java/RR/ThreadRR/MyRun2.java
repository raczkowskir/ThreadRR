package RR.ThreadRR;

import java.util.*;

public class MyRun2 implements Runnable {

	private int id;

	public MyRun2(int id) {
		this.id = id;
	}

	public void run() {
		Scanner skaner = new Scanner(System.in);
		System.out.println("Podaj haslo:");
		for (int i = 0; i < 3; i++) {
			String haslo = skaner.nextLine();
			if (haslo.equals("stop")) {

				System.out.println("zatrzymano petle");
				i = 3;
				
				Facade F2 = new Facade();
				F2.startThr1();
			} else {
				System.out.println("oto twoj wynik: " + haslo);
				System.out.println("Sproboj jeszcze raz");
			}
		}

	}

}
