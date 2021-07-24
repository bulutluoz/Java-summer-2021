package day21_multidimensionalArrays;

public class C05_HomeworkHanimAcar {

	public static void main(String[] args) {
		//Asagidaki multi dimensional array’lerin ic array’lerinde
		// ayni index’e sahip elemanlarin toplamini ekrana yazdiran bir program yaziniz.
		//(Zor soru) arr1 = { {1,2}, {3,4,5}, {6} } ve
		//           arr2 = { {7,8,9}, {10,11}, {12} }
				int arr1[][] = { {1,2}, {3,4,5}, {6} };
				int  arr2[][] = { {7,8,9}, {10,11}, {12} };
				int ikiArraysTotal=0;
				
				if(arr1.length<=arr2.length) {
				for (int i=0;i<arr1.length;i++) {
						
					if(arr1[i].length<=arr2[i].length) {
					for (int j=0;j<arr1[i].length;j++) {
						
							ikiArraysTotal+=arr1[i][j]+arr2[i][j];// 1+7    2+8
						
					}
					}
					else if(arr2[i].length<arr1[i].length) {
						for (int j=0;j<arr2[i].length;j++) {
								ikiArraysTotal+=arr1[i][j]+arr2[i][j]; //3+10  4+11
					}
					}
				}
				System.out.println(ikiArraysTotal);
			}
				else {
					
					for (int i=0;i<arr2.length;i++) {
						
						if(arr1[i].length<=arr2[i].length) {
						for (int j=0;j<arr1[i].length;j++) {
							
								ikiArraysTotal+=arr1[i][j]+arr2[i][j];
							
						}
						}
						else {
							for (int j=0;j<arr2[i].length;j++) {
									ikiArraysTotal+=arr1[i][j]+arr2[i][j];
						}
						}
					}
					System.out.println(ikiArraysTotal);
				}
	}

}
