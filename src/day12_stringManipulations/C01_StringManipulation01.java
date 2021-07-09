package day12_stringManipulations;

public class C01_StringManipulation01 {

	public static void main(String[] args) {
		
		String str= "Java candir";
		
		
		

		System.out.println(str.substring(5)); // candir
		System.out.println(str.substring(10)); // r
		System.out.println(str.substring(11)); // 11=length  hiclik
		System.out.println("====");
		// System.out.println(str.substring(20)); // hata
		
		System.out.println(str.substring(5,8)); // can
		System.out.println(str.substring(2, 3)); // v
		System.out.println(str.substring(5,5)); // hiclik
		System.out.println("====");
		System.out.println(str.substring(5,11)); // candir
		//System.out.println(str.substring(5,1)); // hata
		
		System.out.println(str.substring(3,4) + str.substring(8, 9)); // ad
	}

}
