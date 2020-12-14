package javapractise;

public class ConstructorChain {

	ConstructorChain(){
		this("Hello");
		System.out.println("Default Base");
	}

	ConstructorChain(String string) {
		System.out.println("Overloaded Base "+string);
	}
	
}
