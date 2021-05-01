package oopSoyutlamaOdev;

public class UserManager {
	
	//Bu class Manager classlarim icin base niteliginde bir class'dir. Manager classlarima ait ortak metodlar bu classlarda 
	//bulunmaktadir. Manager tipinde tum classlarim bu class'i extend etmektedir. Bu classda bulunan metodlar Manager classlarinda
	//override edilmistir. Yani bu su demek diger classlardaki metodlarin bazilari bu classlardaki metodlar ile ayni imzaya sahip 
	//ama kendilerince farkli islemlerinde bu metodlarda yapilmasi gerekiyorsa override ediyoruz bu metodlari bu class'i extend
	//eden diger classlarin icinde. Tum Manager classlari icin ortak ayar gerektiren durumlari bu metodlarin altina yazip ortak
	//ayar gerektiren durumlarda bu class'i ve metodlarini cagirip Manager classlari icin ortak ayar gerektiren durumlari bir anda
	//yapabiliriz.
	
	//Burada fonksiyonlara verilen user parametresi onemli cunku InstructorManager'Da ve StudentManager'da override edilen 
	//metodlari icerisnde bizlere User tipinde bir user parametresi gerrekiyor cunku user'ın sahip oldugu ozellikleri 
	//orada kullaniyoruz. Ben eger burada bu parametreyi vermeyip InstructorManager'da veya StudentManager'da override
	//edilen metodlarda verirsem daha kodlarim derlenmeden hata verecektir. Cunku benim base class'im burasi ve InstructorManager
	//ile StudentManager classlari bu base class'i extend edip metodlarini override ediyor. Bu durum da base class'im burasi
	//ise eger ve benim bu metodlarim ortaksa ve StudentManager ile InstructorManager'da bu metodlar override edilecekse 
	//imzalari ayni olmali yani metod isimleri ve parametreleri ayni olmali.
	
	public void login(User user) {
		System.out.println("Ortak Ayar");
	}
	
	public void remindPassword(User user) {
		System.out.println("Ortak Ayar");
	}
	
	public void signUp(User user) {
		System.out.println("Ortak Ayar");
	}
	
}
//base class  
