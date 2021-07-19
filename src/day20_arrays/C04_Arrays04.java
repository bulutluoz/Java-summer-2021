package day20_arrays;

import java.util.Arrays;

public class C04_Arrays04 {

	public static void main(String[] args) {
		String str= "Java, candir." ;
		
		
		// split method'u bize bir array doner
		// donen array'i ya direk yazdirmaliyiz
		System.out.println(Arrays.toString(str.split(",")));
		
		// veya method'dan donen String barindiran bir array oldugundan
		// bir array olusturup ona assign edebiliriz
		
		String bolunmusKelimeArray[]= str.split(","); // Java   _candir
		System.out.println(bolunmusKelimeArray[1]); // _candir.
		
		String bolunmusKelimeArray2[]= str.split("a");
		System.out.println(Arrays.toString(bolunmusKelimeArray2)); // [J, v, , c, ndir.]
		System.out.println(bolunmusKelimeArray2.length);// 4
		
		String bolunmusKelimeArray3[]= str.split("");// String'i karakterlere ayirir
		System.out.println(Arrays.toString(bolunmusKelimeArray3));
		

		String cumle="Java ogren, rahat yasa"; // cumle kac kelimeden olusur ?
		
		String kelimeArrayi[]=cumle.split(" ");
		
		System.out.println("Cumledeki kelime sayisi : " + kelimeArrayi.length);
		
		//harf sayisini 
		String cumle2=cumle.replaceAll("\\W", "");	
		System.out.println(cumle2);
		System.out.println(cumle2.length());// 18
		
		String harfArrayi[]=cumle2.split("");
		System.out.println(harfArrayi.length); // 18
		
	}

}
