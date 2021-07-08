package day10_stringManipulations;

import java.util.Scanner;

public class C3_StringManipulation03 {

	public static void main(String[] args) {
		// '' char   "" String ama indexOf() acisindan farklari yok 
		
		String str= "Java ogrenmek ne guzel";
		
		System.out.println(str.indexOf("e")); // 8
		
		System.out.println(str.indexOf(' ')); // 4
		
		System.out.println(str.indexOf("mek")); // 10 
		
		System.out.println(str.indexOf("")); // 0
		
		System.out.println(str.indexOf("j")); // -1
		
		System.out.println(str.indexOf("J")); //0
		
		System.out.println(str.indexOf("m", 10)); // index olarak 10 dahil sonrasinda m arar
		
		
		// Kullanicidan bir String isteyin
		// girdigi String "Java" iceriyorsa "Aferin" Yazdirin
		// icermiyorsa daha cok calisman lazim yazdirin
		// buyuk - kucuk harf onemsiz olsun
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine().toLowerCase();
		
		// cumle.indexOf("java")  // cumlede java varsa index donecek, yoksa -1 donecek
		
		// 1.yol
		if (cumle.indexOf("java")==-1) {
		
			System.out.println("daha cok calisman lazim");
		} else {
			System.out.println("Aferin");
		}
		
		// 2.yol
		if (cumle.indexOf("java") != -1) {
			
			System.out.println("Aferin");
		} else {
			System.out.println("daha cok calisman lazim");
		}
		
		
		// 3.yol
		System.out.println(cumle.indexOf("java") == -1 ? "Daha cok calisman lazim." : "Aferin.");
		
		scan.close();
		
	}

}
