package day18_doWhileLoopScope;

public class C05_Scope02 {
	
	// 7- eger birden fazla local'de (method'da) kullanacaginiz variable varsa
	// bunu class level'da olusturmalisiniz
	// 8- variable'in static olup olmamasina nasil karar verirsiniz ?
	// bu sorunun cevabi variable'in kullanilacagi local'lerle ilgilidir
	// eger kullanilacak local static ise o zaman variable'i static yapmak zorundayiz
	
	int sayiClass=10;
	static int sayiClassStatic;

	public static void main(String[] args) {
		
		// 5- class level'da olmayan variable'lara local variable denir
		// 6- local variable'lar static olarak tanimlanamaz
		int sayiMain=10;
		System.out.println(sayiMain);
		// System.out.println(sayiClass);
		sayiClassStatic++;
		
		// local variable'lar deger atanmadan olusturulabilir
		// ANCAK deger atanmadan KULLANILAMAZ
		int sayi;
		sayi=10;
		System.out.println(sayi);
	}
	
	public void method1() {
		// System.out.println(sayiMain);
	
	
	}
	
	
	public static void method2() {
		// System.out.println(sayiMain);
		
	}

}
