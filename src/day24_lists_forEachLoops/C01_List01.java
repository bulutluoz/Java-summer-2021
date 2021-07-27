package day24_lists_forEachLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C01_List01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan isimler isteyin ve bunlari bir list’te depolayin. 
		 Kullanici "yeter" yazana kadar isim istemeye devam edin.
		 
       	 Kullanici isim girmeyi bitirdiginde toplam kac isim girdigini 
       	 ve bunlardan kac tanesinin asagidaki listede olan isimlerden oldugunu yazdirin
	
		isimList=Ali , Veli, Ayse, Fatma, Zeki, Kemal
		
		Not : yeter icin kucuk buyuk harf onemli degil ancak isimler icin onemli

		 */
		
		Scanner scan=new Scanner(System.in);
		List<String> girilenIsimler=new ArrayList<>();
		String isim;

		do {
			System.out.println("Lutfen listeye eklemek icin isim giriniz \nBitirmek icin yeter yaziniz");
			
			isim=scan.nextLine(); // kullanicidan isim aldim
			
			if (!isim.equalsIgnoreCase("yeter")) { // yeter degilse ismi listeye ekledim
				girilenIsimler.add(isim);
			}
			
			
		}while(!isim.equalsIgnoreCase("yeter")); // kullanici yeter yazmadigi surece tekrar ettim
		
		// karsilastirmak istedigimiz listeyi olusturalim
		// listenin uzunlugu degismeyecegi icin array olusturup , list'e cevirebilirim
		// boylece 6 ismi tek tek eklemek zorunda kalmam
		
		String isimler[]= {"Ali" , "Veli", "Ayse", "Fatma", "Zeki", "Kemal"};
		List<String> isimList=Arrays.asList(isimler);
		
		// elimizde 2 tane liste var
		// 1- kullanicidan aldigimiz isimlerin oldugu --girilenIsimler--
		// 2- karsilastiracagimiz liste --isimList--
		
		System.out.println("Toplam : " + girilenIsimler.size() + " isim girdiniz");
		int count=0;
		
		for (int i = 0; i < girilenIsimler.size(); i++) { // loop ile girilen isimleri tek tek cagirdim
			
			if (isimList.contains(girilenIsimler.get(i))) {
				count++; // eger cagirdigim isim isimList'de varsa count'u bir artirdim
			}
			
		}
		System.out.println("girdiginiz isimlerden " + count + " tanesi bendeki listede kayitli");
		scan.close();
	}

}
