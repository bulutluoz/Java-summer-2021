package day18_doWhileLoopScope;

public class C04_Scope01 {
	// 1- main method'un disinda olusturulan variable'lara class level variable denir
	
	int sayi1;
	int sayi2=10;
	
	String str1;
	String str2="Java";
	
	// 3- static olmayan variable'lara static alanlardan ulasilamaz
	
	static boolean anladinMi;
	// 2-  static olarak tanimlanan variable'lar class icinde her yerden kullanilabilir
	// (static olsun veya olmasin her method'dan ulasabiliriz ve kullanabiliriz)
	static boolean biliyormusun= true;
	static char harf;
	static String str;
	
	// 4- class level'da olusturulan variable'lar (static olsun veya olmasin)
	// deger atamadan da kullanilanilabilir
	// eger biz deger atamazsak Java class level'daki variable'lara
	// default degerler atar
	// sayisal degerler icin =0 , boolean = false , string= null , char=' '

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");
			i=10;
			String isim="Mehmet";
			System.out.println(isim);
		}
		
		// System.out.println(isim);
		//System.out.println(i); // scope disinda i yi kullanamayiz
		
		//i=10 ; // scope disinda i yi kullanamayiz
		
		
		int sayi;
		sayi=10;
		System.out.println(sayi);
		
		// sayi++; 
		// System.out.println(sayi);
		
		// method1(); // main method static klubune uye, bu klube uye olmayanlari muhatap almaz
		method2();	
		System.out.println("main method icinde anladinmi nin degeri : " + anladinMi);
		System.out.println("main method icinde harf in degeri : " + harf);
		System.out.println("main method icinde str in degeri : " + str);
		
		//System.out.println(str1);

	}
	
	public void method1() {
		
		System.out.println("method1 calisti");
		sayi1=20;
		System.out.println(anladinMi);
		System.out.println(str1);
		
	}
	
	public static void method2() {
		System.out.println("method2 calisti");
		System.out.println(biliyormusun);
		//System.out.println(sayi2);
	}

}
