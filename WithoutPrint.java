package javapractise;

import java.io.IOException;
import java.util.Scanner;

public class WithoutPrint {
	public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	String x=sc.nextLine();
	System.out.write(x.getBytes());
	sc.close();
}
}
