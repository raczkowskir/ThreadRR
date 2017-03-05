package RR.ThreadRR;

import java.lang.Thread;

public class Fasada extends Thread {

	// tworzymy zmienne typu runnable z przypisamymi im obiektami klas
	// konkretnych
	Runnable R0 = new W0();
	Runnable R1 = new W1();
	Runnable R2 = new W2();

	// obiekty do sprawdzenia dzialania metody clone();
	Klon k1 = new Klon();
	Klon k2 = (Klon) k1.clone();

	// Tworzymy obiekty nowych watków i przekazujemy im zmienne typu runnable
	Thread T0 = new Thread(R0);
	Thread T1 = new Thread(R1);
	Thread T2 = new Thread(R2);
	

	public void go() throws InterruptedException, IllegalMonitorStateException{
		
		
//		System.out.println("1 "+ T0.isAlive());
		System.out.println("1 "+ T0.getId()+" "+T0.getState());
		
		T0.start();
		
		// uzycie join sprawilo ze watek najpierw wykonal sie caly a dopiero
		// potem oddal procesor nastepnemu watkowi
		
		System.out.println("1 "+ T0.getId()+" "+T0.getState());
		T0.setPriority(1);
		
		System.out.println("1 "+ T0.toString());

		//T0.join();
		synchronized (this) {
		T1.start();
		}
		T1.setPriority(10);
	//	T1.join();
		
		// ustawienie watku jako Demona sprawilo ze zostal on zakonczony zaraz
		// po rozpoczeciu
		try {
			// T2.setDaemon(true);
		} catch (IllegalThreadStateException e) {
			System.out.println("Demon namieszal.");
		}
		T2.setPriority(10);
		T2.start();
		//T2.join();
		System.out.println("Method Thread.currentThread(): " + Thread.activeCount());
		
		System.out.println("1 "+ T0.toString());
		System.out.println("2 "+ T1.toString());
		System.out.println("3 "+ T2.toString());
		// System.out.println("Method Thread.currentThread():
		// "+Thread.checkAccess());

		// blok wyswietlajacy zawartosc pola zdanie; obiektow klasy Klon -
		// pokazuje ze nie jest to ten sam obiekt
		/*
		 * k1.zdanie = "Ja nie jestem klonem."; System.out.println(k1.zdanie);
		 * System.out.println(k2.zdanie); if (k1 != k2) {
		 * System.out.println("k1!=k2"); } if (k1.equals(k2)) {
		 * System.out.println("k1.equals(k2)"); } else {
		 * System.out.println("k1.equals(k2) FALSE"); } if (k1.hashCode() !=
		 * k2.hashCode()) { System.out.println("k1.hashCode()!=k2.hashCode()");
		 * } if (k1.getClass().equals(k2.getClass())) {
		 * 
		 * System.out.println("k1.getClass().equals(k2.getClass())"); } if
		 * (k1.getClass()==(k2.getClass())) {
		 * 
		 * System.out.println("k1.getClass()==(k2.getClass())"); }
		 * System.out.println("hashCode k1: "+
		 * k1.hashCode()+" hashCode k2: "+k2.hashCode());
		 */

	}
}
