package day08_ternaryOperator;

import java.util.Scanner;

public class C4_Ternary02 {

	public static void main(String[] args) {
		// Soru1 ) Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen iki sayi giriniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println(  sayi1<sayi2 ? sayi1 : sayi2);

		scan.close();
	}

}
