package week1.day3;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	public void issueBook() {
			System.out.println("Book issued successfully");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Library lb=new Library();
String book = lb.addBook("வேள்பாரி");
System.out.println(book);
lb.issueBook();
	}

}
