package RR.ThreadRR;

// implementacja singletona do aplikacji wielowatkowych
public class SingletonLock {
	int licznik = 0;
	// klasa monitora, z wykozystaniem wzorca Singleton aby kazdy z watkow mial
	// ten sam monitor
	// zastosowanie zmiennej ulotnej, zeby system nie wprowazal optymalizacji
	private volatile static SingletonLock s;

	private SingletonLock() {
	};

	public static SingletonLock getS() {
		if (s == null) {
			// dodatkowy blok synchronizujacy prypisanie zminnej obiektu,
			// przyjmujacy jako argument obiekt typu klasy SingletonLock - pelni
			// tu funkcje monitora
			synchronized (SingletonLock.class) {
				if (s == null) {

					s = new SingletonLock();
				}
			}
		}
		return s;
	}
}
