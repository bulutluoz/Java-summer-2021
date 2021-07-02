package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C3_IfStatements02 {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		
		int girilenSayi=scan.nextInt();
		
		if(girilenSayi%2==0) {
			System.out.println("Girdiginiz sayi cift sayi");
		}
		if(girilenSayi%2==1) {
			System.out.println("Girdiginiz sayi tek sayi");
		}
		
		if (girilenSayi<0) {
			System.out.println("Lutfen pozitif bir tamsayi girin");
		}
		scan.close();
	}

}
