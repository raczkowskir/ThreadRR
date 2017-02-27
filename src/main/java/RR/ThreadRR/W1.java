package RR.ThreadRR;

public class W1 extends Toll {
	int licznik =0;
	@Override
	public void run() {
		// Toll.setMyNumber(1);
		for (int i = 0; i < 10; i++) {
			//uzywamy statycznej metody klasy Toll zeby  zwrocic wartosc pola tej klasy					
			System.out.print("b" + Toll.getMyNumber(1));
			
			licznik =i;
			if (licznik==9){
				System.out.println("\n");
				mySleep(100);
		}
		
		}
		System.out.println("\nKoniec watku 1.");
		System.out.println("W1 "+Thread.currentThread().getName()+" " + Thread.currentThread().isAlive());
	}

}
