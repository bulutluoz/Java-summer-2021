package day18_doWhileLoopScope;

import java.util.Scanner;

public class C08_DoWhileLoopHomework6 {

	public static void main(String[] args) {
		// Soru 6 ) Kullanicidan toplamak icin sayi isteyin ve 
		// toplam 500’e ulasincaya kadar devam
        // istemeyi ettirin. Toplam 500’e ulastiginda veya gectiginde toplami ve kac sayi
        // girildigini yazdirin
        
        Scanner scan = new Scanner (System.in);
        
        int toplam=0;
        int sayac=0;
        int sayi=0;
        
        do {
            
            System.out.println("Lütfen toplamak için bir sayi giriniz: ");
            sayi= scan.nextInt();
            
            toplam+=sayi;
            sayac++;
        }  while (toplam<500);
        System.out.println("Girdiginiz sayilarin toplami: "+ toplam + "\nToplam girdiginiz sayi adedi:" + sayac);
        scan.close();
	}

}
