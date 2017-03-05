package RR.ThreadRR;

public class MainKl {

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
		

		
		System.out.println("4 "+ T3.toString());
		System.out.println("5 "+ Thread.currentThread().toString());
		

		
			}

}
