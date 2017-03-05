package RR.ThreadRR;

public class W2 extends Toll {
	int licznik = 0;

	@Override
	public void run() {
		// pozyskujemy referencje monitora
		SingletonLock lock = SingletonLock.getS();
		lock.licznik++;
		System.out.println("licznik = " + lock.licznik);

		Thread.currentThread().setName("Ostani Watek");
		for (int i = 0; i < 10; i++) {
			// uzywamy statycznej metody klasy Toll zeby zwrocic wartosc pola
			// tej klasy
			// System.out.print("c" + Toll.getMyNumber(2));
			System.out.println("c" + i);
			licznik = i;

			synchronized (lock) {
				if (licznik == 9) {
					// metoda zwalniajaca monitor
					lock.notifyAll();
				}
			}
		}
		System.out.println("\nKoniec watku 2.");

	}

}
