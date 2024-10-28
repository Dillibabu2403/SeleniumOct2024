package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsString {

	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		String[] arr = text.split(" ");
        Set<String> s = new LinkedHashSet<String>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        for(String ss:s){
            System.out.print(ss+" ");
        }
        System.out.println();
	}
}