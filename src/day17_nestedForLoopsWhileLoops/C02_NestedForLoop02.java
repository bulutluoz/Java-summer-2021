package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C02_NestedForLoop02 {

	public static void main(String[] args) {
		/*
		 * Soru 13 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama
		 * gore carpim tablosu olusturun. Ornek,kullanici 3 girerse, 1 2 3 2 4 6 3 6 9
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir rakam giriniz");
		int rakam = scan.nextInt();

		for (int satirNo = 1; satirNo <= rakam; satirNo++) {

			for (int i = 1; i <= rakam; i++) {

				System.out.print(satirNo * i + " ");
			}
			System.out.println("");
		}
		scan.close();
	}

}
