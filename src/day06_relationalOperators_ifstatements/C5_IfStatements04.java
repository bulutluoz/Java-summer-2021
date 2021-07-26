package day06_relationalOperators_ifstatements;

import java.util.Scanner;



public class C5_IfStatements04 {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
		// ve dikdortgenin kare olup olmadigini yazdirin



		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen kenar uzunluklarindan birini tamsayi olarak giniz");
		int kenar1=scan.nextInt();
		System.out.println("Lutfen diger kenar uzunlugunu tamsayi olarak giniz");
		int kenar2=scan.nextInt();
		
		if (kenar1==kenar2) {
			System.out.println("girdiginiz dikdortgen bir kare");
		}
		if (kenar1!=kenar2) {
			System.out.println("girdiginiz dikdortgen bir kare degil");
		}
		
		scan.close();
		
		
	}

}
