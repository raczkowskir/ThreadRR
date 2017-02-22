package RR.ThreadRR;

public class W0 extends Toll {

	@Override
	synchronized public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(Toll.getMyNumber());
			mySleep(100);
		}
		System.out.println("\nKoniec watku 0.");
	}

	
	}


