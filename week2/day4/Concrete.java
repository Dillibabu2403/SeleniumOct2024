package week2.day4;

public class Concrete implements DatabaseConnection {
//Implemented the below abstract methods
	@Override
	public void connect() {
		System.out.println("Connect with Facebook");
		
	}

	@Override
	public void disConnect() {
	System.out.println("Disconnect from the Videocall");
		
	}

	@Override
	public void executeUpdate() {
	System.out.println("Chrome updates are underway");	
	}
	
	public static void main(String[] args) {
	Concrete co=new Concrete();
	co.connect();
	co.disConnect();
	co.executeUpdate();

	}


}
