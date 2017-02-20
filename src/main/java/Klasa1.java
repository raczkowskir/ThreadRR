import java.util.*;

public class Klasa1 implements Runnable {

	public void run() {
		// wyswietlamy jedna cyfre co sekunde zeby pokazac ze watek dziala
		Thread.currentThread().setPriority(1);
		int i = 0;
		while (i < 20) {
			System.out.print(i);
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException | IllegalMonitorStateException g) {
			//	g.printStackTrace();
			//	System.out.println("Coś się wysypało w pierwszym watku");
			}
			i++;
			
		}
System.out.println("Koniec watku pierwszego.");
	}

}
