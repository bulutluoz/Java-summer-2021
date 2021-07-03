package day07_ifElseStatements;

import java.util.Scanner;

public class C2_IfElse01 {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
		// ve dikdortgenin kare olup olmadigini yazdirin


		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen diktorhgenin kenarlarini giriniz \nIlk kenari yazinca ENTER'a basiniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		
		if (kenar1==kenar2) {
			System.out.println("Girdiginiz dikdortgen kare");
		} else {
			System.out.println("Girdiginiz dikdortgen kare degil");
		}
		
		scan.close();
	}

}
