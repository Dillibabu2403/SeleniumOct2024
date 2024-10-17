package week1.day3;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String word = "1221";
		String rev="";
		for (int i = word.length()-1; i>=0; i--) {
			rev = rev+word.charAt(i);
		}
		System.out.println(rev);
		if(word.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
			}

		}
