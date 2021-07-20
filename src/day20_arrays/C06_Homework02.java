package day20_arrays;

import java.util.Arrays;

public class C06_Homework02 {


		public static void main(String[] args) {
			// "java ögren, hayati yasa"  harf harf terse cevırme

			String str = "java ögren, hayati yasa"; // string olarak assign ettim.

			String bolunmusStr[] = str.split(""); // split yöntemi ile arrayi kelimelere boldum.
			System.out.println(Arrays.toString(bolunmusStr)); // burada bölünmüs elementleri yazdirdim.
			// burada böldügüm arrayi tersten yeniden olusturacagim methoda atamak için
			// yaptim.
			String tersCumle = strTersten(bolunmusStr); // burada bolunmus arrayimi tersten methoduna atadým.
			System.out.println(tersCumle); // burada bi üstte atadigim methodu yazdýrdým.
		}

		private static String strTersten(String bolunmusStr[]) { // tersten methodum bu

			String temp = ""; // temporary yani geçici bir String olusturdum
															// deklare ettim uzunluðu ise bolunmus arrayimle ayný
			for (int i = 0; i < bolunmusStr.length; i++) { // forloop oluþturdum i 0 dan basladi kelimeyi sondan basa
															// dogru temp'e ekledim
				temp += bolunmusStr[bolunmusStr.length - 1 - i];
				
				

			}

			return temp; // burada temp kelime kelime tersten yazilmis cumle oldu
		}

	}
	