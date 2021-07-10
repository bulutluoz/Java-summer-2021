package day05_wapper_concatenation;

public class C1_WrapperClass {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		String isim = "Mehmet";
		//int sayi = 10;

		System.out.println(isim.charAt(2)); // h
		// isim. dedigimizde bircok method listeleniyor, cunku isim variable'inin data
		// turu String
		// ve String non-primitive dir.
		// non-primitive deger'in yaninda method'lar vardir
		// sayi. sayi variable'inin data turu int
		// ve int primitive dir
		// primitive data turleri sadece value'ya sahiptirler method'lari yoktur.

		// ***********************************************************************
		// Java primitive data turleri icin de method'larin kullanilabilmesi icin
		// her primitive data turu icin bir WRAPPER CLASS olusturmus
		// ***********************************************************************

		Integer sayi2 = 10;
		System.out.println(sayi2.MAX_VALUE); // int'in alabilecegi max deger 2147483647
		System.out.println(sayi2.MIN_VALUE); // int'in alabilecegi min deger -2147483648

		// short'un min ve max degerlerini yazdirin

		Short sayi3 = 0;
		System.out.println(sayi3.MAX_VALUE); // 32767
		System.out.println(Short.MIN_VALUE); // -32768

		// Wrapper Class kullanimina bir ornek verelim
		String okulNo = "858";

		// Eger String bir variable sadece sayilardan olusuyorsa, bu String'i int'a
		// cevirebiliriz

		int okulNoSayiOlarak = Integer.parseInt(okulNo);

		// System.out.println(okulNo++); okulNo String olarak tanimlandigi icin
		// matematiksel islem yapilamaz

		System.out.println(++okulNoSayiOlarak);

		Character basHarf = 'a';

		System.out.println(basHarf.charValue()); // a

		System.out.println(Character.toUpperCase('a'));

	}

}
