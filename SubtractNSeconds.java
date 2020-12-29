package javapractise;

import java.time.LocalDateTime;
import java.util.Scanner;

public class SubtractNSeconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime t1=LocalDateTime.now();
		System.out.println(t1);
		System.out.println("How many seconds do you wanna subtract current date/time???");
		@SuppressWarnings("resource")
		int s = new Scanner(System.in).nextInt();
		System.out.println(t1.minusSeconds(s));
	}

}
