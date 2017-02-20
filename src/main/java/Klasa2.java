
public class Klasa2 implements Runnable {

	String[] tablica = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "r", "s", "t",
			"u", "w", "x", "y", "z" };

	public void run() {
	Thread.currentThread().setPriority(10);
		
//wyswietlamy jedna pozycje tablicy co sekunde zeby pokazac ze watek dziala
		try{
for (int i = 0; i <1000; i++){
System.out.print(tablica[i]+"\n");
try {
	Thread.currentThread();
	Thread.sleep(200);
	//Thread.currentThread().sleep(500);
} catch (InterruptedException | IllegalMonitorStateException e) {
//	e.printStackTrace();
}
}}
catch(IndexOutOfBoundsException E){
//	System.out.println("Skończyła sie tablica");
}
System.out.println("koniec watku drugiego.");
}
	}

