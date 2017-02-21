package RR.ThreadRR;

public class W2 extends Toll {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print("2");
			try {
				wait(200);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
