package day08_ternaryOperator;

public class C3_Ternary {

	public static void main(String[] args) {
		
		
		int sayi=50;
		
		String sonuc = sayi%2==0 ? "Sayi cift" : "Sayi tek";
		
		System.out.println(sonuc);
		
		System.out.println(sayi>100 ? "Sayi 100'den buyuk " : 10);
		
		// direk yazdirdigimiz zaman sonuclarin ikisi ayni cinsten olmak zorunda degil
		
		
		// String sonuc1 = sayi>100 ? "Sayi 100'den buyuk " : 10 ;
		//  farkli data turundeki sonuclar icin atama yapamayiz
		
		int y = 1;
		int z = 1; 
		
		int a = y<10 ? y++ : z++;
		
		
		System.out.println(y + "," + z + "," + a); 
		
		
		
		
		

	}

}
