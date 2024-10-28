package week3.day1;

public class ReverseOddWordsString {

	public static void main(String[] args) {
		String str = "I am a software tester";
		String[] split = str.split(" ");
		int length = split.length;
		String temp=" ";
		String str2 = " ";
		for(int i=0; i<length;i++) {
			if(i%2!=0) {
				char[] charArray = split[i].toCharArray();
				int length2 = charArray.length;
				for(int j=length2-1; j>=0; j--) {
				 temp = temp + charArray[j];	
				}
				split[i]=temp;
				}
			
		}
		for(int i=0;i<length;i++) {
			str2 = str2+split[i]+" ";
			
		}
		System.out.println("Odd indexed words reversed: "+str2);

	}

}
