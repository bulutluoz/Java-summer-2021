package day25_constructor;

public class C03 {
	
	int sayi=10;
	String isim="Mehmet";
	// ayni package daki farkli class'lardan bu variable'lara ulasabiliriz
	// cunku access modifier yazmazsak default access modifier kullanilir
	// access modfier default ise ayni paketten heryerden kullanilabilir

	public static void main(String[] args) {
		
		// sayi=20; sayi degiskeni static olmadigi icin main method'dan kullanamam
		// deneme(); deneme method'u static olmadigi icin main method'dan cagiramam
		
		C03 obj1=new C03();
		obj1.deneme();
		// Ayni class'da oldugumuz halde static olmadigi icin kullanamadigimiz
		// variable ve method'lari obje olusturarak kullanabiliriz

	}
	
	
	private void deneme() {
		
		System.out.println("deneme methodu calisti");
	}

}
