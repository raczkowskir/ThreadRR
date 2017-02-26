package RR.ThreadRR;

public class Klon implements Cloneable {

	String zdanie = "Jestem klonem.";

	// dodajmey metode clone, korzystajaca z clone(); z nadklasy(ktora ma
	// zasieg pakietowy i nie jest widoczna w naszym projekcie poza ta kalsa)
	public Object clone() {
		try {
			return super.clone();
		} catch (Exception e) {
			return null;
		}
	}
}
