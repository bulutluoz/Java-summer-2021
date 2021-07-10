package day12_stringManipulations;

public class C08_Homework03 {

	public static void main(String[] args) {
// Soru 1) String methodlarini kullanarak " Java ogrenmek123 Cok guzel@ " String’ini
        
        // "Java ogrenmek cok guzel." sekline getirin.
        
        String str = "Java ogrenmek123 Cok guzel@";
                
        str = str.replaceAll("\\d",""); // rakamlari yok eder
        
        System.out.println(str); // Java ogrenmek Cok guzel@
        
        str = str.replace("@","."); // @ yerine . yazar
        
        System.out.println(str); // Java ogrenmek Cok guzel.
        
        str = str.replace("C","c"); // buyuk C yerine kucuk c yazar
        
        System.out.println(str); //Java ogrenmek cok guzel.
        
        // tek satirda yapmanin kodu da su sekildedir
        
        String yeniStr = "J" + str.replaceAll("\\d","").replace("@",".").substring(1).toLowerCase();
        
        System.out.println(yeniStr);
	}

}
