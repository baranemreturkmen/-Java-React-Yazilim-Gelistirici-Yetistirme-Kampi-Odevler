package oopSoyutlamaOdev;

public class InstructorManager extends UserManager{
	
	//Bu class'da instructor'a ait islemler yapilmakta. Override edilen metodlar student'da da bulunan ortak metodlardir.
	
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
