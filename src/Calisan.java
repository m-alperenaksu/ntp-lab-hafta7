
public class Calisan {
	protected String AdSoyad;
	protected int Telefon;
	protected String Email;
	public Calisan(String adSoyad, int telefon, String email) {
		super();
		AdSoyad = adSoyad;
		Telefon = telefon;
		Email = email;
	}
	protected String getAdSoyad() {
		return AdSoyad;
	}
	protected void setAdSoyad(String adSoyad) {
		AdSoyad = adSoyad;
	}
	protected int getTelefon() {
		return Telefon;
	}
	protected void setTelefon(int telefon) {
		Telefon = telefon;
	}
	protected String getEmail() {
		return Email;
	}
	protected void setEmail(String email) {
		Email = email;
	}
	
	public void Giris() {
		System.out.println(getAdSoyad() + " giriş yaptı.");
	}
	
	public void Cikis() {
		System.out.println(getAdSoyad() + " çıkış yaptı.");
	}
	
	public void Yemek() {
		System.out.println(getAdSoyad() + " yemek yedi.");
	}
	
	
}
