package oopSoyutlamaOdev;

import java.util.ArrayList;

public class Student extends User{
	
	//Bu class'in altinda Student class'inin sahip oldugu ozellikler bulunmaktadir. getterlar ile bu class'in sahip oldugu
	//ozellikleri Main'de yazdirabileceğim. super(name,password) ile Student class'imda bulunan constructor'imda base'de ki
	//yani User class'inda ki ozelliklerin atamasini burada da yapmis oluyorum bir nevi. (User constructor'inda bu atamalar
	//yapildi super ile bir nevi bu atamalarin base sinifinin constructor'inda yapildigini soyluyorum.)
	
	int payment;
	int examNumber;
	int homeworkNumber;
	ArrayList<String> homeworks;
	
	public Student(String name, String password, int payment, int examNumber, int homeworkNumber, ArrayList<String> homeworks) {
		super(name, password);
		this.payment = payment;
		this.examNumber = examNumber;
		this.homeworkNumber = homeworkNumber;
		this.homeworks = homeworks;
	}

	public int getPayment() {
		return payment;
	}

	public int getExamNumber() {
		return examNumber;
	}

	public int getHomeworkNumber() {
		return homeworkNumber;
	}

	public ArrayList<String> getHomeworks() {
		return homeworks;
	}

	
	
	
 
}
