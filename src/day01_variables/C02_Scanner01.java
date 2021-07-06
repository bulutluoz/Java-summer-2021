package day01_variables;

import java.util.Scanner;

public class C02_Scanner01 {

	public static void main(String[] args) {
		
		// kullanicidan bilgi almak icin 3 adima ihtiyacimiz var
		// 1- Scanner class'indan bir object olusturuyoruz 
		
		Scanner scan = new Scanner(System.in);
		
		// 2- Kullaniciya ne istediginiz bildiren bir mesaj yazin
		
		System.out.println("Lutfen isminizi giriniz");
		
		// Kullanicidan istedigimiz bilginin data turune gore
		// bir variable olusturup
		// konsolda yazilan bilgiyi kodlarimizin icine aliyoruz
		
		String kullanicininIsmi = scan.nextLine();
		
		
		
		System.out.println("Girdiginiz isim : " + kullanicininIsmi);
		
		scan.close();
		
		
		
	
	}

}
