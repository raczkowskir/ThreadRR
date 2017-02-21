package RR.ThreadRR;

public class W0 extends Toll {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print("0");
			mySleep(100);
		}
		System.out.println("\nKoniec watku 0.");
	}

	
	}


