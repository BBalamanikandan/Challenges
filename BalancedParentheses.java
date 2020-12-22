package javapractise;

import java.util.Scanner;

public class BalancedParentheses {
public static void main(String[] args) {
	System.out.println("Enter a string to check balanced parentheses or not");
	@SuppressWarnings("resource")
	String st=new Scanner(System.in).nextLine();
	if((st.contains("{")&&st.contains("}")&&(st.indexOf("{")<st.indexOf("}"))) || (st.contains("[")&&st.contains("]")&&(st.indexOf("[")<st.indexOf("]"))) || (st.contains("(")&&st.contains(")")&&(st.indexOf("(")<st.indexOf(")")))){
		System.out.println("properly balanced with parentheses");
	}else {
		System.out.println("Its a normal string with unbalanced/no parentheses");
	}
	
}
}
