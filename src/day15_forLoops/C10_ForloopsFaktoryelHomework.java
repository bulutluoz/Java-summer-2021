package day15_forLoops;

import java.util.Scanner;

public class C10_ForloopsFaktoryelHomework {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("10'den kucuk bir sayi giriniz: ");
		int sayi=scan.nextInt();
		int faktoriyel=1;
		
		System.out.print(sayi+"!=");
		for (int i=1;i<=sayi;i++) {
			
			faktoriyel=faktoriyel*i;
			System.out.print(i);
			if (i!=sayi) {
				System.out.print("*");
			}
		}
		System.out.println("="+faktoriyel);
		scan.close();
	}

}