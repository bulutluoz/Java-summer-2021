package day14_methodCreationForLoop;

public class C05_MethodOverloading {

	public static void main(String[] args) {
		// 
		
		String str= "Java candir";
		
		System.out.println(str.substring(5)); // candir
		System.out.println(str.substring(5,7)); // ca
		
		// 
		
		String isim="Mehmet";
		String soyisim="Bulut";
		int sayi1 = 10;
		int sayi2 = 20;
		double sayi3= 15.0;
		double sayi4= 3.14;
		
		toplama(isim,soyisim);
		toplama(sayi1,sayi2);
		toplama(sayi3,sayi4);
		
		toplama(20,45.3);
		
		
		toplama (45.3, 20) ;

	}

	private static void toplama(double sayi3, double sayi4) {
		System.out.println(sayi3+sayi4);
		System.out.println("1.method");
		
	}

	private static void toplama(int sayi1, int sayi2) {
		System.out.println(sayi1+sayi2);
		
	}
	
	private static void toplama(int sayi1, double sayi3) {
		System.out.println(sayi1+sayi3);
		
	}
	
	private static void toplama(double sayi1, int sayi3) {
		System.out.println(sayi1+sayi3);
		System.out.println("4.method");
		
	}
	

	private static void toplama(String isim, String soyisim) {
		
		System.out.println(isim +soyisim);
	}

}
