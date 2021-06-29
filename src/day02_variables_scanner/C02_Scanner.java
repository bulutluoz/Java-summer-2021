package day02_variables_scanner;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
		// Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
		
		// kullanicidan deger almak icin 3 adim atmaliz
		// 1- Scanner objesi olusturalim
		
		Scanner scan = new Scanner(System.in);
		
		// 2- kullanicadan ne istedigimiz yazdiralim
		
		System.out.println("Lutfen iki tamsayi giriniz");
		
		// 3- next methodunu kullanarak girilen degerleri alip, olusturacagimiz variable'lara atayalim
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println("Girdiginiz sayilarin toplami : " + (sayi1+sayi2));
		
		scan.close();

	}

}
