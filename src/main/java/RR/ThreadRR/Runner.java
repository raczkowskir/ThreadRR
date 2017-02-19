package RR.ThreadRR;

//klasa z metoda main, zaczynajaca prace programu
public class Runner {

	public static void main(String[] args){
	
// tworzymy obiekt klasy Fcade i uruchamiamy na nim pierwszy watek		
	Facade F = new Facade();
	F.startThr1();
		
}
}