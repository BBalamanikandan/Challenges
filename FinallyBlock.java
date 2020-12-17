package javapractise;

public class FinallyBlock {

	public String m1() {
		
		try {
			return "test";
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("finally");
		}
		
		return "end";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new FinallyBlock().m1());
	}

}
