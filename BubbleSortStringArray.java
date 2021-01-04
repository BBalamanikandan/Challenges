package javapractise;

public class BubbleSortStringArray {

	public static void main(String[] args) {

		String str[] = { "Naveen", "Hari", "Sam", "Legend", "Mohan"};
		String tmp;
		
		for(int i=0;i<str.length;i++) {
			//iterate i from 1 to n
			for(int j=i+1;j<str.length;j++) {
				//iterate j from 2 to n for each i
				if(str[i].compareTo(str[j])>0){
					//compare two strings to know which is bigger as compareTo() dedicated to do so
					tmp=str[j];
					str[j]=str[i];
					str[i]=tmp;
					//if 1st string is bigger than next string keep swapping them
				}
			}
			//once 'i' iterated for all 'j' then printing i here itself to avoid separate loop to print the sorted array
			System.out.println(str[i]);
		}
		
	}
}
