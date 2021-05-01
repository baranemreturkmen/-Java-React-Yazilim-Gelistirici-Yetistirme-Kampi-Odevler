package oopSoyutlamaOdev;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Instructor nesnesinin bir ozelligi arraylist oldugundan burada bir arraylist olusturdum ve arraylist'e degerler atadim.
		ArrayList<String> enginHocaSertifikalar = new ArrayList<String>();
		enginHocaSertifikalar.add("1. Sertifika");
		enginHocaSertifikalar.add("2. Sertifika");
		enginHocaSertifikalar.add("3. Sertifika");
		enginHocaSertifikalar.add("4. Sertifika");
		enginHocaSertifikalar.add("5. Sertifika");
		
		//Instructor class'ından bir tane obje olusturdum.
		Instructor instructor = new Instructor("Engin Hoca", "Spagetti", 6000,
				enginHocaSertifikalar.size(), 7, enginHocaSertifikalar);
		
		//Olusturdugum objenin ozelliklerine constructor vasitasiyla atadigim degerler geliyor mu diye bakiyorum.
		System.out.println(instructor.getCertificateNumber());
		System.out.println(instructor.getCourseNumber());
		System.out.println(instructor.getPassword());
		System.out.println(instructor.getUserName());
		System.out.println(instructor.getSalary());
		System.out.println(instructor.getCertificates());
		
		//Sadece Instructor nesnelerine ait olan islemler InstructorManager class'i ile yapilacak
		//Student ve Instructor nesnelerinin sahip oldugu ortak islemler CustomerManager'daki metodlar
		//vasitasiyla gerceklestirilecek.
		InstructorManager instructorManager = new InstructorManager();
		
		//Manager classlarım icin olusturdugum base class'ım UserManager class'ı . InstructorManager
		//ve StudentManager classları UserManager classlarini extend ediyor. CustomerManager class'ı 
		//benden bir tane UserManager objesi istiyor bu durumda burada InstructorManager veya StudentManager
		//objesi kullanabilirim.
		CustomerManager customerManager = new CustomerManager(instructor);
		
		//Ortak metodlarima CustomerManager'dan olusturdugum customerManager objesi ile erisiyorum. Bunlar
		//login remindPassword signUp olmak uzere her kullanicida ortak olarak bulunan metodlar.
		customerManager.login(instructorManager);
		customerManager.remindPassword(instructorManager);
		customerManager.signUp(instructorManager);
		
		//InstuctorManager'dan olusturdugum instructorManager objesinde sadece InstructorManager class'ına 
		//ait ozellikleri calistiriyorum.
		
		//instructor'a bir tane daha sertifika ekliyorum
		instructorManager.addCertificate(instructor, "6. Sertifika");
		System.out.println(instructor.getCertificateNumber());
		
		//instructor'a ayni anda birden fazla sertifika ekliyorum
		String[] addedCertificates = {"7. Sertifika","8. Sertifika","9. Sertifika"};
		instructorManager.addMultipleCertificate(instructor,addedCertificates);
		System.out.println(instructor.getCertificateNumber());
		System.out.println(instructor.getCertificates());
		
		//instructor maasini arttriyorum
		System.out.println(instructorManager.salaryIncrease(instructor, 500));
		
		System.out.println("-------------------------------------------");
		
		//Yukarida yapilan aciklamalar asagida student ve studentManager classlari ile
		//yapilan calismalarda aynen gecerlidir. Sadece class isimleri ,ozellik isimleri
		//ve ozelliklere verilen degerler degisti genel mantik ayni.
		ArrayList<String> ogrenciOdevler = new ArrayList<String>();
		ogrenciOdevler.add("1. Odev");
		ogrenciOdevler.add("2. Odev");
		ogrenciOdevler.add("3. Odev");
		ogrenciOdevler.add("4. Odev");
		ogrenciOdevler.add("5. Odev");
		
		Student student = new Student("Emre","12345",300,8,ogrenciOdevler.size(),ogrenciOdevler);
		System.out.println(student.getHomeworkNumber());
		System.out.println(student.getExamNumber());
		System.out.println(student.getPassword());
		System.out.println(student.getUserName());
		System.out.println(student.getPayment());
		System.out.println(student.getHomeworks());
		
		StudentManager studentManager = new StudentManager();
		
		
		CustomerManager customerManager2 = new CustomerManager(student);
		customerManager2.login(studentManager);
		customerManager2.remindPassword(studentManager);
		customerManager2.signUp(studentManager);
		
		instructorManager.addCertificate(instructor, "6. Odev");
		System.out.println(instructor.getCertificateNumber());
		
		String[] addedHomeworks = {"7. Odev","8. Odev","9. Odev"};
		studentManager.addMultipleHomework(student, addedHomeworks);
		System.out.println(student.getHomeworkNumber());
		System.out.println(student.getHomeworks());
		
		System.out.println(studentManager.paymentDecrease(student, 100));
		
		
	}

}
