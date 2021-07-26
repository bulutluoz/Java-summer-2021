package day22_23_arrayLists;

import java.util.Arrays;
import java.util.List;

public class C08_List08 {

	public static void main(String[] args) {
		
		String arr[]= {"3","5","7"};
		
		List<String> arrList= Arrays.asList(arr);
		
		System.out.println("list olarak " + arrList);
		
		arr[1]="Ali"; // array'in bir elemanini degistirdigimde
						// otomatik olarak list'i de degistiriyor
		
		System.out.println("list olarak2 " + arrList);
		
		
		arrList.set(0, "Ayse"); // biz listeden degistirdik ama
								// java array'i de degistiriyor
		
		System.out.println("list :" + arrList);
		System.out.println("array : " + Arrays.toString(arr));

	}

}
