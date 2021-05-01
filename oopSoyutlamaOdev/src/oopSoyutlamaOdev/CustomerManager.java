package oopSoyutlamaOdev;

public class CustomerManager {
	
	//Manager siniflarinda ortak metodlarin oldugu Base bir Manager class'i olusturmustum. Bu class'in adi 
	//UserManager idi. Ayrica tum kullanicalarim icinde ortak bir class olusturmustum bu class'in adi da
	//User idi. Bu class'in altinda ben constructor yapisi ile Main'de hangi kullaniciyi aldiysam o kullaniciya
	//ait islemler yapilmasini istedigimi soyluyorum. Yani Mainde CustomerManager olsuturulurken daha newlenirken
	//bir parametre gerekiyor ve o parametre de bir User tipinde obje olmali. Ayrica UserManager'da ortak olan metodlarimi 
	//burada da olusturdum ve parametre olarak UserManager tipinde bir parametre istedigini soyledim bu metodlarin.
	//Main'de CustomerManager class'indan cagirilan metodlara hangi UserManager tipinde bir obje verilirse  o UserManager 
	//sinifinin metodlari calisacak sekilde ilerliyorum. Yani ben CustomerManager class'i ile hangi kullanici ile
	//ve hangi Manager sinifi ile calisacagimi belirliyorum.
	
	User user;
	
	public CustomerManager(User user) {
		
		this.user = user;
		
	}

	public void login(UserManager userManager) {
		userManager.login(this.user);
	}
	
	public void remindPassword(UserManager userManager) {
		userManager.remindPassword(this.user);
	}
	
	public void signUp(UserManager userManager) {
		userManager.signUp(this.user);
	}

}
