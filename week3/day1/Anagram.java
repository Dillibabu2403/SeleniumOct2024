package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
	    String text2 = "potss";
	    text1 = text1.toLowerCase();
	    text2 = text2.toLowerCase();
	    if(text1.length() == text2.length()) {
	      char[] array1 = text1.toCharArray();
	      char[] array2 = text2.toCharArray();
	      Arrays.sort(array1);
	      Arrays.sort(array2);
	      if (String.valueOf(array1).equals(String.valueOf(array2))) {
	            System.out.println("The given strings are Anagram");
	        } else {
	            System.out.println("The given strings are not an Anagram");
	        }
			}
	    }
}