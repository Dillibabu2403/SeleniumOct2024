package week2.day3;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("Username");
	}
	
	public void enterPassword() {
		System.out.println("Password");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LoginTestData lt=new LoginTestData();
lt.enterCredentials();
lt.navigateToHomePage();
lt.enterUsername();
lt.enterPassword();
	}

}
