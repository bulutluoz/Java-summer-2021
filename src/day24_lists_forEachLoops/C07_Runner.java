package day24_lists_forEachLoops;

public class C07_Runner {

	public static void main(String[] args) {
		// Run edici yani C06'da olusturdugumuz 
		// kalibi kullanmak uzere calistiracagimiz class'dir
		
		C06 obj1=new C06();
		
		// Scanner scan = new Scanner(System.in);
		// Scanner class'indan scan isminde bir obje uretiyoruz
		// scan objesinin ozelliklerini System.in parametresi ile belirliyorum
		
		obj1.isim="Mehmet Tekstil";
		obj1.tel="3125478798";
		
		System.out.println(obj1.isim + " " + obj1.tel);
		// obj1 in istedigim ozelliklerine(variable) deger atayabilirim
		// eger deger atamazsam, ilk atanan degeri getirir
		System.out.println(obj1.isciSayisi);
		
		// bir isimle object olusturma sadece 1 defa olabilir
		// ama o objenin ozeelikleri istendigi kadar degistirilebilir
		C06 obj2=new C06();
		
		obj2.isciSayisi=50;
		System.out.println(obj2.isciSayisi); //50
		
		obj2.isciSayisi+=3;
		System.out.println(obj2.isciSayisi); //53
		
		obj2.isciSayisi-=10;
		System.out.println(obj2.isciSayisi); //43
		System.out.println(obj1.isciSayisi); // 40

	}

}
