package RR.ThreadRR;

public class Fred {
	
	//metoda main projektu
	public static void mains(String[] args) {
		// przypisujemy zmiennej FINALNEJ obiekt
		final Fred fred = new Fred();

		// tworzymy nowy watek i od razu w konstruktorze porzypisujemy mu obiekt
		// typu Runnable z pełna implementacja 
		final Thread t1 = new Thread(new Runnable() {
			
			
			public void run() {
				System.out.println("t1 start :-)");
				System.out.println("t1 will wait...");
				synchronized (fred) {
					try {
						fred.wait();
					} catch (InterruptedException ie) {
						System.out.println("t1 interrupted...");
					}
				}
				System.out.println("t1 stop :-)");
			}
		});
		
		//uruchamiamy watek
		t1.start();
		
		//tworzymy drugi watek w taki sam sposob
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("t2 start :-)");
				synchronized (fred) {
					System.out.println("t2 notifyAll!!!");
					fred.notifyAll();
					System.out.println("t2 done ;-)");
				}
				System.out.println("t2 stop :-)");
			}
		});
		t2.start();
	}
}