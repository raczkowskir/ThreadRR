
public class Fasada {
	
	Runnable klasa1 = new Klasa1();
	Runnable klasa2 = new Klasa2();
	
	Thread watek0 = new Thread(klasa1);
	Thread watek1 = new Thread(klasa2);
	
	public Thread getWatek0() {
		return watek0;
	}
	public Thread getWatek1() {
		return watek1;
	}
	String wykonaj1() throws InterruptedException{
	
		System.out.println(watek0.getName());
		watek0.start();
	//	watek0.yield();
		System.out.println("Priority W0: "+watek0.getPriority());
		watek0.sleep(200);
		watek0.yield();
		watek1.start();
		return "\n Koniec watku 0";
	}
/*	Runnable klasa1 = new Klasa1();
	Runnable klasa2 = new Klasa2();
	
	Thread watek1 = new Thread(klasa1);
	Thread watek2 = new Thread(klasa2);
	public Thread getWatek2() {
		return watek2;
	}
	
	String wykonaj1() throws InterruptedException{
		
		System.out.println(watek1.getName());
		watek2.start();
		
		getWatek2();
		Thread.sleep(5000);
		
		System.out.println(watek2.getName());
		watek1.setPriority(9);
		System.out.println("Priority W1: "+watek1.getPriority());
		System.out.println("Priority W2: "+watek2.getPriority());
		watek1.start();
		watek2.setPriority(1);
		return " Rozpoczeły sie obydwa watki ";*/
	
	
}
