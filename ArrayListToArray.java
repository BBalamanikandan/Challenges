package javapractise;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		List<Integer> numbers=new ArrayList<Integer>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
       
        List<String> strings=new ArrayList<String>();
        strings.add("Java");
        strings.add("And");
        strings.add("Selenium");
        strings.add("Practise");
        strings.add("At");
        strings.add("TestLeaf");
        
        Object[] n=numbers.toArray();
        for(Object x:n) {
        	System.out.print(x);
        }
        System.out.println();
        Object[] s = strings.toArray();
        for(Object x:s) {
        	System.out.print(x);
        }
	}

}
