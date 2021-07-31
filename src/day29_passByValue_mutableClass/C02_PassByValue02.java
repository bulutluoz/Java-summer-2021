package day29_passByValue_mutableClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_PassByValue02 {

	public static void main(String[] args) {
		/*
		 Soru4 : Bir list ve bir array olusturalim ve 
		 eleman olarak 10,11,12 ekleyelim. 
		 Iki method olusturup list ve array’i degistirmeyi deneyelim
		1. Method’da array’e yeni bir array assign edelim ve yeni halini yazdiralim
		2. Method’da list’e yeni bir list assign edelim ve yeni halini yazdiralim
		
		- Method call’dan sonra main method’da yeniden yazdirip 
		degisip degismediklerini kontrol edelim. 


		 */
		
		int arr[]= {10,11,12};
		System.out.println("ilk olustugunda array : " + Arrays.toString(arr));//[10, 11, 12]
		
	
		arrayiDegistir(arr);
		System.out.println("arrayiDegistir method'u calistiktan sonra main method icinde arr " + 
		Arrays.toString(arr)); // [10, 11, 12]
		
		List<Integer> sayiList=new ArrayList<>();
		
		sayiList.add(10);
		sayiList.add(11);
		sayiList.add(12);
		System.out.println("ilk olusturdugumuz liste : " + sayiList);// [10, 11, 12]
		
		listiDegistir(sayiList);
		
		System.out.println("listiDegistir method'u calistiktan sonra main method icinde list : "+ sayiList);
		
		
	}

	private static void listiDegistir(List<Integer> sayiList) {
		// bu method'da sayiList'e yeni bir deger atayalim
		sayiList=new ArrayList<>();
		sayiList.add(50);
		System.out.println("Method icinde degisen list : " + sayiList );
		
	}

	private static void arrayiDegistir(int[] arr) {
		// bu method'da array'e yeni bir array assign edelim
		
		
		arr= new int[4];
		arr[0]=15;
		arr[1]=25;
		arr[2]=35;
		arr[3]=45;
		
		System.out.println("method icinde arr : " + Arrays.toString(arr));
	}

}
