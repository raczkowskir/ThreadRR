package RR.ThreadRR;

public class MainKl {

	public static void main(String[] args) throws InterruptedException, IllegalThreadStateException, IllegalMonitorStateException {
		// tworzymy obiekt Fasady i na nim uruchamiamy metody zeby uproscic
		// projekt
		Fasada F = new Fasada();
		F.go();
			}

}
