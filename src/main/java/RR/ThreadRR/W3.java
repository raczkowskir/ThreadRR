package RR.ThreadRR;

public class W3 extends Toll {
	int licznik = 0;

	@Override
	public void run() {
		Thread.currentThread().setName("Dodatkowy Watek");
		// Toll.setMyNumber(2);
		for (int i = 0; i < 20; i++) {
			// uzywamy statycznej metody klasy Toll zeby zwrocic wartosc pola
			// tej klasy
			System.out.print("d" + Toll.getMyNumber(3));

			licznik = i;

		/*	synchronized (this) {
				if (licznik == 5) {
					try {
						System.out.println("Prawie zatrzymano watek.");
						Thread.currentThread().wait();
						System.out.println("Całkiem zatrzymano watek.");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("Wysypal sie wait w W1.");
						// e.printStackTrace();
					}
				}
			}*/

			/*
			 * if (licznik==9){ System.out.println("\n"); mySleep(100); }
			 */

		}
		System.out.println("\nKoniec watku 2.");

	}

}
