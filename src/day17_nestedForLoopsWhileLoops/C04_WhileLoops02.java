package day17_nestedForLoopsWhileLoops;

public class C04_WhileLoops02 {

	public static void main(String[] args) {
		/*
		 Soru 2 ) For loop ve while Loop kullanarak 
		 3 basamakli sayilardan 15, 20 ve 90’na tam bolunebilen 
		 sayilari yazdirin. 

		 */
		
		
		for (int i = 100; i <=999; i++) {
			
			if (i%15==0 && i%20==0 && i%90==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("");
		
		int i=100;
		
		while(i<1000) {
			if (i%15==0 && i%20==0 && i%90==0) {
				System.out.print(i + " ");
			}
			
			i++;
		}

	}

}
