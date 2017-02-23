package RR.ThreadRR;

public abstract class Toll implements Runnable{
	
	private static int myNumber = 0;
	
	static synchronized public int getMyNumber(){
		
		return myNumber;
	}
	static synchronized public void setMyNumber(int x){
		myNumber = x;
		//sleep current thread
				Thread.currentThread();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	}
	
	
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
