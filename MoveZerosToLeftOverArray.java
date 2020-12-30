package javapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoveZerosToLeftOverArray {

	public static void main(String[] args) {
		/**java program to move all the 0 to right
			int[] values = {4,0,3,1,0,1,0}
			Expected Output: 4,3,1,1,0,0,0**/
		//integer array
		int[] values= {4,0,3,1,0,1,0};
		Integer[] value=new Integer[values.length];
		for(int i=0;i<values.length;i++)
			value[i]=values[i];
		
		//creating a list
		List<Integer> numbers=new ArrayList<Integer>();
		for(int n:values)
			numbers.add(n);
		
		
		//method-1: using arrays
		Arrays.sort(value,Collections.reverseOrder());
		for(int x:value)
			System.out.print(x);
		
		
		//method-2: using list
		Collections.sort(numbers);
		Collections.reverse(numbers);
		System.out.println("\n"+numbers);
		
		
		
		
	}
}
