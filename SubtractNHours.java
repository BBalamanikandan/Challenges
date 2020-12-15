package javapractise;

import java.time.LocalDateTime;
import java.util.Scanner;

public class SubtractNHours {
@SuppressWarnings("resource")
public static void main(String[] args) {
	LocalDateTime t1=LocalDateTime.now();
	System.out.println(t1);
	System.out.println("How many hours do you wanna subtract current date/time???");
	int h = new Scanner(System.in).nextInt();
	System.out.println(t1.minusHours(h));
	
}
}
