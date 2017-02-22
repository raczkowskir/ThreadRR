package RR.ThreadRR;

public class W1 extends Toll {

	@Override
	synchronized public void run() {
		Toll.setMyNumber(1);
		for (int i = 0; i < 10; i++) {
			System.out.print(Toll.getMyNumber());
			mySleep(100);
		}
		Toll.setMyNumber(1);
		System.out.println("\nKoniec watku 1.");
	}

}
