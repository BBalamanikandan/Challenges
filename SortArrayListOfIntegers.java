package javapractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayListOfIntegers {
public static void main(String[] args) {
	List<Integer> numbers=new ArrayList<Integer>();
    numbers.add(90);
    numbers.add(30);
    numbers.add(20);
    numbers.add(50);
    numbers.add(60);
    numbers.add(10);
    Collections.sort(numbers);
    System.out.println(numbers);
}
}
