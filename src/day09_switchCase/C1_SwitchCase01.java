package day09_switchCase;

import java.util.Scanner;

public class C1_SwitchCase01 {

	public static void main(String[] args) {
		// Soru1 : Kullanicidan haftanin kacinci gunu oldugunu sorun
		// ve gun ismini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("haftanin kacinci gununde oldugumuzu giriniz");
		int gunNo = scan.nextInt();

		switch (gunNo) {

		case 1:
			System.out.println("Bugun pazartesi");
			break;
		case 2:
			System.out.println("Bugun sali");
			break;
		case 3:
			System.out.println("Bugun carsamba");
			break;
		case 4:
			System.out.println("Bugun persembe");
			break;
		case 5:
			System.out.println("Bugun cuma");
			break;
		case 6:
			System.out.println("Bugun cumartesi");
			break;
		case 7:
			System.out.println("Bugun pazar");
			break;
		default:
			System.out.println("Lutfen gecerli gun numarasi giriniz");
		}
		scan.close();

	}

}
