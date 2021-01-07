package javapractise;

import java.util.Scanner;

public class StringReverseWithoutStringFunction {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		@SuppressWarnings("resource")
		String st=new Scanner(System.in).nextLine();
		char[] chArr=st.toCharArray();
		for(int i=chArr.length-1;i>=0;i--) {
			System.out.print(chArr[i]);
		}
	}

}
