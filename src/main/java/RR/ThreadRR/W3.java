package RR.ThreadRR;

public class W3 extends Toll {
	int licznik = 0;

	@Override
	public void run() {
		Thread.currentThread().setName("Dodatkowy Watek");
		// Toll.setMyNumber(2);
		for (int i = 0; i < 20; i++) {
			// uzywamy statycznej metody klasy Toll zeby zwrocic wartosc pola
			// tej klasy
			System.out.print("d" + Toll.getMyNumber(3));

			licznik = i;
		}
		System.out.println("\nKoniec watku 2.");

	}

}
