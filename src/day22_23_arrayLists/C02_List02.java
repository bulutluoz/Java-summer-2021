package day22_23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_List02 {

	public static void main(String[] args) {
		
		List<Integer> sayilar = new ArrayList<>();
		
		sayilar.add(10);
		sayilar.add(20);
		
		System.out.println(sayilar.size()); // 2
		System.out.println(sayilar.isEmpty());// false
		System.out.println(sayilar);
		
		sayilar.add(30);
		sayilar.add(40);
		System.out.println(sayilar);// [10, 20, 30, 40]
		
		//System.out.println(sayilar.remove(2)); // 30
		// remove method'u iki turlu kullanilabilir
		// 1- silmek istedigimiz elementin index'ini yazarsak
		// o elemnti siler ve delil olarak sildigi elementi bize dondurur
		int silinenEleman =sayilar.remove(2);
		
		
		System.out.println(sayilar); //  [10, 20, 40]

		
		sayilar.add(silinenEleman);
		System.out.println(sayilar); // [10, 20, 40, 30]
		
		// remove ikinci yontem olarak direk silmek istedigimiz degeri yazabiliriz
		
		// sayilar.remove(20);
		// System.out.println(sayilar);
		// eger listemiz sayilardan olusuyorsa biz silmesini istedigimiz elementi yazdigimizda
		// java index olarak algilar
		// ama String liste icin boyle bir problem olmaz
		
		List<String> isimler = new ArrayList<>();
		isimler.add("Ali");
		isimler.add("Ayse");
		isimler.add("Zeki");
		
		System.out.println(isimler.remove("Zeki")); //true
		System.out.println(isimler); //[Ali, Ayse]
		
		isimler.remove("Ayse");
		System.out.println(isimler); // [Ali]
		
		boolean sonuc = isimler.remove("Mehmet");
		
		if (sonuc) {
			System.out.println("Mehmet'i buldum ve sildim");
		} else {
			System.out.println("Mehmet'i bulamadim dolayisla da silemedim");
		}

		isimler.remove(0);
		System.out.println(isimler); // []
		
		isimler.add("Ali");
		isimler.add("Ayse");
		isimler.add("Zeki");
		System.out.println(isimler); // [Ali, Ayse, Zeki]
		isimler.removeAll(isimler);
		
		System.out.println(isimler); // []
		
	}

}
