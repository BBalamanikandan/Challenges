package javapractise;

import java.util.Scanner;

public class ReverseInteger {
	
	public static int revNum(int x) {
		int n=0;
		while(x>0) {
			n=n*10+(x%10);
			x/=10;
		}
		return n;
	}

	public static void main(String[] args) {
		System.out.println("Enter an integer...");
		try {
		@SuppressWarnings("resource")
		int no=new Scanner(System.in).nextInt();
		System.out.println(revNum(no));		
		}catch(Exception e) {
			System.out.println("its non-integer!!!");
		}
	}

}
