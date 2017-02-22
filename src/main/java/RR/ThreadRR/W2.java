package RR.ThreadRR;

public class W2 extends Toll {

	@Override
	synchronized public void run() {
		Toll.setMyNumber(2);
		for (int i = 0; i < 10; i++) {
			System.out.print(Toll.getMyNumber());
			mySleep(100);
		}
		Toll.setMyNumber(0);
		System.out.println("\nKoniec watku 2.");
	}

}
