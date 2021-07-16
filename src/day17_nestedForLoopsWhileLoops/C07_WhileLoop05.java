package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C07_WhileLoop05 {

	public static void main(String[] args) {
		/*
		 Kullanicidan toplamak uzere sayi isteyin
		 toplam 200 oluncaya kadar sayi istemeye devam edin
		 toplam 200'u gectiginde
		 kullanicinin kac sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin.
		 */
		
		// For loop da bir islem yapabilmek icin tekrar sayisini bilmek lazim
		// while loop'da ise adim sayisi degil bitirme kosulu onemlidir
		
		
		Scanner scan=new Scanner(System.in);
		
		int sayi=0;
		int toplam=0;
		int sayac=0;
		
		while (toplam<200) {
			
			System.out.println("lutfen toplamak icin bir tamsayi girin");
			sayi=scan.nextInt();
			
			toplam+=sayi;
			sayac++;
			
		}
		
		// toplamin 200'u gectiginden eminiz
		System.out.println("toplam " + sayac + " adet sayi girdiniz ve bu sayilarin toplami : " + toplam);
		
		
		//*** eger adim sayisi bilinmiyor veya ongorulemiyorsa 
		// for loop degil de while loop kullanmak daha mantiklidir.
		// eger adimlar belli ise for loop kullanmak daha mantikli olabilir
		// iki fazla satir yazmaktan, 
		// veya degisimi unutup sonsuz loop'a girmekten kurtulmus oluruz
		scan.close();
	}

}
