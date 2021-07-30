package day28_staticBlock_passByValue;

public class C01_StaticBlocks {
	
	static int sayi=10;
	
	static {
		System.out.println("1.static block calisti");
		sayi=20;
	}

	static {
		System.out.println("2.static block calisti");
		sayi=30;
	}
	
	static {
		System.out.println("3. static block calisti");
		sayi=45;
	}

	public static void main(String[] args) {
		
		System.out.println("main method'un ilk satirinda sayi : " + sayi); // 
		
	}
	
	static {
		System.out.println("main methoddan sonraki static block calisti");
		sayi=100;
	}

}
