package RR.ThreadRR;

public class W1 extends Toll {
	int licznik =0;
	@Override
	public void run() {
		// Toll.setMyNumber(1);
		for (int i = 0; i < 20; i++) {
			
			//uzywamy statycznej metody klasy Toll zeby  zwrocic wartosc pola tej klasy					
			System.out.print("b" + Toll.getMyNumber(1));
		
			licznik =i;
			/*
			if (licznik==5){
				System.out.println("Uśpiono watek 0.");
				
		}
			if (licznik==15){
				System.out.println("Wybudzpno watek 0.");
				mySleep(100);
		}*/
			//experymenty z YIELD
			/*if (licznik ==4){
				Thread.currentThread().yield();
				System.out.println(" Oddano procesor");
			}*/
		
		}
		System.out.println("\nKoniec watku 1.");
		
	}

}
