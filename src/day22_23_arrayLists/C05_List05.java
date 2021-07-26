package day22_23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_List05 {

	public static void main(String[] args) {
		// 200'e kadar olan fibonacci sayilarini bir list olarak yazdirin
		// 0,1,1,2,3,5,8,13,21,34,
		
		List<Integer> fibonacci=new ArrayList<>();
		
		fibonacci.add(0);
		fibonacci.add(1);
		fibonacci.add(1);
		
		System.out.println(fibonacci);
		
		int sayi=0;
		int i=1;
		
		while (sayi<200) {
			
		sayi=fibonacci.get(i)+fibonacci.get(i+1);	
		if(sayi<200) {
			fibonacci.add(sayi);
		}
	
		i++;		
		}	
		System.out.println(fibonacci);
	}

}
