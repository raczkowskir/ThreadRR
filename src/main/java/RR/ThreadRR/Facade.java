package RR.ThreadRR;

public class Facade {
	
	Runnable myRun1 = new MyRun(1);
	Runnable myRun2 = new MyRun2(2);
	Thread thread1 = new Thread(myRun1);
	Thread thread2 = new Thread(myRun2);
	
	public void startThr2(){
	thread2.start();
	}
	
	
	public void startThr1(){
		thread1.start();
		}
	
}
