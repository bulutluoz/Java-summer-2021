package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C05_WhileLoops03 {

	public static void main(String[] args) {
		/*
		 Soru 4) Kullanicidan baslangic ve bitis haflerini alin 
		 ve baslangic harfinden baslayip bitis harfinde biten 
		 tum harfleri buyuk harf olarak ekrana yazdirin. 
		 Kullanicinin hata yapmadigini farz edin.

		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen ilk harfi girin");
		
		char ilkHarf= scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lutfen son harfi girin");
		
		char sonHarf= scan.next().toUpperCase().charAt(0);
		
		
		
		char harf= ilkHarf;
		
		while (harf<=sonHarf) {
			
			System.out.print(harf+" ");
			harf+=1;
		}

		scan.close();
	}

}
