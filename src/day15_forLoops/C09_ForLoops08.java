package day15_forLoops;

import java.util.Scanner;

public class C09_ForLoops08 {

	public static void main(String[] args) {
		/*
		 Soru 11 ) Interview Question Kullanicidan 10’den kucuk bir  tamsayi isteyin 
		 ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 10'dan kucuk pozitif bir tam sayi girin ");
		
		int sayi=scan.nextInt();

		int faktoryel=1;
		
		
		for (int i = 1; i <= sayi; i++) {
			faktoryel*=i;
		}
		
		System.out.println("girdiginiz sayinin faktoryeli : " + faktoryel);
		
		// kullanici 5 girdiyse bu islemin sonucunda konsolda 5!=1*2*3*4*5 = 120 yazdiralim
		scan.close();
	}

}
