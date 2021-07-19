package day19_arrays;

import java.util.Arrays;

public class C02_Arrays02 {

	public static void main(String[] args) {
		
		int arr[]= new int[5];
		
		System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]
		
		// ben bir kez olusturdugum in sonradan uzunlugunu degistirebilir miyim ?
		
		// [0, 0, 0, 0, 0, 5]
		
		// arr[5]=5;
		
		
		// array'in length'i sonradan degistirilemez
		// array'i kullanissiz yapan da bu ozelligidir
		
		arr[2]=1;
		System.out.println(Arrays.toString(arr)); // [0, 0, 1, 0, 0]
		
		
		
		arr = new int[6];// bu ekleme yapmaz,deger olarak 6 elemntlik yeni bir array atar
		
		System.out.print(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0]
		
		
		// ARRAY'in length'i DEGISTIRILEMEZ................

	}

}
