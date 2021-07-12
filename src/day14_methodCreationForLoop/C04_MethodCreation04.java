package day14_methodCreationForLoop;

import java.util.Scanner;

public class C04_MethodCreation04 {

	public static void main(String[] args) {
		/*
		 Soru 4) Kullanicidan ismini, soyismini 
		 ve bosluk birakmadan 16 hane olarak kredi karti numarasini alin. 
		 
		 Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde, 
		 KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde 
		 duzelten 2 method yazin, 
		 ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun.

		 */
		
		
		// mehmet, MEHMET, Mehmet, MEhmet
		// Mehmet Bulutluoz 1234 5698 7854 1256
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi yaziniz...");

		String musteriIsmi=scan.next();
		
		musteriIsmi = ismiDuzelt(musteriIsmi);
		
		System.out.println("Lutfen soyisminizi yaziniz...");
		
		String musteriSoyismi=scan.next();
		
		musteriSoyismi= ismiDuzelt(musteriSoyismi);
		
		// pratik kullanim acisindan baba adi, anne adi, anne kizlik soyadi vb..
		// tum bilgileri ayni method'u kullanarak istedigimiz formata cevirebiliriz.
		System.out.println("Lutfen kredi kart numaranizi\narada bosluk olmadan yaziniz...");
		String kkNo=scan.next();
		
		String yeniKkNo = kkNoDuzelt(kkNo);
		
		
		System.out.println(musteriIsmi + " "+ musteriSoyismi + "\n"+ yeniKkNo);
		scan.close();
		
	}

	public static  String kkNoDuzelt(String kkNo) {
		kkNo= kkNo.replace(" ","");
		kkNo= kkNo.substring(0,4) + " " + kkNo.substring(4,8) + " " +
				kkNo.substring(8,12)+ " " +kkNo.substring(12);
		
		return kkNo;
		
	}

	public static String ismiDuzelt(String musteriIsmi) {
		
		// Bu method'un amaci musteri ismini nasil yazarsa yazsin
		// ilk harf buyuk digerleri kucuk harf olacak sekilde duzenlemek
		// basta sonda bosluk birakmissa onlari da yokedlim
		
		musteriIsmi = musteriIsmi.trim(); // atama yapmazsak degisiklik kalici olmaz
		
		musteriIsmi = musteriIsmi.substring(0, 1).toUpperCase() + 
						musteriIsmi.substring(1).toLowerCase();
		// musteri Isminde yaptigim degisiklikleri main method'a gonderebilmek icin 
		// return type'i void yerine variable'in data turune uygun bir sekle dondurmeliyiz 
		return musteriIsmi;
	}

}
