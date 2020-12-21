package javapractise;

import java.util.Scanner;

public class RemoveHTMLTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string with html tag");
		@SuppressWarnings("resource")
		String s=new Scanner(System.in).nextLine();
		int ind1=s.indexOf(">");
		int ind2=s.lastIndexOf("<");
		System.out.println(s.substring(ind1+1,ind2));
	}

}
