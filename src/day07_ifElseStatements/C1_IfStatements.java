package day07_ifElseStatements;

import java.util.Scanner;

public class C1_IfStatements {

	public static void main(String[] args) {
		/*
		 Soru 3) Kullanicidan gun ismini alin ve 
		 haftaici veya hafta sonu oldugunu yazdirin 
 		 Ornek:  	gun=Pazar output = “Hafta sonu”
		 gun=Sali output = “Hafta ici”
		 *** String icin equals method’unu kullanin

		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen gun ismini giriniz ...");
		
		String gunIsmi=scan.next().toLowerCase();
		
		// bayrak kullanimi (flag)
		int flag=0;
		
		if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali")||
				gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") ||
				gunIsmi.equals("cuma")){
			
			System.out.println("Girdiginiz gun haftaici");
			flag++;
		}
		
		if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")) {
			
			System.out.println("Girdiginiz gun hafta sonu");
			flag++;
		}
		
		// pazar ==> flag=1   2.if body'si calisacak
		// sali ==> flag=1   1.if body'si calisacak
		// pezer ==> flag =0 
		
		
		if (flag==0) {
			System.out.println("Lutfen gecerli bir gun ismi yaziniz");
		}
		scan.close();

	}

}
