package week1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Library lm=new Library();
String bk = lm.addBook("Wings of Fire");
System.out.println(bk);
lm.issueBook();
	}

}
