package day22_23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_List03 {

	public static void main(String[] args) {
		List <String> isimler = new ArrayList<>();
		
		isimler.add("Ali");
		isimler.add("Ayse");
		isimler.add("Zeki");
		
		isimler.set(1, "Fatma");
		System.out.println(isimler);
		
		System.out.println(isimler.set(2, "Mehmet")); // Zeki
														// delil olarak eski elementi getirir

		System.out.println(isimler);
		
		
	}

}
