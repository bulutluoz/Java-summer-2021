package day29_passByValue_mutableClass;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue01 {

	public static void main(String[] args) {
		/*
		 Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. 
		 Iki method olusturup list elemanlarini artirmayi deneyelim
		- 1. Method’da elemanlari for each loop kullanarak artirin
		- 2. Method’da elemanlari set method’u kullanarak artirin
		- Method’lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim.

		 */
		
		List<Integer> sayiList=new ArrayList<>();
		
		sayiList.add(10);
		sayiList.add(11);
		sayiList.add(12);
		System.out.println("ilk olusturdugumuz liste : " + sayiList);// [10, 11, 12]
		
		forLoopIleArtir(sayiList);
		System.out.println("forLoopMethod'undan Sonra List : " + sayiList); // [10, 11, 12]
		
		setIleArtir(sayiList);
		System.out.println("set Method'undan sonra main method icinde List : " + sayiList);
		
	}

	private static void setIleArtir(List<Integer> sayiList) {
		// set ile elemanlari artiralim
		
		for (int i = 0; i < sayiList.size(); i++) {
			sayiList.set(i, sayiList.get(i)+5);
			
		}
		
		// loop'dan sonra listeyi yazdiralim
		System.out.println("set method'u icinde artirimdan sonra list " + sayiList);
		
	}

	private static void forLoopIleArtir(List<Integer> sayiList) {
		// for each loop ile elemanlari artiralim
		System.out.print("foreach loop ile artirdigimiz elementler : ");
		for (Integer each : sayiList) {
				each+=5;
			System.out.print(each+ " "); // 15 16 17
		}
		
		System.out.println("");
		System.out.println("foreach loop'dan sonra list : "+sayiList); // [10, 11, 12]
		
		// foreach loop'da atama yapamadigim icin listeyi kalici olarak degistiremedim
		// for loop kullanip get method'u ile elementleri cagirinca da atama yapamadim
		// Dolayisiyla for loop ile elementleri kalici olarak degistiremedik
		
	}

}
