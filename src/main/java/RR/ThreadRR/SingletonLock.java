package RR.ThreadRR;

public class SingletonLock {
	int licznik = 0;
	
	private static SingletonLock s;
	private SingletonLock(){};
	public static SingletonLock getS(){
		if (s==null){
			s=new SingletonLock();
		}
			return s;
		}
	}


