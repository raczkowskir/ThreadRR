package RR.ThreadRR;

public class W2 extends Toll {
	int licznik =0;
	@Override
	public void run() {
		Thread.currentThread().setName("Ostani Watek");
		// Toll.setMyNumber(2);
		for (int i = 0; i < 10; i++) {
			//uzywamy statycznej metody klasy Toll zeby  zwrocic wartosc pola tej klasy		
			System.out.print("c" + Toll.getMyNumber(2));

			licznik =i;
			/*if (licznik==9){
				System.out.println("\n");
				mySleep(100);
		}*/
		
		}
		System.out.println("\nKoniec watku 2.");
		
	}

}
