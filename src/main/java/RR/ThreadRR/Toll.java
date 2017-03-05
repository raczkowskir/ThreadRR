package RR.ThreadRR;

public abstract class Toll implements Runnable {

	// prywatne statyczne pole - dzieki czemu mozna sie do niego dostac jedynie
	// przez Toll.getMyNumber(n);
	private static int myNumber = 0;
	public static int wynik =0;
	// statyczna metoda zwracająca wartość prywatnego pola myNumber - jest
	// zsynchronizowana, dzieki czemu tylko jeden watek na raz moze z niej
	// korzystac (blokuje monitor)
	static public synchronized int getMyNumber(int n) {
		// do sprawdzenia jak dziala synchronizacja watkow
		Toll.myNumber = Toll.myNumber + n;

		Thread.currentThread();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// do sprawdzenia jak dziala synchronizacja watkow
		Toll.myNumber = Toll.myNumber - n;
		return myNumber;
	}

	// metoda statyczna do ustawiania pola tej klasy
	static public void setMyNumber(int x) {
		myNumber = x;
		// sleep current thread
		Thread.currentThread();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// metoda usypiająca watek od razu wpisana juz w try-catch, dla klas
	// potomnych tej klasy
	public void mySleep(int a) {
		try {
			Thread.currentThread();
			Thread.sleep(a);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void myWait(){
		
		Thread.currentThread();
		
		
	}
	

	@Override
	public abstract void run();

}
