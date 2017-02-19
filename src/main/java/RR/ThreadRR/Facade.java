package RR.ThreadRR;

//klasa w ktorej tworzymy wszystkie obiekty i odpalamy na nich ich metody
// po to zeby nie zasmiecac metody main glownej klasy
public class Facade {
//tworzymy obiekty klas ktorych metody maja sie wykonywac w danym watku
	//za pomoca metody run interface Runnable 
	Runnable myRun1 = new MyRun2(1);
	Runnable myRun2 = new MyRun1(2);
	
//tworzymy watki i przypisujemy im jako argument obiekty konkretnych klas	
	Thread thread1 = new Thread(myRun1);
	Thread thread2 = new Thread(myRun2);

//metoda uruchamiajaca pierwszy watek	
	public void startThr1(){
	thread2.start();
	try {
		thread1.sleep(5000);
	} catch (InterruptedException e) {
		System.out.println("Wyskoczyl wyjatek metody sleep.");
		e.printStackTrace();
	}
	System.out.println("I znowu dziala pierwszy watek.");
	
	}
	
//metoda uruchamiajaca drugi watek	
	public void startThr2(){
		thread1.start();
		}
	
}
