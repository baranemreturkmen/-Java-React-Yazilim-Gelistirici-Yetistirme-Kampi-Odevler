package oopSoyutlamaOdev;

public class InstructorManager extends UserManager{
	
	//Bu class'da instructor'a ait islemler yapilmakta. Override edilen metodlar student'da da bulunan ortak metodlardir.
	//Override edilen metodlara CustomerManager altinda bir UserManager objesi olusturup Mainde CustomerManager'a
	//verilen UserManager objesinin tipine bagli olarak ulasilmaktadir. Eger Main'de CustomerManager'a InstructorManager
	//objesi verilirse kodlar CustomerManger'da bulunan metodlarin altindan burada ki override edilen metodlara dallanacak.
	//Override edilmeyen metodlar ise sadece InstructorManager class'ına yani sadece instructor'a has metodlardir. Bu metodlara
	//ulasilmak istenirse Mainde direkt olarak InstructorManager'den olustrudugumuz obje vasitasiyla ulasilmalidir.
	
	@Override
	public void login(User user) {
		System.out.println(user.userName+" ile giris yapildi.");
	}
	
	@Override
	public void remindPassword(User user) {
		System.out.println(user.userName+" hocanin sifresi "+user.password+" 'dir");
	}
	
	@Override
	public void signUp(User user) {
		System.out.println(user.userName+" hoca "+user.password+" sifresi ile kayit oldu.");
	}
	
	//Tek sertifika eklenmek istendigi zaman kullanilan metod
	public void addCertificate(Instructor instructor,String certificate) {
		instructor.certificates.add(certificate);
		instructor.certificateNumber+=1;
	}
	
	//Birden fazla sertifikayi ayni anda eklemek istersem kullanilan metod
	//for dongusu ile eklenmek istenen sertifikalar teker teker yukarida ki
	//addCertificate metodunda eklenmektedir.
	public void addMultipleCertificate(Instructor instructor,String[] certificates) {
		
		for (String certificate : certificates) {
			addCertificate(instructor, certificate);
		}
	}
	
	//Maas arttirmak icin kullandigim metod
	public int salaryIncrease(Instructor instructor,int increase) {
		
		return instructor.salary+=increase;
		
	}
	
	//Maas dusurmek icin kullandigim metod. Maas 0'dan dusuk olamayacagi icin asagida bir kontrol mekanizmasi kurdum
	public int salaryDecrease(Instructor instructor,int decrease) {
		
		if(instructor.salary-decrease>=0) {
			instructor.salary-=decrease;
		}
		else {
			System.out.println("Hocanin maasi 0'dan dusuk olamaz!!!!");
		}
		return instructor.salary;
		
	}

}
