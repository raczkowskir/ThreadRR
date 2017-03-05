package RR.ThreadRR;

public class W0 extends Toll {

	int licznik = 0;

	@Override
	public void run() {
		// tworzymy zmienna wskazujaca na obiekt bedacy monitorem watkow ktore
		// maja byc synchronizowane
		SingletonLock lock = SingletonLock.getS();

		// podajemy jako argument do bloku synchronized, obiekt monitora
					// tylko watek bedacy w jego aktualnym posiadaniu moze sie wykonac
					//pozostale watki musza czekac na zwolnienie monitora
				
		synchronized (lock) {

			try {
				System.out.println("W0 try wait START.");
				lock.wait();
				System.out.println("W0 try wait DONE.");
			} catch (InterruptedException e) {
				System.out.println("W0 try wait FAIL.");

			}
		}
		for (int i = 0; i < 10; i++) {
			Thread.currentThread().yield();
			// uzywamy statycznej metody klasy Toll zeby zwrocic wartosc pola
			// tej klasy
			//System.out.print("a" + Toll.getMyNumber(0));
			System.out.println("a"+i);
			licznik = i;
			

		}
		//kolejny zsynchronizowany blok, tym razem zwalniajacy monitor dla wszystkich watkow
		synchronized (lock) {
			if (licznik == 9) {
				// metoda zwalniajaca monitor
				lock.notifyAll();
			}
		}
		System.out.println("\nKoniec watku 0.");
		Toll.wynik = 0;
	}

}
