package javapractise;

import java.util.Scanner;

public class PascalTriangaleofNumbers {
	
	public static void printPascal(int n) 
	{ 
	    for(int line = 1; line <= n; line++) 
	    { 
	          
	    int C=1;// used to represent C(line, i) 
	    for(int i = 1; i <= line; i++) 
	    {  
	        // The first value in a line is always 1 
	        System.out.print(C+" "); 
	        C = C * (line - i) / i;  
	    } 
	    System.out.println(); 
	    } 
	} 
	  
	// Driver code 
	public static void main(String[] args) { 
		System.out.println("Enter number of rows....");
		@SuppressWarnings("resource")
		int n=new Scanner(System.in).nextInt();
	    printPascal(n); 
	}  
}

