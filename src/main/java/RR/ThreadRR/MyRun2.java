package RR.ThreadRR;

import java.util.Scanner;

//klasa implementujaca interface runnable czyli dajaca sie uzyc 
//jako argument w konstruktorze watku
class MyRun2 implements Runnable {

	private int id;
//konstruktor klasy
	public MyRun2(int id) {
		this.id = id;
	}
//metoda odpalana w watku
	public void run() {
		System.out.println("Wpisales dobre haslo i zaczales nowy watek!");
		/*
		 * while (true) { System.out.println("Watek " + id); try {
		 * Thread.sleep(1000); } catch (InterruptedException e) {
		 * e.printStackTrace(); } }
		 */
		try {
			wait(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Szybko podaj haslo zanim wrocimy do pierwszego watku!");

		Scanner skaner = new Scanner(System.in);
		System.out.println("Podaj haslo:");
		String haslo = skaner.nextLine();

		try {
			wait(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" Wpidales jakies bzdury: " + haslo);
	}
}
