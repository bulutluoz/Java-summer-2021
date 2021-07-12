package day14_methodCreationForLoop;

import java.util.Scanner;

public class C01_MethodCreation01 {

	public static void main(String[] args) {
		/*
		 Soru 1 ) Kullanicidan bir sayi alin. 
		 i) Bu sayinin tek mi cift mi oldugunu, 
		 ii)sifirdan buyuk mu kucuk mu oldugunu, 
		 iii) ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		 100’den kucukse sadece 1’ler basamagini 
		 yazdiran 3 method olusturun.

		 */		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi yaziniz");
		int sayi=scan.nextInt();
		
		tekMiCiftmiYazdir(sayi);
		sifirlaKarsilastir(sayi);
		istenenBasamaklariYazdir(sayi);
		
		scan.close();

	}

	public static void istenenBasamaklariYazdir(int sayi) {
		
		if (sayi<100) {
			System.out.println("girdiginiz sayinin birler basagi : " + (sayi%10));
		} else { // sayi 100'den buyuk  455254
			
			int rakamlarToplami=0;
			int rakam=0;
			
			rakam=sayi%10;  //4
			rakamlarToplami+=rakam; //4
			sayi/=10; // 45525
			
			rakam=sayi%10; // 5
			rakamlarToplami+=rakam; // 9
			sayi/=10; // 4552
			
			rakam=sayi%10; // 2
			rakamlarToplami+=rakam; // 11
			
			System.out.println("sayinin birler,onlar ve yuzler basamagindaki rakamlar toplami : " + rakamlarToplami);

		}
		
	}

	public static void sifirlaKarsilastir(int sayi) {
		if (sayi>0) {
			System.out.println("girilen sayi pozitif");
		} else if (sayi<0) {
			System.out.println("girilen sayi negatif");
		} else {
			System.out.println("0 sayisi pozitif yada negatif degildir");
		}
		
	}

	public static void tekMiCiftmiYazdir(int sayi) {
		
		if (sayi%2==0) {
			System.out.println("Girilen sayi cift bir sayidir");
		}else {
			System.out.println("Girilen sayi tek bir sayidir");
		}
	}

}
