package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C11_WhileLoopHomework03 {

	public static void main(String[] args) {
		// Soru 6) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
        // olduklarini ekranda yazdirin
        
        Scanner scan= new Scanner(System.in);
        
         System.out.println("Lütfen bir adet tam sayi giriniz: ");
         
         int sayi= scan.nextInt();      
         
         int tamBolen=1;
         
         int sayac=0;
         
         while (tamBolen<=sayi) {
             
             if (sayi%tamBolen==0) {             
                             
             System.out.print(tamBolen + " ");
             
             sayac++;
             
             }  
             
             tamBolen++;
             
         } 
         
         System.out.println("\nGirdiginiz sayiyi tam bölen " + sayac + " adet sayi var.");
         scan.close();
	}

}
