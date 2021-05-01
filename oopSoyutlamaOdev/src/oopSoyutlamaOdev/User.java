package oopSoyutlamaOdev;

public class User {
	
	//Tum kullaniclarin sahip oldugu ortak ozellikler bu classin icinde bulunmaktadir. Bu tum classlar icin bir base class'dir.
	//Burada var olan ortak ozellikler icin getterlari tanimalamak onemli. Bu class extend eden User classlari'da otomatikman
	//buradaki getterlara da sahip olacaktir. Yani ben Main'De student.getUserName veya instructor.getPassword dedigimde
	//Student ve Instructor classlari bu class'i extend ettigi icin hata almayacagim. (student ve instructor Student ve Instructor
	//class'indan urettigim objeler.)
	
	String userName;
	String password;
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

}
//base class
