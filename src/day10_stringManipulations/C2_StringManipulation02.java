package day10_stringManipulations;

public class C2_StringManipulation02 {

	public static void main(String[] args) {
		
		String str = "Java guzeldir";
		
		System.out.println(str.length()); // 13
		
		
		String str2="";
		
		System.out.println(str2.length()); //0
		
		str2=null;

		 // System.out.println(str2.length()); //hata verir
		
		// str'in son harfinin index'i nedir ?  
		// str"in uzunlugu 13
		// son harfin index'i 12 
		
		String str3 = "kjsdk;jg;ovaihdgv ;sudf;jegdf liugF;J EDGF;ILUH;KE.M FAWREJUO;H;OJWAE G";
		
		// STR3'UN son harfinin index'i ==> str.length()-1 
		System.out.println(str3.length()-1); 
		
		
		
	}

}
