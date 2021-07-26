package day22_23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_List01 {

	public static void main(String[] args) {
		
		List <String> isimler = new ArrayList<>();
		// add() listenin sonuna ekleme yapar
		isimler.add("Ali"); 
		System.out.println(isimler); // [Ali]
		isimler.add("Veli");
		isimler.add("Ayse");
		isimler.add("Fatma"); 
		isimler.add("Ali");
	
		
		System.out.println(isimler); // [Ali, Veli, Ayse, Fatma, Ali]
		
		
		// ozel bir index'e eklemek isterseniz, o zaman index'li add method'unu kullanmaliyiz
		
		isimler.add(3, "Nihan");
		System.out.println(isimler); // [Ali, Veli, Ayse, Nihan, Fatma, Ali]
		isimler.add(0, "Mehmet");
		System.out.println(isimler);// [Mehmet, Ali, Veli, Ayse, Nihan, Fatma, Ali]
		
		
		List<String> yeniList=new ArrayList<>();
		
		yeniList.add("Firat");
		System.out.println(yeniList); //[Firat]
		
		// yeniList'in sonuna isimler listesini eklemek istersek 
		yeniList.addAll(isimler);
		System.out.println(yeniList); //[Firat, Mehmet, Ali, Veli, Ayse, Nihan, Fatma, Ali]
		
		
		// bir de int elementlerin oldugu liste olusturalim
		
		List<Integer> sayilar = new ArrayList<>(); // int primitive, Integer wrapper class, non-primitive
		sayilar.add(5);
		
		
		// yeni list'e sayilar list'i ekleyebilir miyim ?
		// farkli bir data turunden liste veya element ekleyemeyiz
		
		// yeniList.addAll(sayilar);
		// yeniList.add(5);
		
		
	}

}
