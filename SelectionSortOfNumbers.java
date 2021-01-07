package javapractise;

import java.util.Scanner;

public class SelectionSortOfNumbers {

	public static void main(String[] args) {
		System.out.println("How many elements?");
		Scanner sc=new Scanner(System.in);
		int max=sc.nextInt();
		
		int[] arr=new int[max];
		
		System.out.println("Enter elements one by one.....");
		for(int i=0;i<max;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<max;i++) {
			for(int j=i+1;j<max;j++) {
				if(arr[i]>arr[j]) {
					int t=arr[j];
					arr[j]=arr[i];
					arr[i]=t;
				}
			}
		}
		
		
		for(int x:arr) {System.out.print(x+"\t");}
		sc.close();

	}

}
