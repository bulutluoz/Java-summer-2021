package day27_staticKeyword;

public class C01 {
	
	int sayi=10;
	String str="Yasasin eclipse";
	static int sayi2;

	public static void main(String[] args) {
		
		// System.out.println(sayi); // sayi instance bir variable oldugu icin direk main method'dan kullanilamaz
		// instance variable'lara obje uzerinden ulasabilirim
		
		// obje olusturmak icin constructor kullanmaliyim
		// bu class'da constructor var mi ? VAR default constructor var.
		
		C01 obj1=new C01();
		// soldaki C01 : class ismi ve ayni zamanda data turudur
		// sagdaki C01( ) : class ismi ile ayni ama yaninda  ( ) oldugu icin CONSTRUCTOR'dir
		
		// obj1.sayi;  CTE verir cunku ya atama yapmaliyiz veya yazdirmaliyiz
		
		System.out.println(obj1.sayi); // 10
		
		obj1.sayi=44; 
		// System.out.println(sayi); obje urettik diye instance'a direk ulasamayiz, mutlaka obje kullanmaliyiz
		
		System.out.println(obj1.sayi);  // 44
		
		C01 obj2=new C01();
		System.out.println(obj2.sayi); // 44 ? 10 ? 
		
		obj2.sayi=34;
		
		System.out.println(sayi2);
		// Java run time programdir
		

	}

}
