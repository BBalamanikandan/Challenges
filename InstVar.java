package javapractise;

public class InstVar {
	String st;
void setInstVar(String x) {
	this.st=x;
}
String getInstVar() {
	return st;
}
public static void main(String[] args) {
	InstVar ins=new InstVar();
	ins.setInstVar("10");
	System.out.println(ins.getInstVar());
}
}
