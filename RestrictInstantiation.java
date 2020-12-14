package javapractise;

public class RestrictInstantiation {

	static int c=0;
	
	RestrictInstantiation() {
		c++;
	}
	
	static RestrictInstantiation createInstance() {
		if(c<3) {
			System.out.println("test"+c);
			new RestrictInstantiation();
		}
		return null;
	}
	
}
