package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		
String test="changeme";
int len=test.length();
for(int i=0;i<test.length();i++) {
	 char ch = test.charAt(i);
	 if (i % 2 == 0) {
	        System.out.print(Character.toLowerCase(ch));
	    } else {
	        System.out.print(Character.toUpperCase(ch));
	    }
	}
	 
}
}