package day12_stringManipulations;

import java.util.Scanner;

public class C06_Homework01 {

	public static void main(String[] args) {
		 // Soru 3) Kullanicidan isim isteyin. Eger ;
        // - isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
        // - isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
        // - ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ismi giriniz");
        String isim = scan.nextLine();
        if (isim.contains("a")) {
            System.out.println("Girdiginiz isim a harfi iceriyor");
        }
        else if (isim.contains("Z")) {
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        }
        else {
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }
            
        scan.close();
	}

}
