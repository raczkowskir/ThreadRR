package RR.ThreadRR;

public class W2 extends Toll {
	int licznik =0;
	@Override
	public void run() {
		
		SingletonLock lock = SingletonLock.getS();
		lock.licznik++;
		System.out.println("licznik = "+lock.licznik);
		
		Thread.currentThread().setName("Ostani Watek");
		// Toll.setMyNumber(2);
		for (int i = 0; i < 50; i++) {
			//uzywamy statycznej metody klasy Toll zeby  zwrocic wartosc pola tej klasy		
			System.out.print("c" + Toll.getMyNumber(2));

			licznik =i;
			/*if (licznik==9){
				System.out.println("\n");
				mySleep(100);
		}*/
		
		
		
		synchronized (lock) {
		    lock.notifyAll();;
		    System.out.println("???????????");
		}}
		System.out.println("\nKoniec watku 2.");
		
	}

}
