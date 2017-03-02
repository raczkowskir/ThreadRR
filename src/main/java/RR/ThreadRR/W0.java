package RR.ThreadRR;

public class W0 extends Toll {

	int licznik =0;
	@Override
	public void run() {
		
		SingletonLock lock = SingletonLock.getS();
		// Toll.setMyNumber(0);
		for (int i = 0; i < 50; i++) {
			Thread.currentThread().yield();
//uzywamy statycznej metody klasy Toll zeby  zwrocic wartosc pola tej klasy		
			System.out.print("a" + Toll.getMyNumber(0));
			
		licznik =i;
		/*if (licznik==9){
			System.out.println("\n");
			mySleep(100);
		}*/
		synchronized (lock) {
			
			try {
				System.out.println("W0 try wait START.");
				lock.wait();
				System.out.println("W0 try wait DONE.");
			} catch (InterruptedException e) {
				System.out.println("W0 try wait FAIL.");
			
		}
	}
		
		}
		
		System.out.println("\nKoniec watku 0.");
		Toll.wynik =0;
	}

}
