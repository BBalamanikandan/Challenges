package javapractise;

import java.util.Scanner;



public class CountVowelsConsonants {

	public static void main(String[] args) {
		int v=0,c=0;
		System.out.println("Enter an string to count vowels and consonants: ");
		@SuppressWarnings("resource")
		String st=new Scanner(System.in).nextLine();
		for(int i=0;i<st.length();i++) {
			if((st.charAt(i)=='a') || (st.charAt(i)=='e') || (st.charAt(i)=='i') || (st.charAt(i)=='o') || (st.charAt(i)=='u'))
				v+=1;
			else
				c+=1;
		}
		
		System.out.println(v+" vowels present in given string");
		System.out.println(c+" consonants present in given string");
	}

}
