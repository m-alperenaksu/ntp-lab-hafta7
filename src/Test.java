
public class Test {

	public static void main(String[] args) {
		Calisan c1 = new Calisan("Ahmet", 5824, "a@gmail.com");
		c1.Giris();
		c1.Cikis();
		
		
		Akademisyen a1 = new Akademisyen("mehmet" , 2548, "m@gmail.com" , "Bil. Müh.", "Akademisyen","Java");
		
		a1.DerseGir();
		a1.Giris();
		
		OgretimGor o1 = new OgretimGor("hasan" , 2568, "h@gmail.com" , "Bil. Müh.", "Akademisyen","C++" , "Prof. Dr.");
		o1.DerseGir();
	
		o1.setSicilNo(56454);
		
		System.out.println(o1.getSicilNo());
		
	}

}
