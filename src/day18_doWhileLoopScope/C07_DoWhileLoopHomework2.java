package day18_doWhileLoopScope;

public class C07_DoWhileLoopHomework2 {

	public static void main(String[] args) {
		// Soru 2 ) ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin.

		char m = 'm';
		char c = 'c';

		while (c <= m) {
			System.out.print(m + " ");

			m--;
		}
	}

}
