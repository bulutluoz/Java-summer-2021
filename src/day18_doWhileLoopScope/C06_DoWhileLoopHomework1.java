package day18_doWhileLoopScope;

public class C06_DoWhileLoopHomework1 {

	public static void main(String[] args) {
		// Soru 1) 9 den 190 e kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.

		int a = 9;

		do {
			if (a % 7 == 0) {
				System.out.print(a + " ");
			}
			a++;
		} while (a <= 190);

		while (a <= 190) {

		}
	}

}
