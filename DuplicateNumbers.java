package javapractise;

import java.util.Scanner;

public class DuplicateNumbers {
public static void main(String[] args) {
	
	System.out.println("enter an number with duplicated digits");
	@SuppressWarnings("resource")
	String s=new Scanner(System.in).nextLine();
	
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j)) {
				System.out.println("duplicated "+s.charAt(i));
				break;
			}
		}
	}
	
}
}