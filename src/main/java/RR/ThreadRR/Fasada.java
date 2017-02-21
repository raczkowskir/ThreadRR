package RR.ThreadRR;

public class Fasada {

	Runnable R0 = new W0();
	Runnable R1 = new W1();
	Runnable R2 = new W2();
	
	Thread T0 = new Thread(R0);
	Thread T1 = new Thread(R1);
	Thread T2 = new Thread(R2);
	
	public void go(){
		T0.start();
		T1.start();
		
	}
	
}
