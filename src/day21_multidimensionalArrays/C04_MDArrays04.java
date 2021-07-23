package day21_multidimensionalArrays;

import java.util.Arrays;

public class C04_MDArrays04 {

	public static void main(String[] args) {
		/*
		 Soru 4) Asagidaki multi dimensional array段n 
		 ic array値erindeki tum elemanlarin toplamini birer birer bulan 
		 ve herbir sonucu yeni bir array段n elemani yapan 
		 ve yeni array段 ekrana 	yazdiran bir program yaziniz 
		 
		 { {1,2,3}, {4,5}, {6,7} }
	
		Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}

		 */
		
		
		int arr[][]={ {1,2,3}, {4,5}, {6,7} };
		
		// her bir inner array'in elemanlarinin toplamini yeni bir array'e element olarak yazacagiz
		
		int toplamlarArrayi[]= new int[arr.length]; // inner array sayisina uygun bir array olusturacak

		
		
		for (int i = 0; i < arr.length; i++) {
			
			int elementlerToplami=0;
			
			for (int j = 0; j < arr[i].length; j++) {
				
				elementlerToplami+=arr[i][j];			
				
			}
			
			toplamlarArrayi[i]=elementlerToplami;
			
		}	
		System.out.println(Arrays.toString(toplamlarArrayi));
		
		
	}

}
