package javapractise;

import java.util.Scanner;

public class RemoveVowels {
public static void main(String[] args) {
	System.out.println("Enter a string with vowels letters in it");
	@SuppressWarnings("resource")
	String s=new Scanner(System.in).nextLine();//"I am a software automation tester";
	char[] ch = s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
			ch[i]=' ';
		}
	}
	
	System.out.println(ch);
	
}
}
