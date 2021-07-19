package day20_arrays;

import java.util.Arrays;

public class C03_Arrays03 {

	public static void main(String[] args) {
		// Verilen bir array'i buyukten kucuge siralayan bir method yaziniz
		
		
		int arr[]= {3,15,10,11,9,1,25};
		
		
		arr = arrayiSirala(arr);
		System.out.println("siralanmis hali : " + Arrays.toString(arr));
		
		// System.out.println(Arrays.toString(arrayiTerstenSirala(arr))); // sonucu sadce yazdirmak icin
	
		arr=arrayiTerstenSirala(arr);
		System.out.println("Tersten siralanmis hali : " + Arrays.toString(arr));
	}

	private static int[] arrayiTerstenSirala(int[] arr) {
		int[] temp=new int[arr.length]; // eski array ile ayni uzunlukta bir array olusturdum
		for (int i = 0; i < temp.length; i++) {
			temp[i]= arr[arr.length-1-i];
		}
		// temp array'i istedigim gibi arr'nin ters siralanisi oldu
		// bunu main method'a dondurmem (return) lazim
		
		return temp;
	}

	private static int[] arrayiSirala(int[] arr) {
		// oncelikle array'i kucukten buyuge siralamaliyiz
		Arrays.sort(arr);
			
		return arr;
	}

}
