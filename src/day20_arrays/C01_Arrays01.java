package day20_arrays;

import java.util.Arrays;


public class C01_Arrays01 {

	public static void main(String[] args) {
		/*
		 Soru 1: Verilen 3 elemanli bir array’in 
		 tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.  
		 Ornek; array [1,2,3] ise output [2, 3, 1] olacak.

		 */
		
		int arr[]= {1,2,3};
		
		int temp=arr[0];
		
		arr[0]=arr[1];
		arr[1]=arr[2];
		arr[2]=temp;
		
		System.out.println(Arrays.toString(arr));
		
		// array kac elemntli olursa olsun, tum elementleri bir sola tasiyacak kod yaziniz
		
		int arr2[]= {1,3,9,4,5,8,9,12,15,87};
		
		
		temp=arr2[0];
		
		for (int i = 0; i < arr2.length-1; i++) {
			
			arr2[i]=arr2[i+1];
		}
		System.out.println(Arrays.toString(arr2)); // [3,9,4,6,8,8]
		
		arr2[arr2.length-1]=temp;
		
		System.out.println(Arrays.toString(arr2)); // [3,9,4,6,8,1]

	}

}
