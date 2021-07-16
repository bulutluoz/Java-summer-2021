package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C09_WhileLoopHomework {

	public static void main(String[] args) {
		// Soru 3 ) Kullanicidan baslangic ve bitis degerlerini alin. 
		// Baslangic degeri ve bitis
        // degeri dahil aradalarindaki tum cift tamsayilari 
		// while loop kullanarak ekrana yazdiriniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen son sayiyi giriniz");
        int sayi2 = scan.nextInt();
        int i = sayi1;
        int j = sayi2;
       
        if (sayi1 >= sayi2) {
        	System.out.println("girdiginiz " + sayi1 + " ile "+ sayi2 + " arasindaki cift sayilar");
            while (j <= i) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
                j++;
            }
        } else if (sayi1 <= sayi2) {
        	System.out.println("girdiginiz " + sayi1 + " ile "+ sayi2 + " arasindaki cift sayilar");
            while (i <= j) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
        }
        scan.close();
	}

}
