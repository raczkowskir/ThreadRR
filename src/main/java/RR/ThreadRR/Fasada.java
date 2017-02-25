package RR.ThreadRR;

public class Fasada {

	//tworzymy zmienne typu runnable z przypisamymi im obiektami klas konkretnych
	Runnable R0 = new W0();
	Runnable R1 = new W1();
	Runnable R2 = new W2();

	//Tworzymy obiekty nowych watków i przekazujemy im zmienne typu runnable
	Thread T0 = new Thread(R0);
	Thread T1 = new Thread(R1);
	Thread T2 = new Thread(R2);

	public void go() throws InterruptedException {
		
		
		T0.start();
		// uzycie join sprawilo ze watek najpierw wykonal sie caly a dopiero
		// potem oddal procesor nastepnemu watkowi
		T0.join();
		
		T1.start();
		
		T1.join();
		
		// ustawienie watku jako Demona sprawilo ze zostal on zakonczony zaraz po rozpoczeciu
		try {
		//	T2.setDaemon(true);
		} catch (IllegalThreadStateException e) {
			System.out.println("Demon namieszal.");
		}
		
		T2.start();
		//sprawdzic metode - yield
	}
}
