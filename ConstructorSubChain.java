package javapractise;

public class ConstructorSubChain extends ConstructorChain{

	
	ConstructorSubChain(){
		super();
		System.out.println("Child Default");
	}
	
	ConstructorSubChain(String str){
		this();
		System.out.println("Child Overloaded "+str);
	}
}
