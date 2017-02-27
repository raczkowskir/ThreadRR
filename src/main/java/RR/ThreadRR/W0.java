package RR.ThreadRR;

public class W0 extends Toll {

	int licznik =0;
	@Override
	public void run() {
		// Toll.setMyNumber(0);
		for (int i = 0; i < 10; i++) {
//uzywamy statycznej metody klasy Toll zeby  zwrocic wartosc pola tej klasy		
			System.out.print("a" + Toll.getMyNumber(0));
			
		licznik =i;
		if (licznik==9){
			System.out.println("\n");
			mySleep(100);
		}
		
		}
		System.out.println("W0 "+Thread.currentThread().getName()+" " + Thread.currentThread().isAlive());
	}

}
