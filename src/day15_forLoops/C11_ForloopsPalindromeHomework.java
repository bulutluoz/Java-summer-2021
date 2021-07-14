package day15_forLoops;

import java.util.Scanner;

public class C11_ForloopsPalindromeHomework {

	public static void main(String[] args) {
		// Soru 9 ) Interview Question Kullanicidan bir String isteyin. Kullanicinin
		// girdigi String'in
		// palindrome olup olmadigini kontrol eden bir program yazin.
		System.out.println("Lütfen bir isim giriniz");
		Scanner scan = new Scanner(System.in);
		String isim = scan.next();
		String terstenIsim = "";
		for (int i = 0; i < isim.length(); i++) {
			terstenIsim += isim.substring(isim.length() - 1 - i, isim.length() - i);
		}
		if (isim.equals(terstenIsim)) {
			System.out.println("Girilen isim palindromdur");
		} else {
			System.out.println("Girilen isim palindrom degildir");
		}
		scan.close();
	}
}
