package day12_stringManipulations;

public class C09_Test {

	public static void main(String[] args) {
		
		String str= "Java kolaydir";
		
		System.out.println(str.endsWith("r"));
		System.out.println(str.endsWith("ir"));
		System.out.println(str.endsWith("dir"));
		System.out.println(str.endsWith(""));
		System.out.println(str.endsWith("Java kolaydir"));
		
		
		System.out.println(str.startsWith("J"));
		System.out.println(str.startsWith("Java"));
		System.out.println(str.startsWith(""));
		System.out.println(str.startsWith("Java kolaydir"));

	}

}
