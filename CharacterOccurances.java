package javapractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CharacterOccurances {

	public static void main(String[] args) {
		
		/**
		 * occurance of each character of the given String 
			String str = "Welcome to Chennai"
				Expected Output: 
					W - 1
					e - 2
					l - 1
					c - 1
					o - 2
					m - 1
					t - 1
		 * 
		 */
		
		
		String str="Welcome to Chennai";
		
		//method-1 using map key,value pair where key represents character, value represents number of occurances
	      HashMap <Character, Integer> hMap = new HashMap<>();
	      for (int i = str.length() - 1; i>= 0; i--) {
	         //to check whether character was there already in map or not
	    	  if (hMap.containsKey(str.charAt(i))) {
	    	//if character already there then retrieving count 	  
	            int count = hMap.get(str.charAt(i));
	         //adding <k,c> as <char,count>   
	            hMap.put(str.charAt(i), ++count);
	         } else {
	        	//if character was not present already then that character directly added with value count as 1 
	            hMap.put(str.charAt(i),1);
	         }
	      }
	      //output
	      System.out.println(hMap+"\n");
		
		//method-2 to check each character and count
	      
	    //array list created with unique characters  
		List<Character> chars=new ArrayList<Character>();
		for(int i=0;i<str.length();i++) {
			if(!(chars.contains(str.charAt(i)))){
				chars.add(str.charAt(i));
			}
		}
		//System.out.println(chars);
		
		//list iterated upto the size, compared and counted each character from list over string then prints the result
		for(int i=0;i<chars.size();i++) {
			int c=0;
			for(int j=0;j<str.length();j++) {
				if(chars.get(i)==str.charAt(j)) {
					c+=1;
				}
			}
			System.out.println(chars.get(i)+" presence "+c+" time(s) in given string");
		}
		
	}

}
