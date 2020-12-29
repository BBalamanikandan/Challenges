package javapractise;

import java.util.Scanner;

public class OddOrEvenWithoutDivOrMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number");
		@SuppressWarnings("resource")
		int n=new Scanner(System.in).nextInt();
		System.out.println(((n&1)==0)?"Even":"Odd");
	}

}
