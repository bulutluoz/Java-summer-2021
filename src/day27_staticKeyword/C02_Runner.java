package day27_staticKeyword;

public class C02_Runner {

	@SuppressWarnings("static-access")  // bu main method'da static access ile ilgili
										// isleyisi bozmayan kucuk bir hata var ve ben bunu onayliyorum
										// satir no 32 ve 38
	public static void main(String[] args) {
		
		// C01'deki variable'lara ulasmak istesem
		// ilk once C01 deki variable'larin instance mi yoksa static mi olduguna bakmam gerekir
		// ornegin sayi ve str instance variable'lardir, dolayisiyla onlara obje uzerinden ulasabilirim
		
		C01 obj1= new C01();
		System.out.println(obj1.str); // Yasasin eclipse
		
		obj1.str= "Yasasin Faruk";
		
		System.out.println(obj1.str); // Yasasin Faruk
		
		
		C01 obj2=new C01();
		System.out.println(obj2.str); // Yasasin eclipse
		
		
		// sayi2 variable'i static oldugu icin obje'ye IHTIYAC DUYULMAZ
		
		System.out.println(C01.sayi2); // 0
		
		C01 obj3=new C01();
		
		obj3.sayi2=27;  // CTE vermez... 
						// Ancak altini sari cizer ve satir numarasina unlem koyar
						// Cunku Java daha kisa ve emin bir yol varken nicin obje uzerinden ulastin diye sikayet eder
						// Bu kodun calismasina engel degildir onun icin CTE vermez
						// Fakat gereksiz bir islem oldugundan Java bizi uyarir
		
		System.out.println(obj3.sayi2); // 27
		
		C01.sayi2=34;  	// static variable'lara class ismi.variable ismi yazilarak ulasilabilir
						// buna static way denir
		
		System.out.println(C01.sayi2);  // 34 static variable'lar ulasabilen her obje
										// ve her class icin ortaktir
										// okul adi gibi 
		
		System.out.println(obj2.sayi2); // 34
		System.out.println(obj1.sayi2); // 34

	}

}
