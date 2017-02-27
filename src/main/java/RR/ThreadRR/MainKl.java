package RR.ThreadRR;

public class MainKl {

	public static void main(String[] args) throws InterruptedException, IllegalThreadStateException{
		// tworzymy obiekt Fasady i na nim uruchamiamy metody zeby uproscic projekt
		Fasada F = new Fasada();
		F.go();
		System.out.println("MainKl "+Thread.currentThread().getName()+" " + Thread.currentThread().isAlive());
	}

}
