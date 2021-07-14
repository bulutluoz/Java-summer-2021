package day15_forLoops;

import java.util.Scanner;

public class C12_ForLoopsHomeworkToplama {

	public static void main(String[] args) {
		// Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum
		// tamsayilari
		// toplayip, sonucu yazdiran bir program yaziniz
		System.out.println("Lütfen 2 sayi giriniz");
		Scanner scan = new Scanner(System.in);
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int toplam = 0;
		if (sayi1 < sayi2) {
			for (int i = sayi1; i <= sayi2; i++) {
				toplam += i;
			}
			System.out.println(sayi1 + " ile " + sayi2 + " arasindaki sayiların toplami :  " + toplam);
		} else if (sayi1 > sayi2) {
			for (int i = sayi2; i <= sayi1; i++) {
				toplam += i;
			}
			System.out.println(sayi1 + " ile " + sayi2 + " arasındaki sayilarin toplami :  " + toplam);
		} else {
			System.out.println("Sayılar esit ve toplamı : " + (sayi1 + sayi2));
		}
		scan.close();
	}

}
