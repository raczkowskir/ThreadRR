package RR.ThreadRR;

public class W1 extends Toll {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print("1");
			mySleep(200);
		}
		System.out.println("\nKoniec watku 1.");
	}

}
