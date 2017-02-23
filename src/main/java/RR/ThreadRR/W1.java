package RR.ThreadRR;

public class W1 extends Toll {

	@Override
	public void run() {
		Toll.setMyNumber(1);
		for (int i = 0; i < 10; i++) {
			System.out.print("b"+Toll.getMyNumber());
			mySleep(100);
		}
		
		System.out.println("\nKoniec watku 1.");
	}

}
