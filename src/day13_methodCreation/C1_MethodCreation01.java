package day13_methodCreation;

public class C1_MethodCreation01 {

	public static void main(String[] args) {
		// bir method'u olusturmak o method'u calistirmak icin yeterli degildir.
		// Eger bir method'u calistirmak isterseniz 
		// Method Call ( o method'u cagirmalisiniz) 
		
		// method call yapmak icin method'un adi ve varsa parametreleri yazilmalidir.
		toplama(20,40);
		
		// sadece method call yaptigimizda method calisir
		// eger method'un icinde bir sey yazdiriiyorsak console'da o yaziyi goruruz
		
		// ancak method'umuz return type'a sahipse bize bir sonuc return edecektir
		// bu sonucu ya direk yazdiririz
		
		System.out.println(toplama(15,20));
	
		
		// veya donen sonucu bir variabla'a atayabiliriz

		int sonuc= toplama(10,15);
		System.out.println(sonuc);
	}
	
	
	public static int toplama(int sayi1, int sayi2) {
		
		System.out.println("method calisti");
			
		return sayi1+sayi2;
	}

}
