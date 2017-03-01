package RR.ThreadRR;

public class W1 extends Toll {
	int licznik = 0;

	@Override
	public void run() {
		//tworzymy nasz monitor
		SingletonLock lock = SingletonLock.getS();
		lock.licznik++;
		System.out.println("licznik = "+lock.licznik);
		// Toll.setMyNumber(1);
		for (int i = 0; i < 50; i++) {

			// uzywamy statycznej metody klasy Toll zeby zwrocic wartosc pola
			// tej klasy
			System.out.print("b" + Toll.getMyNumber(1));

			licznik = i;
			synchronized (lock) {
				if (licznik == 5) {
					try {
						System.out.println("Prawie zatrzymano watek.");
						lock.wait();

						System.out.println("Całkiem zatrzymano watek.");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("Wysypal sie wait w W1.");
					//	e.printStackTrace();
					}
				}
			}
			/*
			 * if (licznik==5){ System.out.println("Uśpiono watek 0.");
			 * 
			 * } if (licznik==15){ System.out.println("Wybudzpno watek 0.");
			 * mySleep(100); }
			 */
			// experymenty z YIELD
			/*
			 * if (licznik ==4){ Thread.currentThread().yield();
			 * System.out.println(" Oddano procesor"); }
			 */

		}
		System.out.println("\nKoniec watku 1.");

	}

}
