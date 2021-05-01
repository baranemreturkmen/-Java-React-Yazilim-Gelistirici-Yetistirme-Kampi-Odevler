package oopSoyutlamaOdev;

public class StudentManager extends UserManager{
	
	//Bu class'da student'a ait islemler yapilmakta. Override edilen metodlar instructor'da da bulunan ortak metodlardir.
	//Override edilen metodlara CustomerManager altinda bir UserManager objesi olusturup Mainde CustomerManager'a
	//verilen UserManager objesinin tipine bagli olarak ulasilmaktadir. Eger Main'de CustomerManager'a StudentManager
	//objesi verilirse kodlar CustomerManger'da bulunan metodlarin altindan burada ki override edilen metodlara dallanacak.
	//Override edilmeyen metodlar ise sadece StudentManager class'ına yani sadece student'a has metodlardir. Bu metodlara
	//ulasilmak istenirse Mainde direkt olarak StudentManager'dan olustrudugumuz obje vasitasiyla ulasilmalidir.
	
	@Override
	public void login(User user) {
		System.out.println(user.userName+" ile giris yapildi.");
	}
	
	@Override
	public void remindPassword(User user) {
		System.out.println(user.userName+" ogrencisinin sifresi "+user.password+" 'dir");
	}
	
	@Override
	public void signUp(User user) {
		System.out.println(user.userName+" ogrencisi "+user.password+" sifresi ile kayit oldu.");
	}
	
	//Ortak olmayan metodlara bakildiginda calisma mantigi acisindan benzer metodlar InstructorManager
	//icerisinde ortak olmayan metodlar kisminda mevcuttur. Calisma mantigi ve amaclari bire bir aynidir
	//sadece parametre isimleri , ozellik isimleri ve kisi nesnesi farklilik gostermektedir.
	
	public void addHomerwork(Student student,String homework) {
		student.homeworks.add(homework);
		student.homeworkNumber+=1;
	}
	
	public void addMultipleHomework(Student student,String[] homeworks) {
		
		for (String homework : homeworks) {
			addHomerwork(student, homework);
		}
		
	}
	
	public int paymentIncrease(Student student,int increase) {
		
		return student.payment+=increase;
		
	}
	
	public int paymentDecrease(Student student,int decrease) {
		
		if(student.payment-decrease>=0) {
			student.payment-=decrease;
		}
		else {
			System.out.println("Ogrencinin odeyecegi ucret 0'dan dusuk olamaz!!!!");
		}
		return student.payment;
		
	}
	
	

}
