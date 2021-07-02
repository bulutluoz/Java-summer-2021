package day05_wapper_concatenation;

public class C3_Concatenation02 {

	public static void main(String[] args) {
		
		int sayi=7;
		char ilkHarf='a';
		String str="Java";
		
		
		System.out.println(sayi+str+ilkHarf); // 7Javaaa
		System.out.println(sayi+ilkHarf+str); // 
		
		// 7a yazdirin
		
		System.out.println(sayi+ilkHarf); // 104  

		
		System.out.println(""+sayi+ilkHarf); // 
	}

}
