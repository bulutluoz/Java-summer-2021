package day02_variables_scanner;

import java.util.Scanner;

public class C03_Scanner02 {

	public static void main(String[] args) {
		// Soru 6) Kullanicidan ismini ve soyismini alip 
		//aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
		// Isim – soyisim : Mehmet Bulutluoz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz ");
		
		String name= scan.next();
		
		System.out.println("Lutfen soyisminizi giriniz");
		
		String surname= scan.next();
		
		// Isim – soyisim : +Mehmet+ +Bulutluoz
		
		System.out.println("Isim - soyisim : " + name + " "+surname);
		
		
		
		
		scan.close();


	}

}
