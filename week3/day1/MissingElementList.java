package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MissingElementList {

	public static void main(String[] args) {
		Integer[] inputs ={1,2,3,4,10,6,8};
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(inputs));
		Collections.sort(numbers);
		System.out.println(numbers);
		int first = numbers.get(0);
		int last  = numbers.get(numbers.size()-1);
		for(int i=first+1; i<last; i++){
		    if(!numbers.contains(i)) {
				System.out.println("Number Not in List : "+i);
			}
		}}}
