package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestNumberUsingList {

	public static void main(String[] args) {
		Integer[] inputs ={3,2,11,4,6,7};
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(inputs));
        Collections.sort(numbers);
        System.out.println(numbers);
        int sz = numbers.size();
       System.out.println(numbers.get(sz-2));
        
}

}
