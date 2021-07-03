package day07_ifElseStatements;

import java.util.Scanner;

public class C5_IfElseIf01 {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
		// eger uzunluklardan birisi 0 veya daha kucukse
		// "gecerli uzunluk giriniz" yazdirin,
		// uzunluklarin ikisi de pozitif ise
		// dikdortgenin kare olup olmadigini yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen diktorhgenin kenarlarini giriniz \nIlk kenari yazinca ENTER'a basiniz");

		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();

		if (kenar1 <= 0 || kenar2 <= 0) {
			System.out.println("Lutfen gecerli uzunluk giriniz");
		} else if (kenar1 == kenar2) {
			System.out.println("Girdiginiz dikdortgen karedir");
		} else {
			System.out.println("Girdiginiz dikdortgen kare degildir");
		}

		scan.close();

	}

}
