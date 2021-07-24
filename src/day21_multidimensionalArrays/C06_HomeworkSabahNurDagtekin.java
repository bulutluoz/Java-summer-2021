package day21_multidimensionalArrays;

import java.util.Arrays;

public class C06_HomeworkSabahNurDagtekin {

	public static void main(String[] args) {
		//Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip
	//elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
	//	arr1 = { {1,2},{3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
	int arr1[][] = { {1,2},{3,4,5},{6} };
	
	int arr2[][]= { {7,8,9}, {10,11}, {12} };
	
	int toplamarrayi[]=new int [arr1.length];
	
	for (int i=0; i<arr1.length; i++) {
		int toplam=0;
		for (int j = 0; j <arr1[i].length; j++) {
			toplam+=arr1[i][j];
		}
	  for (int k=0; k<arr2[i].length; k++) {
	        toplam+=arr2[i][k];
	  }
	toplamarrayi[i]=toplam;
	
	
	}
	System.out.println(Arrays.toString(toplamarrayi));
	
	
	
	
	}
		
	}

	


