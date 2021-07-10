package day12_stringManipulations;

import java.util.Scanner;

public class C07_Homework02 {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun
        // oldugunu yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();
        if (isim.length() > soyisim.length()) {
            System.out.println("isim daha uzun");
        }
        else if (isim.length() < soyisim.length()) {
            System.out.println("soyisim daha uzun");
        }
        else {
            System.out.println("isminiz ile soyisminiz ayni uzunluktadir");
        }
        scan.close();
	}

}
