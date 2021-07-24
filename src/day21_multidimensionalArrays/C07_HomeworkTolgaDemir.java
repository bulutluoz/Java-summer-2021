package day21_multidimensionalArrays;

public class C07_HomeworkTolgaDemir {

	public static void main(String[] args) {
		int arr1[][]= {{1,2},{3,4,5},{6}};
		int arr2[][]= {{7,8,9},{10,11},{12}};
		
		int iUzunluk=0;
		if (arr1.length<arr2.length) {
			iUzunluk=arr1.length;
		}
		else {
			iUzunluk=arr2.length;
		}
			
		System.out.println("i-j= indexleri");
			
		for (int i = 0; i < iUzunluk; i++) {

			int jUzunluk=0;
			if (arr1[i].length<arr2[i].length) {
				jUzunluk=arr1[i].length;
			}
			else {
				jUzunluk=arr2[i].length;
			}
			
			for (int j = 0; j < jUzunluk; j++) {
				
				System.out.println(i+"-"+j+"="+(arr1[i][j]+arr2[i][j]));
				
			}
		}

	}

}