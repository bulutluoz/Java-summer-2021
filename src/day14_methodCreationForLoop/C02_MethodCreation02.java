package day14_methodCreationForLoop;

import java.util.Scanner;

public class C02_MethodCreation02 {

	public static void main(String[] args) {
		/*
		 Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
		 Kullanici 2,3 veya 4 degerini girerse, 
		 kullanicidan bu sayilari girmesini isteyin 
		 ve sayilarin toplamini yazdirin. 
		 Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse 
		 “Cok sayi girdiniz, ben toplayamam” yazdirin.

		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kac sayi toplamak istersiniz...");

		int sayiAdedi=scan.nextInt();
		
		if (sayiAdedi<2) {
			System.out.println("toplamak icin en az 2 sayi girmelisiniz");
		} else if (sayiAdedi==2){
			ikiSayiTopla();
		} else if (sayiAdedi==3) {
			ucsayiTopla();
		} else if(sayiAdedi==4) {
			dortSayiTopla();
		} else {
			System.out.println("Cok sayi girdiniz, ben toplayamam");
		}

		scan.close();
	}

	public static void dortSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen dort tamsayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		int sayi4=scan.nextInt();
		System.out.println("dort sayi girmeyi tercih ettiniz "
				+ "\nGirilen dort sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4) );
		scan.close();
	}

	public static void ucsayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen uc tamsayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		System.out.println("uc sayi girmeyi tercih ettiniz "
				+ "\nGirilen uc sayinin toplami : " + (sayi1+sayi2+sayi3) );
		scan.close();
		
	}

	public static void ikiSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen iki tamsayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		System.out.println("iki sayi girmeyi tercih ettiniz "
				+ "\nGirilen iki sayinin toplami : " + (sayi1+sayi2) );
		scan.close();
		
	}

}
