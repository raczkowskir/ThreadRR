package RR.ThreadRR;

public class W1 extends Toll {
	int licznik = 0;

	@Override
	public void run() {
		//pozyskujemy referencje monitora
		SingletonLock lock = SingletonLock.getS();
		lock.licznik++;
		System.out.println("licznik = "+lock.licznik);
		//blokujemy monitor
		synchronized (lock) {
			
			try {
				System.out.println("W1 try wait START.");
				lock.wait();
				System.out.println("W1 try wait DONE.");
			} catch (InterruptedException e) {
				System.out.println("W1 try wait FAIL.");
			
		}
	}
		for (int i = 0; i <10; i++) {

			// uzywamy statycznej metody klasy Toll zeby zwrocic wartosc pola
			// tej klasy
			//System.out.print("b" + Toll.getMyNumber(1));
			System.out.println("b"+i);
			licznik = i;

			

		}
		synchronized (lock) {
			if (licznik == 9) {
				// metoda zwalniajaca monitor
				lock.notifyAll();
			}
		}
		System.out.println("\nKoniec watku 1.");

	}

}
