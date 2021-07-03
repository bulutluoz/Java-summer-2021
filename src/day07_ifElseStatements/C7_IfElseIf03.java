package day07_ifElseStatements;

import java.util.Scanner;

public class C7_IfElseIf03 {
	// Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
	// Not’u harf sistemine cevirip yazdirin.
	// 50’den kucukse “D”, 50-60 arasi “C”,
	// 60-80 arasi “B”, 80’nin uzerinde ise “A”

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen notunuzu giriniz");

		double not = scan.nextDouble();

		if (not < 0 || not > 100) {
			System.out.println("Lutfen gecerli not giriniz");
		} else if (not < 50) {
			System.out.println("Notunuz D");
		} else if (not <= 60) { // 21.satirla birlikte dusundugumde 50 - 60 arasi demek
			System.out.println("notunuz C");
		} else if (not <= 80) { // 21 ve 23. satirla birlikte 60-80 arasi demek
			System.out.println("Notunuz B");
		} else {
			System.out.println("notunuz A");
		}

		scan.close();
	}

}
