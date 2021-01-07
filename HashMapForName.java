package javapractise;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapForName {

	public static void main(String[] args) {
		
		HashMap<String,String> nameDir=new HashMap<String,String>();
		String ans=null;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Enter firstname...");
			String fna=sc.nextLine();
			System.out.println("Enter lastname...");
			String lna=sc.nextLine();
			nameDir.put(fna, lna);
			System.out.println("Do you wanna add more name(Y/N)?");
			ans=sc.nextLine();
		}while(ans.equals("Y"));
		
		sc.close();
		
		for(String k:nameDir.keySet()) {
				System.out.println(k+","+nameDir.get(k));
		}
	}

}
