package oopSoyutlamaOdev;

import java.util.ArrayList;

public class Instructor extends User{
	
	//Bu class'in altinda Instructor class'inin sahip oldugu ozellikler bulunmaktadir. getterlar ile bu class'in sahip oldugu
	//ozellikleri Main'de yazdirabileceğim. super(name,password) ile Instructor class'imda bulunan constructor'imda base'de ki
	//yani User class'inda ki ozelliklerin atamasini burada da yapmis oluyorum bir nevi. (User constructor'inda bu atamalar
	//yapildi super ile bir nevi bu atamalarin base sinifinin constructor'inda yapildigini soyluyorum.)
	
	int salary;
	int certificateNumber;
	int courseNumber;
	ArrayList<String> certificates;
	
	public Instructor(String name, String password, int salary, int certificateNumber, int courseNumber,
			ArrayList<String> certificates) {
		super(name, password);
		this.salary = salary;
		this.certificateNumber = certificateNumber;
		this.courseNumber = courseNumber;
		this.certificates = certificates;
	}

	public int getSalary() {
		return salary;
	}

	public int getCertificateNumber() {
		return certificateNumber;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public ArrayList<String> getCertificates() {
		return certificates;
	}

}
