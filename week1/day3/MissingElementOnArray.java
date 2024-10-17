package week1.day3;

import java.util.Arrays;

public class MissingElementOnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,4,3,2,8,6,7};
		Arrays.sort(numbers);
		int numbersArrayIndex = 0;
		for (int i = 1; i < numbers[numbers.length - 1]; i++) {
		    if (i == numbers[numbersArrayIndex]) {
		        numbersArrayIndex++;
		    }
		    else {
		        System.out.println(i);
		    }
		}
	
}
}
