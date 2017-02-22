package RR.ThreadRR;

public class Fasada {

	Runnable R0 = new W0();
	Runnable R1 = new W1();
	Runnable R2 = new W2();

	Thread T0 = new Thread(R0);
	Thread T1 = new Thread(R1);
	Thread T2 = new Thread(R2);

	synchronized public void go() throws InterruptedException {
		System.out.println("MyNumber1: "+Toll.getMyNumber());
		
		T0.start();
		// uzycie join sprawilo ze watek najpierw wykonal sie caly a dopiero
		// potem oddal procesor nastepnemu watkowi
		T0.join();
		System.out.println("MyNumber2: "+Toll.getMyNumber());
		T1.start();
		System.out.println("MyNumber3: "+Toll.getMyNumber());
		T1.join();
		// ustawienie watku jako Demona sprawilo ze zostal on zakonczony zaraz po rozpoczeciu
		try {
		//	T2.setDaemon(true);
		} catch (IllegalThreadStateException e) {
			System.out.println("Demon namieszal.");
		}
		T2.start();
		System.out.println("MyNumber4: "+Toll.getMyNumber());
		//sprawdzic metode - yield
	}
}
