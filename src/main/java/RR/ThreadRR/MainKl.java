package RR.ThreadRR;

public class MainKl {

	/*synchronized void method1() {
		try {
			wait();
			System.out.println(Thread.currentThread().toString() + " " + Thread.currentThread().getState());
		} catch (InterruptedException ie) {
		}
	}

	synchronized void method2() {
		notifyAll();
		System.out.println("Dziala?" + Thread.currentThread().toString() + " " + Thread.currentThread().getState());
	}*/
	
	public static void main(String[] args) throws InterruptedException, IllegalThreadStateException, IllegalMonitorStateException {
		// tworzymy obiekt Fasady i na nim uruchamiamy metody zeby uproscic
		// projekt
		Fasada F = new Fasada();
		Runnable w3 = new W3();
		final Thread T3 = new Thread(w3);
		T3.start();
		T3.setName("Dodatkowy Watek");
		F.go();
		MainKl m =new MainKl();
		
		//testujemy na nowym watku metode wait()
		
		
		System.out.println("4 "+ T3.toString());
		System.out.println("5 "+ Thread.currentThread().toString());
		
		
		
	/*	m.method1();
		m.method2();*/
		
			}

}
