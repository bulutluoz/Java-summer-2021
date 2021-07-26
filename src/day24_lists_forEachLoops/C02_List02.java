package day24_lists_forEachLoops;

import java.util.ArrayList;
import java.util.List;

public class C02_List02 {

	public static void main(String[] args) {
		/*
		 2 ) 	Input olarak verilen 2 listeyi Parametre olarak kabul edip, 
		        ortak isimleri yazdiran bir method yaziniz
		
		INPUT : 	list1={Ali,Veli,Ayse,Fatma,Omer}
             		list2={Ali,Kemal,Hatice,Fatma,Omer,Yusuf}
		OUTPUT =[Ali,Fatma,Omer]

		 */
		
		List<String> list1= new ArrayList<>();
		list1.add("ALI");
		list1.add("Veli");
		list1.add("Ayse");
		list1.add("Fatma");
		list1.add("Omer");
		
		
		List<String> list2= new ArrayList<>();
		list2.add("Ali");
		list2.add("Kemal");
		list2.add("Hatice");
		list2.add("FATma");
		list2.add("Omer");
		list2.add("Yusuf");
		
		
		ortakList(list1,list2);

	}

	private static void ortakList(List<String> list1, List<String> list2) {
		List<String> ortakIsimler =new ArrayList<>();
		
		for (int i = 0; i < list1.size(); i++) {// list1 den isimleri getirdi
			
			for (int j = 0; j < list2.size(); j++) { // list2 den isimleri getirdi
				
				if (list1.get(i).equalsIgnoreCase(list2.get(j))) {
					
					ortakIsimler.add(list2.get(j));
				}
				
			}
			
		}
		System.out.println(ortakIsimler);
	}

}
