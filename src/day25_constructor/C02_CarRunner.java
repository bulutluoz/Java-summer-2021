package day25_constructor;

public class C02_CarRunner {

	public static void main(String[] args) {
		
		C01 car1=new C01();
		
		/* bir esitlikte sol taraf declaration
		 declaration'da data turu, variable ismi
		 String str= "Mehmet";
		 Data turu class ismi olabilir
		 primitive data turlerini java olusturmustur, biz primitive data turu olusturamayiz
		 non-primitive data turlerini java da olusturabilir, biz de olusturabiliriz
		 
		 C01 car1 yazdigimizda C01 hem class ismi, hem de car1 objesinin non-primitive data turudur
		
		new C01();  esitligin sagi deger olusturma
		new : keyword dur ve yeni bir obje olusturacagimizi beyan eder
		C01() ise constructor'dir
		*/ 
		
		car1.fiyat=10000;
		car1.ilanNo=1001;
		car1.marka="Toyota";
		car1.model="Corolla";
		car1.yil=2020;
		// variable'lar sadece deger atamasi yapar
		System.out.println(car1.fiyat+", " + car1.ilanNo + ", "+ car1.marka+", "+ 
							car1.model+", "+ car1.yil);
		
		car1.maxHiz(200);
		car1.yakit("dizel");
		// method'larin ne yapacagini method belirler
		
		
		// bir araba daha olusturmak istersem 
		C01 car2= new C01();
		
		System.out.println(car2.fiyat+", " + car2.ilanNo + ", "+ car2.marka+", "+ 
				car2.model+", "+ car2.yil); // 0, 0, null, null, 0

		car2.fiyat=15000;
		car2.ilanNo=1002;
		car2.marka="Opel";
		car2.model="Astra";
		car2.yil=2010;
		
		System.out.println(car2.fiyat+", " + car2.ilanNo + ", "+ car2.marka+", "+ 
				car2.model+", "+ car2.yil); // 15000, 1002, Opel, Astra, 2010
		
		
		car2.yakit("Benzin");
	

	}

}
