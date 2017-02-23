package RR.ThreadRR;

public class W0 extends Toll {

	@Override
	public void run() {
		Toll.setMyNumber(0);
		for (int i = 0; i < 10; i++) {
			System.out.print("a"+Toll.getMyNumber());
			mySleep(100);
		}
		System.out.println("\nKoniec watku 0.");
	}

	
	}


