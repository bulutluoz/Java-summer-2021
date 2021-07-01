package day04_increment_matematiksel_islemler;

public class C1_IncrementDecrement {

	public static void main(String[] args) {

		int sayi1 = 10;
		int sayi2 = 20;

		sayi1 -= 5;
		sayi2 += 10;

		System.out.println(sayi2 / sayi1); // 6

		sayi1 *= 2;
		sayi2++;

		System.out.println(sayi2 / sayi1); // 3

		sayi1 /= 2;

		double sayi3 = sayi2 / 10; // sayi2 integer oldugundan sayi2/10 isleminin sonucunu java 3 olarak bulur
									// ama atama islemi yapilirken sayi3 double oldugu icin
									// bolme isleminin sonucu olan 3'u casting ile 3.0'a cevirir

		System.out.println(sayi3);

		System.out.println(sayi1 * sayi2); // 155
		System.out.println(sayi1 * sayi3); // 15.0

		sayi3 = (double) sayi2 / 10;

		System.out.println(sayi3);

		System.out.println(sayi2); // 31
		System.out.println((double) sayi2); // 31.0
		System.out.println(sayi2); // 31

		sayi2 += 0.2; // sayi2 int,

		System.out.println(sayi2); // 31

	}

}
