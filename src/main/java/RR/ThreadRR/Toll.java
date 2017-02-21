package RR.ThreadRR;

public abstract class Toll implements Runnable{

	public void mySleep(int a){
			try {
				Thread.currentThread();
				Thread.sleep(a);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

	@Override
	public abstract void run();
	
}
