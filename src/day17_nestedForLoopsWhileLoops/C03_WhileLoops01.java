package day17_nestedForLoopsWhileLoops;

public class C03_WhileLoops01 {

	public static void main(String[] args) {
		// Soru 1 ) While loop kullanarak 
		// 3 den 13 e kadar(dahil) tum tek tamsayilari ekrana yazdiriniz.


		
		int i=3;
		
		while (i<=13) {
			
			if (i%2==1) {
				System.out.print(i + " ");	
			}
			i++;
		}
	}

}
