package day24_lists_forEachLoops;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop01 {

	public static void main(String[] args) {
		
		List<String> list1= new ArrayList<>();
		list1.add("ALI");
		list1.add("Veli");
		list1.add("Ayse");
		list1.add("Fatma");
		list1.add("Omer Asim");
		
		

		
		// bu listedeki isimlerden uzunlugu 4 harften fazla olan isimleri yazdiralim
		
		// for-each loop index veya size'a bakmadan tek tek tum elementleri bize getirir
		
		for (String  each : list1) {
			
		    if (each.length()>4) {
				System.out.print(each + " ");
			}
			
		}
		
	}

}
